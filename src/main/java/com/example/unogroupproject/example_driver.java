package com.example.unogroupproject;

import java.util.List;
import java.util.ArrayList;

public class example_driver {

    public static void main(String[] args) {
        initDeck deck = new initDeck();
        // initialize deck object

        // noah - give remove draw// brandon cpu play //sam player win check

        deck.shuffle();
        // optional shuffle

        for (Card card : deck.getDeck()) { System.out.println(card); }

        List<Player> players = new ArrayList<>();
        players.add(new Player("player"));
        players.add(new Player("cpu"));

        for (Player player : players) {
            for (int i=0; i<7; i++) {
                player.addCard(deck.drawCard());
            }
        }

        for (Player player : players) {
            System.out.println(player.getName());
            System.out.println(player.getHand());
        }

        ArrayList<Card> discard = new ArrayList<>();

        discard.add(deck.drawCard());

        int playerCounter = 0;
        Player currentPlayer = players.get(playerCounter);

        while (!currentPlayer.hasWon()) {
            System.out.printf("%s size: %d%s\n", currentPlayer.getName(), currentPlayer.getHand().size(), currentPlayer.getHand());
            int cardCount = 0;
            while (cardCount<currentPlayer.getHand().size()-1) {
                Card card = currentPlayer.getHand().get(cardCount);
                if (card.canBePlayedOn(discard.get(discard.size() - 1))) {
                    discard.add(currentPlayer.playCard(card));
                    break;
                }
                cardCount++;
            } if (cardCount==currentPlayer.getHand().size()-1) {
                currentPlayer.addCard(deck.drawCard());
            }
            currentPlayer = players.get((playerCounter++)%2);
            if (deck.isEmpty()) {
                ArrayList<Card> discard_deck = new ArrayList<>();
                discard_deck.add(discard.remove(discard.size()-1));
//                System.out.println(discard_deck.size());
                deck.setDeck(discard);
                discard = discard_deck;
            }
            System.out.println(discard);
            System.out.println(discard.size());
            System.out.println(deck.isEmpty());
        }
//        System.out.println("won");





    }
}