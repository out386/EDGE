package com.edge.starringharsh.EDGE.events;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.BaseActivity;
import com.edge.starringharsh.EDGE.Master;
import com.edge.starringharsh.EDGE.R;
import com.edge.starringharsh.EDGE.model.ContactsModel;
import com.edge.starringharsh.EDGE.ui.ContactsView;
import com.edge.starringharsh.EDGE.utils.SnackbarUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Calendar;
import java.util.List;

import static com.edge.starringharsh.EDGE.utils.FormatUtils.splitContacts;

public class EventDetails extends BaseActivity {

    private static final String LAST_KNOWN_EVENT_VERSION = "lkeVer";
    static final String EVENT_NAME = "eventName";

    private TextView tvDet, tvUpcoming, tvRules, tvDetails;
    private ImageButton bReminder;
    private ImageView iv;
    private LinearLayout llUpcoming, llcontacts;
    private String name, linkadd, up;
    private int date, month, hr, min;
    private int p = 0;
    private Calendar cal, calR;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Master master;
    private Rules rules;
    private String eventData;

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        master = new Master();
        rules = new Rules();
        EventsUpdateUtils eventsUpdateUtils = new EventsUpdateUtils();

        name = getIntent().getStringExtra(EVENT_NAME);
        if (name == null) {
            // The world is ending. PANIC!
            finish();
        }

        sharedPreferences = getSharedPreferences(name, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        init();
        int img = master.eventsImg.get(name);
        iv.setImageResource(img);
        tvDetails.setText(name);

        linkadd = String.format(Master.EVENT_LINK_FORMAT, name);
        tvDet.setMovementMethod(LinkMovementMethod.getInstance());

        eventData = readFromCache();
        setData(false);

        eventsUpdateUtils.isCacheValid(tvDet,
                sharedPreferences.getString(LAST_KNOWN_EVENT_VERSION, "0"),
                new OnCacheCheckListener());

    }

    void init() {
        tvDet = findViewById(R.id.tvDetailsDet);
        tvRules = findViewById(R.id.tvRules);
        tvDetails = findViewById(R.id.tvDetails);
        tvUpcoming = findViewById(R.id.tvDetailsUpcoming);
        llUpcoming = findViewById(R.id.llDetailsUpcoming);
        llcontacts = findViewById(R.id.contacts_layout);
        bReminder = findViewById(R.id.bDetailsUpcoming);
        iv = findViewById(R.id.ivDetails);
    }

    private class OnCacheCheckListener implements EventsUpdateUtils.OnCacheCheckListener {
        @Override
        public void onComplete(boolean isCacheValid, String cacheVersion) {
            runOnUiThread(() -> {
                Log.i("EventDetails", "cache valid: " + isCacheValid + ", version " + cacheVersion);
                if (!isCacheValid) {
                    SnackbarUtils.showNoDuplicate(tvDet, R.string.data_loading);
                    new BackFetch(cacheVersion).execute();
                } else {
                    SnackbarUtils.dismiss();
                }
            });
        }
    }

    private class BackFetch extends AsyncTask<Void, Void, String> {
        String newVersion;

        BackFetch(String newVersion) {
            this.newVersion = newVersion;
        }

        @Override
        protected String doInBackground(Void... voids) {
            try {
                URL url = new URL(linkadd);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String line;
                StringBuilder allLines = new StringBuilder(5000);
                while ((line = br.readLine()) != null) {
                    allLines.append(line).append("\n");
                }
                br.close();
                // TODO: Deserialize directly here into a Serializable model. Will remove the need to iterate over this again
                String res = allLines.toString().trim();
                editor.putString(name, res)
                        .putString(LAST_KNOWN_EVENT_VERSION, newVersion)
                        .apply();
                return res;
            } catch (FileNotFoundException e) {
                // Don't try to get this file again unless the version number changes
                editor.putString(LAST_KNOWN_EVENT_VERSION, newVersion)
                        .apply();
                SnackbarUtils.dismiss();
                return null;
            } catch (Exception e) {
                SnackbarUtils.dismiss();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if (result != null) {
                if (!eventData.equals(result)) {
                    eventData = result;
                    SnackbarUtils.showRefresh(tvDet, R.string.data_new_available, R.string.data_refresh,
                            v -> setData(true));
                } else {
                    SnackbarUtils.dismiss();
                }
                handleUp();
            }
        }
    }

    private void handleUp() {
        if (up.equalsIgnoreCase("Y")) {
            cal = Calendar.getInstance();
            int dateS = cal.get(Calendar.DATE);
            int monthS = cal.get(Calendar.MONTH);
            int hrS = cal.get(Calendar.HOUR);
            int minS = cal.get(Calendar.MINUTE);
            calR = Calendar.getInstance();
            calR.set(2017, month, date, hr, min);
            if (cal.getTimeInMillis() < calR.getTimeInMillis()) {
                llUpcoming.setVisibility(View.VISIBLE);
                tvUpcoming.setText(("" + String.format("%02d", date) + "/" + String.format("%02d", (month + 1)) + "/2017 " + String.format("%02d", hr) + ":" + String.format("%02d", min)));
                bReminder.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_EDIT);
                        intent.setType("vnd.android.cursor.item/event");
                        intent.putExtra("beginTime", calR.getTimeInMillis());
                        intent.putExtra("allDay", false);
                        intent.putExtra("endTime", calR.getTimeInMillis() + 120 * 60 * 1000);
                        intent.putExtra("title", "Reminder for event: " + name);
                        startActivity(intent);
                    }
                });
            }
        }
    }

    private String readFromCache() {
        // TODO: Move away from this shitty way and just put the data in a POJO to begin with, for the cache
        StringBuilder allLines = new StringBuilder(5000);
        allLines.append(sharedPreferences.getString(name, ""));

        if ("".equals(allLines.toString())) {
            // As data not updated just now, or read from sharedprefs, don't have rules in it.
            allLines.append(master.eventDetails.get(name))
                    .append(getString(rules.rules.get(name)));
        }
        return allLines.toString();
    }

    private void setData(boolean showSnackbar) {
        System.out.println("Updating data");
        String[] lines = eventData.split("\n");
        List<ContactsModel> contacts = null;
        String shortDesc = lines[0];
        contacts = splitContacts(lines[1], lines[2]);
        up = lines[3];
        date = Integer.parseInt(lines[4]);
        month = Integer.parseInt(lines[5]);
        hr = Integer.parseInt(lines[6]);
        min = Integer.parseInt(lines[7]);
        String longDesc = lines[8];
        // Happily assume that the entire data is useless and crash and burn in case of AIOOB.
        // TODO: Maybe tell the user something crapped out instead of FC-ing. Just kidding, app's bad enough for me not to care, anyway.

        tvRules.setText(Html.fromHtml(
                longDesc == null ? getString(rules.rules.get(name)) : longDesc));
        if (shortDesc == null || "".equals(shortDesc))
            tvDet.setVisibility(View.GONE);
        else
            tvDet.setText(Html.fromHtml(shortDesc));

        llcontacts.removeAllViews();
        if (contacts == null || contacts.size() == 0) {
            LinearLayout ll = (LinearLayout) findViewById(R.id.contacts_layout);
            ll.setVisibility(View.GONE);
        } else {
            for (ContactsModel contact : contacts)
                llcontacts.addView(new ContactsView(EventDetails.this, contact));
        }

        if (showSnackbar)
            SnackbarUtils.showTemporary(tvDet, R.string.data_refresh_done);
    }

}
