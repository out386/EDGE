package com.edge.starringharsh.EDGE.results;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.BaseActivity;
import com.edge.starringharsh.EDGE.R;
import com.edge.starringharsh.EDGE.results.models.ResultsModel;
import com.edge.starringharsh.EDGE.utils.ButtonUtils;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;

public class ResultsTopActivity extends BaseActivity {
    public final static String RESULTS_URL = "resultsUrl";
    final static String HEADER_CAPTION = "headerCaption";

    String linkadd;
    ProgressDialog progress;
    LinearLayout topLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_results);

        topLayout = findViewById(R.id.results_top_ll);
        TextView header = findViewById(R.id.results_name);

        progress = new ProgressDialog(this);
        linkadd = getIntent().getStringExtra(RESULTS_URL);
        String caption = getIntent().getStringExtra(HEADER_CAPTION);

        header.setText(caption != null ? caption : "RESULTS");
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
            try {
                URL url = new URL(linkadd);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                StringBuilder result_links = new StringBuilder();
                while ((str = br.readLine()) != null) {
                    result_links.append(str).append("\n");
                }
                br.close();
                return result_links.toString();
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(String res) {
            boolean noneAdded = true;

            super.onPostExecute(res);
            progress.dismiss();

            if (res == null) {
                TextView view = getTv(R.string.results_failed);
                topLayout.addView(view);
                return;
            }
            if ("".equals(res)) {
                TextView view = getTv(R.string.results_unavailable);
                topLayout.addView(view);
                return;
            }

            BufferedReader br = new BufferedReader(new StringReader(res));

            try {
                String name;
                boolean isNextTop = "top".equals(br.readLine());
                while ((name = br.readLine()) != null) {
                    String url = br.readLine();
                    noneAdded = false;
                    TextView view = getTv(name);
                    view.setOnClickListener(new TextOnClickListener(name, url, isNextTop));
                    topLayout.addView(view);
                }
            } catch (IOException e) {
                if (noneAdded) {
                    TextView view = getTv(R.string.results_failed);
                    topLayout.addView(view);
                }
                e.printStackTrace();
            }
        }
    }

    private TextView getTv(String text) {
        return ButtonUtils.getResultsTv(getApplicationContext(), text, false);
    }

    private TextView getTv(int textRes) {
        return ButtonUtils.getResultsTv(getApplicationContext(),
                getString(textRes), false);
    }


    class TextOnClickListener implements TextView.OnClickListener {
        String eventName;
        String url;
        boolean isTop;

        TextOnClickListener(String eventName, String url, boolean isTop) {
            this.eventName = eventName;
            this.url = url;
            this.isTop = isTop;
        }

        @Override
        public void onClick(View v) {
            new FetchJson(eventName, url).execute();
        }
    }

    private void startResultsActivity(String name, ResultsModel results) {
        Intent intent = new Intent(ResultsTopActivity.this.getApplicationContext(), ResultsJsonActivity.class);
        intent.putExtra(ResultsJsonActivity.EVENT_NAME, name);
        intent.putExtra(ResultsJsonActivity.RESULTS_TYPE, ResultsJsonActivity.RESULTS_TYPE_EVENTS);
        intent.putExtra(ResultsJsonActivity.RESULTS_MODEL, results);
        startActivity(intent);
    }

    class FetchJson extends AsyncTask<Void, Void, String> {
        private String eventName;
        private String link;

        public FetchJson(String eventName, String link) {
            this.eventName = eventName;
            this.link = link;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progress.setIndeterminate(false);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.setCancelable(false);
            progress.setMessage("Fetching Information...");
            progress.show();
        }

        @Override
        protected String doInBackground(Void... voids) {
            try {
                URL url = new URL(link);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                StringBuilder result_links = new StringBuilder();
                while ((str = br.readLine()) != null) {
                    result_links.append(str).append("\n");
                }
                br.close();
                return result_links.toString();
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progress.dismiss();
            if (s == null) {
                onFailed();
                return;
            }

            ResultsModel results = null;
            try {
                results = new ResultsParser().parseString(s);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (results == null) {
                onFailed();
                return;
            }

            startResultsActivity(eventName, results);
        }

        private void onFailed() {
            TextView view = getTv(R.string.results_failed);
            topLayout.removeAllViews();
            topLayout.addView(view);
        }
    }
}
