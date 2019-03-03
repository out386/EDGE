package com.edge.starringharsh.EDGE;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.utils.ButtonUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

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

    class BackFetch extends AsyncTask<Void, Void, String> {

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
        protected String doInBackground(Void... voids) {
            boolean isEmpty = true;
            try {
                URL url = new URL(eventUrl);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                StringBuilder result_links = new StringBuilder();
                while ((str = br.readLine()) != null) {
                    if (isEmpty) {
                        result_links.append(str);
                        isEmpty = false;
                    } else {
                        result_links.append("\n\n").append(str);
                    }
                }
                br.close();
                return result_links.toString();
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(String res) {
            super.onPostExecute(res);
            progress.dismiss();


            if (res == null) {
                TextView view = ButtonUtils.getResultsTv(getApplicationContext(),
                        getString(R.string.results_failed), false);
                topLayout.addView(view);
                return;
            }
            if ("".equals(res)) {
                TextView view = ButtonUtils.getResultsTv(getApplicationContext(),
                        getString(R.string.results_unavailable), false);
                topLayout.addView(view);
                return;
            }

            TextView view = ButtonUtils.getResultsTv(getApplicationContext(), res, true, 20);
            topLayout.addView(view);
        }
    }

    }
