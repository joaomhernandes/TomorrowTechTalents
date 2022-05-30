package oop2Class2;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        VersusBoard versusBoard = new VersusBoard();
        PartyBoard partyBoard = new PartyBoard();
        AttackCard dragon = new AttackCard("Dragon",CardType.ATTACK,2,4,5);
        AttackCard snake = new AttackCard("snake",CardType.ATTACK,2,3,2);
        SpecialAttackCard blackDragon = new SpecialAttackCard("Black Dragon",CardType.SPECIAL_ATTACK,3,5,5,"Infernal Black Flame");
        Player joao = new Player("João");
        Player pedro = new Player("Pedro");
        Player jose = new Player("José");
        Player ana = new Player("Ana");
        Player maria = new Player("Maria");
        List<Card> versusDeck=new ArrayList<>();
        for (int i = 0; i <20; i++ ){
            versusDeck.add(dragon);
        }
        for (int i = 0; i <20; i++ ){
            versusDeck.add(snake);
        }
        for (int i = 0; i <10; i++ ){
            versusDeck.add(blackDragon);
        }
        List<Card> partyDeck=new ArrayList<>();
        for (int i = 0; i <30; i++ ){
            partyDeck.add(dragon);
        }
        for (int i = 0; i <30; i++ ){
            partyDeck.add(snake);
        }
        for (int i = 0; i <20; i++ ){
            partyDeck.add(blackDragon);
        }
        List<Card> iregularDeck=versusDeck;
        iregularDeck.add(blackDragon);
        joao.addDeck(versusDeck);
        pedro.addDeck(versusDeck);
        versusBoard.insertPlayer(joao);
        versusBoard.insertPlayer(pedro);
        versusBoard.insertPlayer(ana);


        System.out.println(versusBoard.getPlayers().get(0));
        System.out.println(joao.getDeck());
        System.out.println(pedro.getDeck());



    }
}
