package com.edge.starringharsh.EDGE.results;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.BaseActivity;
import com.edge.starringharsh.EDGE.R;
import com.edge.starringharsh.EDGE.results.models.Subevent;
import com.edge.starringharsh.EDGE.results.models.Team;
import com.edge.starringharsh.EDGE.utils.ButtonUtils;
import com.edge.starringharsh.EDGE.utils.FormatUtils;

public class ResultsDetailsActivity extends BaseActivity {

    final static String RESULT_NAME = "resultName";
    final static String RESULTS_WINNERS = "resultsWinners";

    private LinearLayout topLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        topLayout = findViewById(R.id.results_top_ll);
        String eventName = getIntent().getStringExtra(RESULT_NAME);
        Subevent winners = (Subevent) getIntent().getSerializableExtra(RESULTS_WINNERS);

        TextView nameTv = findViewById(R.id.results_name);
        nameTv.setText(eventName);
        setData(winners);
    }

    private void setData(Subevent winners) {
        if (winners == null) {
            TextView view = ButtonUtils.getResultsTv(getApplicationContext(),
                    getString(R.string.results_failed), false);
            topLayout.addView(view);
            return;
        }
        if (winners.getWinners().size() == 0) {
            TextView view = ButtonUtils.getResultsTv(getApplicationContext(),
                    getString(R.string.results_unavailable), false);
            topLayout.addView(view);
            return;
        }

        for (int i = 0; i < winners.getWinners().size(); i++) {
            Team team = winners.getWinners().get(i);

            if ("#$np".equals(team.getName())) {
                // TODO: JUST ADD A "MESSAGE" KEY TO THE JSON INSTEAD!!
                TextView names = ButtonUtils.getResultsTv(getApplicationContext(),
                        team.getMembers(), true, 20,
                        ButtonUtils.MARGIN_TYPE_ALL, true);
                topLayout.addView(names);
            } else {
                TextView position = ButtonUtils.getResultsTv(getApplicationContext(),
                        getPositionCaption(i + 1, team.getName()), true, 25,
                        ButtonUtils.MARGIN_TYPE_NO_BOTTOM, false);
                View separator = ButtonUtils.getSeparator(getApplicationContext());
                TextView names = ButtonUtils.getResultsTv(getApplicationContext(),
                        team.getMembers(), true, 20,
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