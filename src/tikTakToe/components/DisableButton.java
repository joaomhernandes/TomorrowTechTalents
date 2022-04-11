package tikTakToe.components;

import static tikTakToe.components.CheckWinner.checkWinner;

class DisableButton {
    static void disableButton(int i, int j) {
        String button = i + String.valueOf(j);
        switch (button) {
            case "00" -> {
                MainWindow.getButton11().setIcon(MainWindow.getX());
                MainWindow.getButton11().setEnabled(false);
                checkWinner();
            }
            case "01" -> {
                MainWindow.getButton12().setIcon(MainWindow.getX());
                MainWindow.getButton12().setEnabled(false);
                checkWinner();
            }
            case "02" -> {
                MainWindow.getButton13().setIcon(MainWindow.getX());
                MainWindow.getButton13().setEnabled(false);
                checkWinner();
            }
            case "10" -> {
                MainWindow.getButton21().setIcon(MainWindow.getX());
                MainWindow.getButton21().setEnabled(false);
                checkWinner();
            }
            case "11" -> {
                MainWindow.getButton22().setIcon(MainWindow.getX());
                MainWindow.getButton22().setEnabled(false);
                checkWinner();
            }
            case "12" -> {
                MainWindow.getButton23().setIcon(MainWindow.getX());
                MainWindow.getButton23().setEnabled(false);
                checkWinner();
            }
            case "20" -> {
                MainWindow.getButton31().setIcon(MainWindow.getX());
                MainWindow.getButton31().setEnabled(false);
                checkWinner();
            }
            case "21" -> {
                MainWindow.getButton32().setIcon(MainWindow.getX());
                MainWindow.getButton32().setEnabled(false);
                checkWinner();
            }
            case "22" -> {
                MainWindow.getButton33().setIcon(MainWindow.getX());
                MainWindow.getButton33().setEnabled(false);
                checkWinner();
            }
            default -> throw new IllegalStateException("Unexpected value: " + button);
        }
    }
}
