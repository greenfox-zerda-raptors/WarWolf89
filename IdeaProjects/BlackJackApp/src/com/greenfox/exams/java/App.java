package com.greenfox.exams.java;

/**
 * Created by almasics on 2016.12.11..
 */
public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.drawCard();
        System.out.println(deck.getUsedCards().toString());
        System.out.println(deck.getCards().toString());
    }
}
