package tikTakToe.components;

import java.util.Random;

import static tikTakToe.MainWindow.positions;
import static tikTakToe.components.DisableButton.disableButton;

public class MachineTurn {
    static public void machineTurn() {
        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(3);
        if ((positions[i][j].equals("J")) || positions[i][j].equals("M")) {
            machineTurn();
        } else {
            positions[i][j] = "M";
            disableButton(i, j);
        }
    }
}
