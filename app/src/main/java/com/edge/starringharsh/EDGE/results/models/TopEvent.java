package com.edge.starringharsh.EDGE.results.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TopEvent implements Serializable {
    private Map<String, Subevent> subevents;

    public Map<String, Subevent> getSubevent() {
        return subevents;
    }

    public void addSubevent(String name, Subevent subevent) {
        if (subevents == null)
            subevents = new HashMap<>();
        subevents.put(name, subevent);
    }
}