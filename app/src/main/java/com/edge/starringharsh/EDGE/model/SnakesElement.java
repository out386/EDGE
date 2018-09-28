package com.edge.starringharsh.EDGE.model;

/**
 * Created by user2 on 28-08-2017.
 */

public class SnakesElement {

    /**
     * Used as a flag to check whether the background need to paint or not.<p>
     *     0 => keep grid as empty<p>
     *     1 => use snake background to grid<p>
     *     2 => add coin to grid<p>
     */
    public int property;

    public SnakesElement() {
    }

    public SnakesElement(int property) {
        this.property = property;
    }
}
