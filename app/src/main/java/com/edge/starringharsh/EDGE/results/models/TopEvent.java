package com.edge.starringharsh.EDGE.results.models;

import java.util.HashMap;
import java.util.Map;

public class TopEvent {
    private Map<String, Subevent> subevents;

    public Subevent getSubevent(String name) {
        return subevents.get(name);
    }

    public void addSubevent(String name, Subevent subevent) {
        if (subevents == null)
            subevents = new HashMap<>();
        subevents.put(name, subevent);
    }
}