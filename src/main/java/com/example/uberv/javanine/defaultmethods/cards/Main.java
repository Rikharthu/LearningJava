package com.example.uberv.javanine.defaultmethods.cards;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new StandardDeck();
        myDeck.shuffle();
        myDeck.sort((firstCard, secondCard) -> {
            return firstCard.getRank().value() - secondCard.getRank().value();
        });
        // new Comparator's static method:
        myDeck.sort(Comparator.comparing(firstCard -> firstCard.getRank().value()));

        // Comparator interface also got a new default method .thenComparing(...)
        myDeck.sort(
                Comparator
                        .comparing(Card::getRank)
                        .reversed()
                        .thenComparing(Comparator.comparing(Card::getSuit)));
    }
}
