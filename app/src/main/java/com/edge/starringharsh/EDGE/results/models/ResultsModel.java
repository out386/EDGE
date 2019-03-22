package com.edge.starringharsh.EDGE.results.models;

import java.util.HashMap;
import java.util.Map;

public class ResultsModel {

    private Map<String, TopEvent> data;

    public Map<String, TopEvent> getData() {
        return data;
    }

    public void addEvent(String name, TopEvent event) {
        if (data == null)
            data = new HashMap<>();
        data.put(name, event);
    }
}
