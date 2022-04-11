package tikTakToe.components;

class Reset {
    static void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MainWindow.getPositions()[i][j] = "";
            }
        }
        MainWindow.getButton11().setIcon(null);
        MainWindow.getButton12().setIcon(null);
        MainWindow.getButton13().setIcon(null);
        MainWindow.getButton21().setIcon(null);
        MainWindow.getButton22().setIcon(null);
        MainWindow.getButton23().setIcon(null);
        MainWindow.getButton31().setIcon(null);
        MainWindow.getButton32().setIcon(null);
        MainWindow.getButton33().setIcon(null);

        MainWindow.getButton11().setEnabled(true);
        MainWindow.getButton12().setEnabled(true);
        MainWindow.getButton13().setEnabled(true);
        MainWindow.getButton21().setEnabled(true);
        MainWindow.getButton22().setEnabled(true);
        MainWindow.getButton23().setEnabled(true);
        MainWindow.getButton31().setEnabled(true);
        MainWindow.getButton32().setEnabled(true);
        MainWindow.getButton33().setEnabled(true);
    }

}

