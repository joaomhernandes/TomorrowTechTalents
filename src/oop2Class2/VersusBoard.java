package oop2Class2;

import java.util.List;
import java.util.Random;

public class VersusBoard extends Board{
    private static final int MAX_NUMBER_OF_PLAYERS = 2;
    private static final int MAX_NUMBER_OF_CARDS_PER_DECK = 50;
    private static final int MAX_NUMBER_OF_ATTACK_CARDS = 5;
    private static final int MAX_NUMBER_OF_SPECIAL_ATTACK_CARDS = 2;


    public VersusBoard() {
        maxNumberOfPlayers = MAX_NUMBER_OF_PLAYERS;
        maxNumberOfCardsPerDeck = MAX_NUMBER_OF_CARDS_PER_DECK;
    }

    @Override
    public void playCard(Player player, Card card) {
        if (player.viewHand().size() > 0 && player.viewHand().contains(card) ) {
            List<Card> hand = player.viewHand();
            List<Card> playerBoard = player.getPlayerBoard();
            int numberOfAttackCards = 0;
            int numberOfSpecialAttackCards = 0;
            for (Card playerCard :playerBoard ) {
                if (playerCard.getType().equalsIgnoreCase(CardType.ATTACK.getDescription())){
                    numberOfAttackCards++;
                }
                if (playerCard.getType().equalsIgnoreCase(CardType.SPECIAL_ATTACK.getDescription())){
                    numberOfSpecialAttackCards++;
                }
            }
            if(card.getType().equalsIgnoreCase(CardType.ATTACK.getDescription()) && numberOfAttackCards <= MAX_NUMBER_OF_ATTACK_CARDS){
                player.getPlayerBoard().add(card);
                player.viewHand().remove(card);
            }
            if(card.getType().equalsIgnoreCase(CardType.SPECIAL_ATTACK.getDescription()) && numberOfSpecialAttackCards <= MAX_NUMBER_OF_SPECIAL_ATTACK_CARDS){
                player.getPlayerBoard().add(card);
                player.viewHand().remove(card);
            }
        }
    }

    @Override
    public void winnerCheck() {
        Player winner = new Player();
        boolean gameOver = false;
        for (Player player:getPlayers()) {
            if (player.getHealthPoints()<=0){
                gameOver = true;
            }else {
                winner = player;
            }
        }
        if (gameOver){
            System.out.println("Game over. " + winner.getName() + " wins!");
        }
    }

    @Override
    public void nextTurn() {
        super.nextTurn();
    }

}
