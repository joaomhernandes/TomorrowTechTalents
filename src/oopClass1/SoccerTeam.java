package oopClass1;

import java.util.ArrayList;

public class SoccerTeam {
    String name;
    ArrayList<Player> soccerTeam = new ArrayList<>();

    public SoccerTeam(String name) {
        this.name = name;
    }
    void addPlayer(Player player){
            soccerTeam.add(player);
            player.isEscalated();
    }

    @Override
    public String toString() {
        StringBuilder players = new StringBuilder();
        for (Player player : soccerTeam) {
            players.append(player).append("\n");
        }
        return  "\n" +name.toUpperCase() + "\n" + players;
    }
}
