package oop2Class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Board implements IBoard {
    private List<Player> players = new ArrayList<>();
    private int turn = 0;
    protected int maxNumberOfPlayers;
    protected int maxNumberOfCardsPerDeck;

    public Board() {
    }
    @Override
    public void insertPlayer(Player player){
        boolean deckIsOk = verifyDeckSize(player);
        if (getPlayers().isEmpty() && deckIsOk){
            getPlayers().add(player);
        }else if(getPlayers().size() < maxNumberOfPlayers && deckIsOk) {
            getPlayers().add(player);
        }else{
            System.out.println(player.getName() + " cannot play, for not meeting the rules of the board.");
        }
    }

    private boolean verifyDeckSize(Player player) {
        return player.getDeck().size() > maxNumberOfCardsPerDeck;
    }

    @Override
    public void drawCard(Player player){
        if (player.getDeck().size() > 0) {
            List<Card> deck = player.getDeck();
            Random random = new Random();
            int index = random.nextInt(deck.size());
            Card card = deck.get(index);
            player.viewHand().add(card);
            removeCard(player, card);
        }
    }
    @Override
    public abstract void playCard(Player player, Card card);

    @Override
    public void removeCard(Player player, Card card) {
        if(players.contains(player)) {
            player.removeCard(card);
        }
    }
    @Override
    public void nextTurn() {
        players.get(turn).receiveMana(2);
        if(turn < players.size()) {
            this.turn += 1;
        }else{
            this.turn = 0;
        }

    }

    @Override
    public abstract void winnerCheck();
    @Override
    public List<Player> getPlayers() {
        return this.players;
    }

    @Override
    public void flipCard(Card card,Player attackerPlayer, Player targetPlayer) {
            if (attackerPlayer.getPlayerBoard().contains(card) && !card.isFlipped() && card.getCost()<= attackerPlayer.getManaPoints()){
                card.flipCard();
                attackerPlayer.useMana(card.getCost());
                if (card instanceof AttackCard){
                    if (targetPlayer.getPlayerBoard().isEmpty()) {
                        targetPlayer.receiveDamage(((AttackCard) card).getPowerAttack());
                    }else {
                        Random random = new Random();
                        Card defenderCard = targetPlayer.getPlayerBoard().get(random.nextInt(targetPlayer.getPlayerBoard().size()));
                        if(((IAttack) defenderCard).getResistance() <= ((IAttack) card).getPowerAttack()) {
                            targetPlayer.removeCard(defenderCard);
                        }
                        if(((IAttack) card).getResistance() <= ((IAttack) defenderCard).getPowerAttack()) {
                            attackerPlayer.removeCard(card);
                        }
                    }
                }
                if(card instanceof SpecialAttackCard){
                    if (targetPlayer.getPlayerBoard().isEmpty()) {
                        targetPlayer.receiveDamage(((SpecialAttackCard) card).getPowerAttack());
                    }else {
                        Random random = new Random();
                        Card defenderCard = targetPlayer.getPlayerBoard().get(random.nextInt(targetPlayer.getPlayerBoard().size()));
                        if(((IAttack) defenderCard).getResistance() <= ((IAttack) card).getPowerAttack()) {
                            targetPlayer.removeCard(defenderCard);
                            System.out.println(((SpecialAttackCard) card).getSpecialAttackEffect());
                        }
                        if(((IAttack) card).getResistance() <= ((IAttack) defenderCard).getPowerAttack()) {
                            attackerPlayer.removeCard(card);
                            System.out.println(((SpecialAttackCard) card).getSpecialAttackEffect());
                        }
                    }
                }
        }
        winnerCheck();
        nextTurn();
    }
}
