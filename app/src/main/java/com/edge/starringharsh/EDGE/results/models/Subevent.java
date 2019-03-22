package com.edge.starringharsh.EDGE.results.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Subevent implements Serializable {
    private List<Team> winners;

    public List<Team> getWinners() {
        return winners;
    }

    public void addWinner(Team team) {
        if (winners == null)
            winners = new ArrayList<>(3);
        winners.add(team);
    }
}

