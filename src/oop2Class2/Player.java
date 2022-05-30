package oop2Class2;

import java.util.ArrayList;
import java.util.List;

public class Player implements IPlayer{
    private String name;
    private int healthPoints = 20;
    private int manaPoints = 3;
    private List<Card> deck = new ArrayList<>();
    private List<Card> hand = new ArrayList<>();;
    private List<Card> playerBoard = new ArrayList<>();;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }
    @Override
    public String getName() { return this.name; }
    @Override
    public int getHealthPoints() {
        return this.healthPoints;
    }
    @Override
    public int getManaPoints() {
        return this.manaPoints;
    }
    private void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    private void setManaPoints(int manaPoints) {
        this.healthPoints = manaPoints;
    }
    @Override
    public void receiveDamage(int healthPoints) {
        setHealthPoints(getHealthPoints()-healthPoints);
    }
    @Override
    public void useMana(int manaPoints) {
        setManaPoints(getManaPoints()-manaPoints);
    }
    @Override
    public void heal(int healtPoints) {
        setHealthPoints(getHealthPoints() + healtPoints);
    }
    @Override
    public void receiveMana(int manaPoits) {
        setManaPoints(getManaPoints() + manaPoits);
    }
    @Override
    public void addDeck(List<Card> deck) {
        this.deck = deck;
    }
    @Override
    public List<Card> getDeck() { return this.deck; }
    @Override
    public Card findCard(Card card) {
        for (Card deckCard:deck) {
            if (deckCard == card){
                return deckCard;
            }
        }
        return null;
    }
    @Override
    public void removeCard(Card card) {
        if (findCard(card) != null) {
            deck.remove(card);
        }
    }

    @Override
    public List<Card> getPlayerBoard() {
        return this.playerBoard;
    }

    @Override
    public List<Card> viewHand() {
        return this.hand;

    }

    @Override
    public boolean isDead() {
        return getHealthPoints() <= 0;
    }

    @Override
    public String toString() {
        return getName() + "\n" +
                "Deck" + getDeck();
    }
}
