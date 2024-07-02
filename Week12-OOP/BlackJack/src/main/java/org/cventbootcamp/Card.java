package org.cventbootcamp;

public class Card {
    private CardSuit cardSuit;
    private String value;
    private boolean isFaceUp;

    public Card(CardSuit cardSuit, String value) {
        this.cardSuit = cardSuit;
        this.value = value;
        this.isFaceUp = false;
    }

    public CardSuit getCardSuit() {
        if(isFaceUp){
            return cardSuit;
        }
        else{
            return null;
        }
    }

    public String getValue() {
        if(isFaceUp){
            return value;
        }
        else{
            return "#";
        }
    }

    public int getPointValue(){
        try{
            switch (value){
                case "Ace":
                    return 11;
                case "Jack":
                case "King":
                case "Queen":
                    return 10;
                default:
                    return Integer.parseInt(value);
            }
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return 0;
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        //Toggle the Value of Faceup
        isFaceUp = !isFaceUp;
    }
}
