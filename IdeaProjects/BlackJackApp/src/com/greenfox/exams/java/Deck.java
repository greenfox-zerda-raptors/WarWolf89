package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by almasics on 2016.12.11..
 */
public class Deck extends ArrayList<Card> {


    public Deck() {
    }

    public static void deckFill(Deck deck) {

        Card káróCard;
        Card körCard;
        Card pikkCard;
        Card treffCard;

        ArrayList<String> cardtypes = new ArrayList<String>(Arrays.asList("Káró", "Kör", "Pikk", "Treff"));

        for (int i = 0; i < 13; i++) {
            káróCard = new Card(cardtypes.get(0), i + 1);
            deck.add(káróCard);
            körCard = new Card(cardtypes.get(1), i + 1);
            deck.add(körCard);
            pikkCard = new Card(cardtypes.get(2), i + 1);
            deck.add(pikkCard);
            treffCard = new Card(cardtypes.get(3), i + 1);
            deck.add(treffCard);
        }
    }

    public static void cardDraw(Deck deck, Deck usedDeck) {
        Random rnd = new Random();
        usedDeck.add(deck.get(1));
        deck.remove(1);
        System.out.println(String.format("Card added to used deck: %s", deck.get(1).toString()));
    }
}
