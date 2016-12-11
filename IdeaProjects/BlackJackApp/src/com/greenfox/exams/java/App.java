package com.greenfox.exams.java;

/**
 * Created by almasics on 2016.12.11..
 */
public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Deck.deckFill(deck);
        Deck usedcard = new Deck();
        Deck.cardDraw(deck, usedcard);
        for (int i = 0; i < usedcard.size(); i++) {
            System.out.println(usedcard);
        }
        System.out.println(deck);

    }
}
