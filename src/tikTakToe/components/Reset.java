package tikTakToe.components;

import tikTakToe.MainWindow;

public class Reset {

    static public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MainWindow.positions[i][j] = "";
            }
        }
        MainWindow.button11.setIcon(null);
        MainWindow.button12.setIcon(null);
        MainWindow.button13.setIcon(null);
        MainWindow.button21.setIcon(null);
        MainWindow.button22.setIcon(null);
        MainWindow.button23.setIcon(null);
        MainWindow.button31.setIcon(null);
        MainWindow.button32.setIcon(null);
        MainWindow.button33.setIcon(null);

        MainWindow.button11.setEnabled(true);
        MainWindow.button12.setEnabled(true);
        MainWindow.button13.setEnabled(true);
        MainWindow.button21.setEnabled(true);
        MainWindow.button22.setEnabled(true);
        MainWindow.button23.setEnabled(true);
        MainWindow.button31.setEnabled(true);
        MainWindow.button32.setEnabled(true);
        MainWindow.button33.setEnabled(true);
    }

}

