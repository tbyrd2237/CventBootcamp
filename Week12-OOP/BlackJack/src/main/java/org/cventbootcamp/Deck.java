package org.cventbootcamp;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        CardSuit[] suits = {CardSuit.CLUBS, CardSuit.DIAMONDS, CardSuit.HEARTS, CardSuit.SPADES};
        String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (CardSuit suit: suits) {
            for (String value : values) {
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card deal(){
        if(!cards.isEmpty()){
            return cards.remove(0);
        }
        else {
            return null;
        }
    }

    public int getSize(){
        return cards.size();
    }
}
