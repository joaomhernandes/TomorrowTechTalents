package oop2Class2;

import java.util.List;
import java.util.Random;

public class PartyBoard extends Board implements IPartyBoard{
    private static final int MAX_NUMBER_OF_PLAYERS = 5;
    private static final int MAX_NUMBER_OF_CARDS_PER_DECK = 80;
    private static final int MAX_NUMBER_OF_ATTACK_CARDS = 34;
    private static final int MAX_NUMBER_OF_SPECIAL_ATTACK_CARDS = 2;

    public PartyBoard() {
        maxNumberOfPlayers = MAX_NUMBER_OF_PLAYERS;
        maxNumberOfCardsPerDeck = MAX_NUMBER_OF_CARDS_PER_DECK;
    }

    @Override
    public void playCard(Player player, Card card) {
        if (player.viewHand().size() > 0 && player.viewHand().contains(card) ) {
            List<Card> hand = player.viewHand();
            List<Card> playerBoard = player.getPlayerBoard();
            int numberOfAttackCards = getNumberOfAttackCardsInTheField();
            int numberOfSpecialAttackCards = 0;
            for (Card playerCard :playerBoard ) {
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
        int numberOfDeadPlayers = 0;
        for (Player player:getPlayers()) {
            if (player.isDead()){
                numberOfDeadPlayers++;
            }else {
                winner = player;
            }
        }
        if (numberOfDeadPlayers == 4){
            System.out.println("Game over. " + winner.getName() + " wins!");
        }
    }

    @Override
    public void nextTurn() {
        super.nextTurn();
    }


    @Override
    public int getNumberOfAttackCardsInTheField() {
        int numberOfAttackCardsInTheField=0;
        for (Player player:getPlayers()){
            for (Card card:player.getPlayerBoard()) {
                if(card.getType().equalsIgnoreCase(CardType.ATTACK.getDescription())){
                    numberOfAttackCardsInTheField++;
                }
            }
        }
        return numberOfAttackCardsInTheField;
    }
}

