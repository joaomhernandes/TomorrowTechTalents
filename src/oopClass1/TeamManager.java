package oopClass1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class TeamManager {
    public static void main(String[] args) {

        SoccerTeam javaTeam = new SoccerTeam("Java Soccer Team");
        Player player1 = new Player("Kady Iuri Borges Malinowski", LocalDate.of(1996, 5, 2),1,"Midfielder",100);
        Player player2 = new Player("Lenon Fernandes Ribeiro",LocalDate.of(1990,5,2),2,"Defender",95);
        Player player3 = new Player("Márcio Gonzaga de Azevedo",LocalDate.of(1986,5,2),3,"Defender",150);
        Player player4 = new Player("Lucas Halter",LocalDate.of(2000,5,2),4,"Defender",90);
        Player player5 = new Player("Vinicius de Paiva",LocalDate.of(1996,5,2),5,"Defender",92);
        Player player6 = new Player("Igor José Bohn",LocalDate.of(1996,5,2),6,"Goalkeeper",99);
        Player player7 = new Player("Guilherme Felipe de Castro",LocalDate.of(1992,5,2),7,"Midfielder",105);
        Player player8 = new Player("Danillo Souza Muniz",LocalDate.of(1993,5,5),8,"Striker",100);
        Player player9 = new Player("Christian Pulisic",LocalDate.of(1998,9,18),9,"Striker",115);
        Player player10 = new Player("Heung-Min Son",LocalDate.of(1992,7,8),10,"Midfielder",93);
        Player player11 = new Player("Lionel Andrés Messi Cuccittini",LocalDate.of(1987,6,24),11,"Striker",300);

        player1.runTraining();
        player1.runTraining();
        player2.runTraining();
        player3.runTraining();
        player4.runTraining();
        player5.runTraining();
        player6.runTraining();
        player7.runTraining();
        player8.runTraining();
        player9.runTraining();
        player10.runTraining();
        player11.runTraining();
        player10.getInjured();
        player11.getInjured();
        player9.getInjured();
        player8.getInjured();
        player7.getInjured();
        player6.getInjured();
        player5.getInjured();
        player4.getInjured();
        player3.applyRedCard(1);
        player4.applyYellowCard(2);
        player5.applyYellowCard(3);
        javaTeam.addPlayer(player1);
        javaTeam.addPlayer(player2);
        javaTeam.addPlayer(player3);
        javaTeam.addPlayer(player4);
        javaTeam.addPlayer(player5);
        javaTeam.addPlayer(player6);
        javaTeam.addPlayer(player7);
        javaTeam.addPlayer(player8);
        javaTeam.addPlayer(player9);
        javaTeam.addPlayer(player10);
        javaTeam.addPlayer(player11);
        System.out.println(javaTeam);
        player3.fulfillSuspension();
        player5.fulfillSuspension();
        player1.runTraining();
        System.out.println(javaTeam);



    }
}
