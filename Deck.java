// Deck.java

import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    // Constructor to create and initialize deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }
