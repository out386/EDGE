package com.edge.starringharsh.EDGE.results;

import com.edge.starringharsh.EDGE.results.models.ResultsModel;
import com.edge.starringharsh.EDGE.results.models.Subevent;
import com.edge.starringharsh.EDGE.results.models.Team;
import com.edge.starringharsh.EDGE.results.models.TopEvent;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ResultsParser {

    ResultsModel parseString(String str) throws JSONException {
        JSONObject jsonObject = new JSONObject(str);
        JSONArray data = jsonObject.getJSONArray("data");

        ResultsModel results = new ResultsModel();
        for (int eventsIdx = 0; eventsIdx < data.length(); eventsIdx++) {
            JSONObject event = data.getJSONObject(eventsIdx);
            JSONArray subevents = event.getJSONArray("sub");

            results.addEvent(event.getString("name"), getEvent(subevents));
        }

        return results;
    }

    private TopEvent getEvent(JSONArray subevents) throws JSONException {
        TopEvent eventModel = new TopEvent();
        for (int subeventsIdx = 0; subeventsIdx < subevents.length(); subeventsIdx++) {
            JSONObject subevent = subevents.getJSONObject(subeventsIdx);
            JSONArray winners = subevent.getJSONArray("winners");

            Subevent subeventModel = getSubevent(winners);
            eventModel.addSubevent(subevent.getString("name"), subeventModel);
        }

        return eventModel;
    }

    private Subevent getSubevent(JSONArray winners) throws JSONException {
        Subevent subeventModel = new Subevent();

        for (int winnersIdx = 0; winnersIdx < winners.length(); winnersIdx++) {
            JSONObject winner = winners.getJSONObject(winnersIdx);

            Team teamModel = new Team(winner.getString("team"), winner.getString("members"));
            subeventModel.addWinner(teamModel);
        }

        return subeventModel;
    }
}
