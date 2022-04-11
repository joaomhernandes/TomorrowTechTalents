package tikTakToe.components;

import javax.swing.*;

import static javax.swing.JOptionPane.*;
import static tikTakToe.components.Reset.reset;

class EndGame {


    static void endGame(String message) {
        JFrame frame = new JFrame("End of the game");

        int answer = JOptionPane.showConfirmDialog(frame,message + "\nDo you want to restart the game?", "End of the game", YES_NO_OPTION);
        if (answer == YES_OPTION) {
            showMessageDialog(null, "Restarting board.");
            reset();

        }
        else {
            showMessageDialog(null, "Bye!");
            System.exit(0);
        }
    }
}
