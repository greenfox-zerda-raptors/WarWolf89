package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by almasics on 2016.12.11..
 */
public class Deck {


    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Card> usedCards = new ArrayList<>();


    public Deck() {
        deckFill(cards);
    }

    public static void deckFill(ArrayList<Card> cards) {

        Card káróCard;
        Card körCard;
        Card pikkCard;
        Card treffCard;

        ArrayList<String> cardtypes = new ArrayList<String>(Arrays.asList("Káró", "Kör", "Pikk", "Treff"));

        for (int i = 0; i < 13; i++) {
            káróCard = new Card(cardtypes.get(0), i + 1);
            cards.add(káróCard);
            körCard = new Card(cardtypes.get(1), i + 1);
            cards.add(körCard);
            pikkCard = new Card(cardtypes.get(2), i + 1);
            cards.add(pikkCard);
            treffCard = new Card(cardtypes.get(3), i + 1);
            cards.add(treffCard);
        }
    }

    public void drawCard() {
//        Random rnd = new Random();
        usedCards.add(cards.get(0));
        cards.remove(cards.get(0));
        System.out.println(String.format("Card added to used deck: %s", cards.get(1).toString()));
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public ArrayList<Card> getUsedCards() {
        return usedCards;
    }
}
