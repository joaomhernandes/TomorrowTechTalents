package oop2Class2;

import java.util.List;

public interface IBoard {
    void insertPlayer(Player player);
    void drawCard(Player player);
    void playCard(Player player, Card card);
    void removeCard(Player player, Card card);
    void nextTurn();
    void winnerCheck();
    List<Player> getPlayers();
    void flipCard(Card card,Player attackerPlayer, Player targetPlayer);

}
