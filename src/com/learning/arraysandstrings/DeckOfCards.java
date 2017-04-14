package com.learning.arraysandstrings;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by vijayperiasamy on 3/18/17.
 */
public class DeckOfCards {
    String[] suits;
    String[] cards;
    String[][] handCards;

    public DeckOfCards() {
        this.suits = new String[]{"Hearts", "Dice", "Clubs", "Spade"};
        this.cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    }

    public void populateHandCards() {
        handCards = new String[cards.length][suits.length];
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                handCards[i][j] = cards[i] + " of " + suits[j];
            }
        }
        //printCards();
    }

    public void shuffleCards() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                int cRand = ThreadLocalRandom.current().nextInt(0, (cards.length));
                int sRand = ThreadLocalRandom.current().nextInt(0, (suits.length));
                String temp = handCards[i][j];
                handCards[i][j] = handCards[cRand][sRand];
                handCards[cRand][sRand] = temp;
                System.out.println(handCards[i][j]);
            }

        }

    }

    public void printCards() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                System.out.println(handCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.populateHandCards();
        cards.shuffleCards();
    }

}
