package com.edge.starringharsh.EDGE;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.utils.ButtonUtils;
import com.edge.starringharsh.EDGE.utils.FormatUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ResultsDetails extends BaseActivity {

    static final String RESULT_NAME = "resultName";
    static final String RESULT_URL = "resultUrl";

    String eventUrl;
    String eventName;
    ProgressDialog progress;
    LinearLayout topLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        topLayout = findViewById(R.id.results_top_ll);
        progress = new ProgressDialog(this);

        Intent intent = getIntent();
        if (intent == null) {
            //TODO: Start screaming
            return;
        }

        eventUrl = intent.getStringExtra(RESULT_URL);
        eventName = intent.getStringExtra(RESULT_NAME);

        TextView nameTv = findViewById(R.id.results_name);
        nameTv.setText(eventName);
        new BackFetch().execute();


    }

    class BackFetch extends AsyncTask<Void, Void, List<Pair<String, String>>> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progress.setIndeterminate(false);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.setCancelable(true);
            progress.setMessage("Fetching Information...");
            progress.show();
        }

        @Override
        protected List<Pair<String, String>> doInBackground(Void... voids) {
            try {
                URL url = new URL(eventUrl);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String teamName;
                List<Pair<String, String>> results = new ArrayList<>(3);
                while ((teamName = br.readLine()) != null) {
                    String teamMembers = br.readLine();
                    results.add(new Pair<>(teamName, teamMembers));
                }
                br.close();
                return results;
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(List<Pair<String, String>> res) {
            super.onPostExecute(res);
            progress.dismiss();


            if (res == null) {
                TextView view = ButtonUtils.getResultsTv(getApplicationContext(),
                        getString(R.string.results_failed), false);
                topLayout.addView(view);
                return;
            }
            if (res.size() == 0) {
                TextView view = ButtonUtils.getResultsTv(getApplicationContext(),
                        getString(R.string.results_unavailable), false);
                topLayout.addView(view);
                return;
            }

            for (int i = 0; i < res.size(); i++) {
                Pair<String, String> team = res.get(i);

                if ("#$np".equals(team.first)) {
                    TextView names = ButtonUtils.getResultsTv(getApplicationContext(),
                            team.second, true, 20,
                            ButtonUtils.MARGIN_TYPE_ALL, true);
                    topLayout.addView(names);
                } else {
                    TextView position = ButtonUtils.getResultsTv(getApplicationContext(),
                            getPositionCaption(i + 1, team.first), true, 25,
                            ButtonUtils.MARGIN_TYPE_NO_BOTTOM, false);
                    View separator = ButtonUtils.getSeparator(getApplicationContext());
                    TextView names = ButtonUtils.getResultsTv(getApplicationContext(),
                            team.second, true, 20,
                            ButtonUtils.MARGIN_TYPE_NO_TOP, true);

                    topLayout.addView(position);
                    topLayout.addView(separator);
                    topLayout.addView(names);
                }
            }
        }

        private String getPositionCaption(int pos, String teamName) {
            if (teamName == null || "".equals(teamName))
                return FormatUtils.numToStr(pos);
            return FormatUtils.numToStr(pos) + " - " + teamName;
        }
    }
}