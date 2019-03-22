package com.edge.starringharsh.EDGE.results;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.BaseActivity;
import com.edge.starringharsh.EDGE.R;
import com.edge.starringharsh.EDGE.results.models.ResultsModel;
import com.edge.starringharsh.EDGE.results.models.TopEvent;
import com.edge.starringharsh.EDGE.utils.ButtonUtils;

import java.util.Set;

public class ResultsJsonActivity extends BaseActivity {
    public final static String RESULTS_MODEL = "resultsModel";
    final static String EVENT_NAME = "eventName";
    public final static String RESULTS_TYPE = "resultsType";
    public final static int RESULTS_TYPE_EVENTS = 0;
    public final static int RESULTS_TYPE_SUBEVENTS = 1;
    public final static int RESULTS_TYPE_SINGLE_EVENT = 2;

    private LinearLayout topLayout;
    private ResultsModel resultsModel;
    private String eventName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        topLayout = findViewById(R.id.results_top_ll);
        TextView header = findViewById(R.id.results_name);

        eventName = getIntent().getStringExtra(EVENT_NAME);
        resultsModel = (ResultsModel) getIntent().getSerializableExtra(RESULTS_MODEL);
        int resultsType = getIntent().getIntExtra(RESULTS_TYPE, RESULTS_TYPE_EVENTS);
        header.setText(eventName != null ? eventName : "RESULTS");
        showResults(resultsType);
    }

    private void showResults(int resultsType) {
        if (resultsType == RESULTS_TYPE_EVENTS) {
            Set<String> events = resultsModel.getData().keySet();
            setData(events, RESULTS_TYPE_SUBEVENTS);
        } else if (resultsType == RESULTS_TYPE_SUBEVENTS) {
            TopEvent topEvent = resultsModel.getTopEvent(eventName);
            if (topEvent == null) {
                onFailed();
                return;
            }

            Set<String> subevents = topEvent.getSubevent().keySet();
            setData(subevents, RESULTS_TYPE_SINGLE_EVENT);
        } else {
            onFailed();
        }

    }

    private void setData(Set<String> events, int resultType) {
        for (String event : events) {
            TextView view = getTv(event);
            view.setOnClickListener(new TextOnClickListener(event, resultType));
            topLayout.addView(view);
        }
    }

    private TextView getTv(String text) {
        return ButtonUtils.getResultsTv(getApplicationContext(), text, false);
    }

    private TextView getTv(int textRes) {
        return ButtonUtils.getResultsTv(getApplicationContext(),
                getString(textRes), false);
    }

    private void onFailed() {
        TextView view = getTv(R.string.results_failed);
        topLayout.removeAllViews();
        topLayout.addView(view);
    }

    class TextOnClickListener implements TextView.OnClickListener {
        String eventName;
        int resultsType;

        TextOnClickListener(String eventName, int resultsType) {
            this.eventName = eventName;
            this.resultsType = resultsType;
        }

        @Override
        public void onClick(View v) {
            Intent intent = null;
            if (resultsType == RESULTS_TYPE_SUBEVENTS) {
                intent = new Intent(ResultsJsonActivity.this.getApplicationContext(), ResultsJsonActivity.class);
                intent.putExtra(EVENT_NAME, eventName);
                intent.putExtra(RESULTS_TYPE, resultsType);
                intent.putExtra(RESULTS_MODEL, resultsModel);
            }
            startActivity(intent);
            /*
            } else {
                intent = new Intent(ResultsJsonActivity.this.getApplicationContext(), ResultsDetailsActivity.class);
                intent.putExtra(ResultsDetailsActivity.RESULT_NAME, eventName);
                intent.putExtra(ResultsDetailsActivity.RESULT_URL, url);
            }*/
        }
    }
}
