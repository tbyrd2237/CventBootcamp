package org.cventbootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();

        Hand handOne = new Hand();
        Hand handTwo = new Hand();

        for(int i=0; i<2; i++){
            Card card = deck.deal();
            Card card2 = deck.deal();

            handOne.deal(card);
            handTwo.deal(card2);
        }

        System.out.println("Player One has a total value of " + handOne.getValue() + ".");
        System.out.println("Player Two has a total value of " + handTwo.getValue() + ".");

        if(handOne.getValue() > handTwo.getValue()){
            System.out.println("Player One wins!");
        }
        else if(handTwo.getValue() > handOne.getValue()){
            System.out.println("Player Two wins!");
        }

        scanner.close();
    }
}