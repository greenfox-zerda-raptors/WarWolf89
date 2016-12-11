package com.greenfox.exams.java;

/**
 * Created by almasics on 2016.12.11..
 */
public class Card {
    String name;
    int value;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String toString() {
        return String.format("%s with the value of %d", name, value);
    }

}
