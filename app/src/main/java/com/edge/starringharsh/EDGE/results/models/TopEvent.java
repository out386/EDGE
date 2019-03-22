package com.edge.starringharsh.EDGE.results.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TopEvent implements Serializable {
    private Map<String, Subevent> subevents;

    public Map<String, Subevent> getSubevents() {
        return subevents;
    }

    public Subevent getSubevent(String name) {
        return subevents.get(name);
    }

    public void addSubevent(String name, Subevent subevent) {
        if (subevents == null)
            subevents = new HashMap<>();
        subevents.put(name, subevent);
    }
}