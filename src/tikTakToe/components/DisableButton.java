package tikTakToe.components;

import static tikTakToe.MainWindow.*;
import static tikTakToe.components.CheckWinner.checkWinner;

public class DisableButton {
    static public void disableButton(int i, int j) {
        String button = String.valueOf(i) + String.valueOf(j);
        switch (button) {
            case "00" -> {
                button11.setIcon(x);
                button11.setEnabled(false);
                checkWinner();
            }
            case "01" -> {
                button12.setIcon(x);
                button12.setEnabled(false);
                checkWinner();
            }
            case "02" -> {
                button13.setIcon(x);
                button13.setEnabled(false);
                checkWinner();
            }
            case "10" -> {
                button21.setIcon(x);
                button21.setEnabled(false);
                checkWinner();
            }
            case "11" -> {
                button22.setIcon(x);
                button22.setEnabled(false);
                checkWinner();
            }
            case "12" -> {
                button23.setIcon(x);
                button23.setEnabled(false);
                checkWinner();
            }
            case "20" -> {
                button31.setIcon(x);
                button31.setEnabled(false);
                checkWinner();
            }
            case "21" -> {
                button32.setIcon(x);
                button32.setEnabled(false);
                checkWinner();
            }
            case "22" -> {
                button33.setIcon(x);
                button33.setEnabled(false);
                checkWinner();
            }
        }
    }
}
