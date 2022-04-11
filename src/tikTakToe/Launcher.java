package tikTakToe;

import tikTakToe.components.MainWindow;

import javax.swing.SwingUtilities;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow main = new MainWindow();
        });
    }
}
