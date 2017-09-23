package com.example.uberv.javanine.defaultmethods.cards;

public class PlayingCard implements Card {

    private Suit suit;
    private Rank rank;

    @Override
    public Suit getSuit() {
        return null;
    }

    @Override
    public Rank getRank() {
        return null;
    }

    @Override
    public int hashCode() {
        return ((suit.value() - 1) * 13) + rank.value();
    }

    @Override
    public int compareTo(Card o) {
        return this.hashCode() - o.hashCode();
    }
}
