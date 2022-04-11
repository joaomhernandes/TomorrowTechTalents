package tikTakToe.components;

import java.util.Random;

import static tikTakToe.components.DisableButton.disableButton;

class MachineTurn {
    static void machineTurn() {
        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(3);
        if ((MainWindow.positions[i][j].equals("J")) || MainWindow.positions[i][j].equals("M")) {
            machineTurn();
        } else {
            MainWindow.positions[i][j] = "M";
            disableButton(i, j);
        }
    }
}
