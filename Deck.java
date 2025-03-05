// Deck.java

import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    // Constructor to create and initialize deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Creates a standard deck of 52 playing cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }
