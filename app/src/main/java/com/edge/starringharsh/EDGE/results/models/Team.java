package com.edge.starringharsh.EDGE.results.models;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<String> members;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String str) {
        if (members == null)
            members = new ArrayList<>(6);
        members.add(str);
    }
}

