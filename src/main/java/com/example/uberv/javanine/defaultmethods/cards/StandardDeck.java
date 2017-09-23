package com.example.uberv.javanine.defaultmethods.cards;

import java.util.*;

public class StandardDeck implements Deck {

    private List<Card> entireDeck;

    public StandardDeck() {
        entireDeck = new ArrayList<>();
    }

    @Override
    public List<Card> getCards() {
        return entireDeck;
    }

    @Override
    public Deck deckFactory() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addCard(Card card) {

    }

    @Override
    public void addCards(List<Card> cards) {

    }

    @Override
    public void addDeck(Deck deck) {

    }

    @Override
    public void shuffle() {
        Collections.shuffle(entireDeck);
    }

    @Override
    public void sort() {
        Collections.sort(entireDeck);
    }

    @Override
    public void sort(Comparator<Card> c) {
        Collections.sort(entireDeck, c);
    }

    @Override
    public String deckToString() {
        return entireDeck.toString();
    }

    @Override
    public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
        return null;
    }
}
