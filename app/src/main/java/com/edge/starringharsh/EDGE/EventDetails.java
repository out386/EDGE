package com.edge.starringharsh.EDGE;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.ui.ContactsView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.Calendar;

public class EventDetails extends BaseActivity {

    TextView tvDet, tvUpcoming, tvRules, tvDetails;
    ImageButton bReminder;
    ImageView iv;
    LinearLayout llUpcoming, llcontacts;
    String name, det, linkadd, details, cont1, cont2, up;
    int date, month, hr, min;
    String phn1, phn2;
    int p=0;
    Calendar cal, calR;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Master master;
    ProgressDialog progress;
    Rules rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_event_details);

        master = new Master();
        rules = new Rules();

        sharedPreferences = getSharedPreferences("EventsChoice", Context.MODE_PRIVATE);
        name = sharedPreferences.getString("Name", "not found");
        editor = sharedPreferences.edit();


        System.out.println(name);

        init();
        int img = master.eventsImg.get(name);
        iv.setImageResource(img);
        tvDetails.setText(name);


        linkadd = master.link.get(name);


        tvDet.setText(det);
        tvDet.setMovementMethod(LinkMovementMethod.getInstance());

        new BackFetch().execute();


    }

    void init()
    {
        progress = new ProgressDialog(this);
        tvDet = (TextView) findViewById(R.id.tvDetailsDet);
        tvRules = (TextView) findViewById(R.id.tvRules);
        tvDetails = (TextView) findViewById(R.id.tvDetails);
        tvUpcoming = (TextView) findViewById(R.id.tvDetailsUpcoming);
        llUpcoming = (LinearLayout) findViewById(R.id.llDetailsUpcoming);
        llcontacts = (LinearLayout) findViewById(R.id.contacts_layout);
                bReminder = (ImageButton) findViewById(R.id.bDetailsUpcoming);
        iv = (ImageView) findViewById(R.id.ivDetails);
    }



    class BackFetch extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progress.setIndeterminate(false);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.setCancelable(true);
            progress.setMessage("Fetching Information...");
            progress.show();
            System.out.println("PRE");
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                URL url = new URL(linkadd);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str, newDet="";
                while ((str = br.readLine()) != null) {
                    newDet += str + "\n";
                }
                br.close();
                det = newDet;
                editor.putString(name, newDet);
                editor.commit();
            } catch (Exception e) {
                System.out.println("Failed");
                det = sharedPreferences.getString(name, master.eventDetails.get(name));
                //e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            System.out.println("POST");
            super.onPostExecute(aVoid);
            progress.dismiss();
            BufferedReader br = new BufferedReader(new StringReader(det));

            try {
                details =  br.readLine();
                cont1 =  br.readLine();
                phn1 = br.readLine();
                cont2 =  br.readLine();
                phn2 = br.readLine();
                up =  br.readLine();
                date = Integer.parseInt(br.readLine());
                month = Integer.parseInt(br.readLine());
                hr = Integer.parseInt(br.readLine());
                min = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            tvRules.setText(Html.fromHtml(getString(rules.rules.get(name))));

            tvDet.setText(details);
            if ("".equals(cont1)) {
                LinearLayout ll = (LinearLayout) findViewById(R.id.contacts_layout);
                ll.setVisibility(View.GONE);
            } else {
                llcontacts.addView(new ContactsView(EventDetails.this, cont1, phn1));
                if (! phn1.equals(phn2)) {
                    llcontacts.addView(new ContactsView(EventDetails.this, cont2, phn2));
                }
            }

            if(up.equalsIgnoreCase("Y"))
            {
            cal = Calendar.getInstance();
            int dateS = cal.get(Calendar.DATE);
            int monthS = cal.get(Calendar.MONTH);
            int hrS = cal.get(Calendar.HOUR);
            int minS = cal.get(Calendar.MINUTE);
            calR = Calendar.getInstance();
            calR.set(2017, month, date, hr, min);
            if(cal.getTimeInMillis() < calR.getTimeInMillis())
            {
                llUpcoming.setVisibility(View.VISIBLE);
                tvUpcoming.setText((""+String.format("%02d",date) + "/" + String.format("%02d",(month+1)) + "/2017 " + String.format("%02d",hr) + ":" + String.format("%02d",min)));
                bReminder.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) { 
                        Intent intent = new Intent(Intent.ACTION_EDIT);
                        intent.setType("vnd.android.cursor.item/event");
                        intent.putExtra("beginTime", calR.getTimeInMillis());
                        intent.putExtra("allDay", false);
                        intent.putExtra("endTime", calR.getTimeInMillis()+120*60*1000);
                        intent.putExtra("title", "Reminder for event: " + name);
                        startActivity(intent);
                    }
                });
                }
            }

        }
    }

    }
