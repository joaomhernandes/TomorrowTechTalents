package tikTakToe.assets;

import static tikTakToe.MainWindow.*;
import static tikTakToe.assets.CheckWinner.checkWinner;
import static tikTakToe.assets.MachineTurn.machineTurn;

public class CreateButtons {
    public static void createButtons(){
        button11.setFocusable(false);
        button11.addActionListener(e -> {
            button11.setIcon(circle);
            positions[0][0] = "J";
            button11.setEnabled(false);
            checkWinner();
            machineTurn();
        });

        button12.setFocusable(false);
        button12.addActionListener(e -> {
            button12.setIcon(circle);
            positions[0][1] = "J";
            button12.setEnabled(false);
            checkWinner();
            machineTurn();
        });

        button13.setFocusable(false);
        button13.addActionListener(e -> {
            button13.setIcon(circle);
            positions[0][2] = "J";
            button13.setEnabled(false);
            checkWinner();
            machineTurn();
        });

        button21.setFocusable(false);
        button21.addActionListener(e -> {
            button21.setIcon(circle);
            positions[1][0] = "J";
            button21.setEnabled(false);
            checkWinner();
            machineTurn();
        });

        button22.setFocusable(false);
        button22.addActionListener(e -> {
            button22.setIcon(circle);
            positions[1][1] = "J";
            button22.setEnabled(false);
            checkWinner();
            machineTurn();
        });

        button23.setFocusable(false);
        button23.addActionListener(e -> {
            button23.setIcon(circle);
            positions[1][2] = "J";
            button23.setEnabled(false);
            checkWinner();
            machineTurn();
        });

        button31.setFocusable(false);
        button31.addActionListener(e -> {
            button31.setIcon(circle);
            positions[2][0] = "J";
            button31.setEnabled(false);
            checkWinner();
            machineTurn();
        });

        button32.setFocusable(false);
        button32.addActionListener(e -> {
            button32.setIcon(circle);
            positions[2][1] = "J";
            button32.setEnabled(false);
            checkWinner();
            machineTurn();
        });

        button33.setFocusable(false);
        button33.addActionListener(e -> {
            button33.setIcon(circle);
            positions[2][2] = "J";
            button33.setEnabled(false);
            checkWinner();
            machineTurn();
        });
    }
}
