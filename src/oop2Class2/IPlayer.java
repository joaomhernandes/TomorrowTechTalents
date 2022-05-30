package oop2Class2;

import java.util.List;

public interface IPlayer {
    String getName();
    int getHealthPoints();
    int getManaPoints();
    void receiveDamage(int healthPoints);
    void useMana(int manaPoints);
    void heal(int healtPoints);
    void receiveMana(int manaPoits);
    void addDeck(List<Card> deck);
    List<Card> getDeck();
    List<Card> viewHand();
    Card findCard(Card card);
    void removeCard(Card card);
    List<Card> getPlayerBoard();
    boolean isDead();
}
