package com.edge.starringharsh.EDGE.results.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Team implements Serializable {
    private String name;
    private String members;

    public Team(String name, String members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public String getMembers() {
        return members;
    }

}

