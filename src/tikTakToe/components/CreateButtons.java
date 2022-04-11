package tikTakToe.components;

import static tikTakToe.components.CheckWinner.checkWinner;
import static tikTakToe.components.MachineTurn.machineTurn;

class CreateButtons {
    static void createButtons(){
        MainWindow.getButton11().setFocusable(false);
        MainWindow.getButton11().addActionListener(e -> {
            MainWindow.getButton11().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[0][0] = "J";
            MainWindow.getButton11().setEnabled(false);
            checkWinner();
            machineTurn();
        });

        MainWindow.getButton12().setFocusable(false);
        MainWindow.getButton12().addActionListener(e -> {
            MainWindow.getButton12().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[0][1] = "J";
            MainWindow.getButton12().setEnabled(false);
            checkWinner();
            machineTurn();
        });

        MainWindow.getButton13().setFocusable(false);
        MainWindow.getButton13().addActionListener(e -> {
            MainWindow.getButton13().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[0][2] = "J";
            MainWindow.getButton13().setEnabled(false);
            checkWinner();
            machineTurn();
        });

        MainWindow.getButton21().setFocusable(false);
        MainWindow.getButton21().addActionListener(e -> {
            MainWindow.getButton21().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[1][0] = "J";
            MainWindow.getButton21().setEnabled(false);
            checkWinner();
            machineTurn();
        });

        MainWindow.getButton22().setFocusable(false);
        MainWindow.getButton22().addActionListener(e -> {
            MainWindow.getButton22().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[1][1] = "J";
            MainWindow.getButton22().setEnabled(false);
            checkWinner();
            machineTurn();
        });

        MainWindow.getButton23().setFocusable(false);
        MainWindow.getButton23().addActionListener(e -> {
            MainWindow.getButton23().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[1][2] = "J";
            MainWindow.getButton23().setEnabled(false);
            checkWinner();
            machineTurn();
        });

        MainWindow.getButton31().setFocusable(false);
        MainWindow.getButton31().addActionListener(e -> {
            MainWindow.getButton31().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[2][0] = "J";
            MainWindow.getButton31().setEnabled(false);
            checkWinner();
            machineTurn();
        });

        MainWindow.getButton32().setFocusable(false);
        MainWindow.getButton32().addActionListener(e -> {
            MainWindow.getButton32().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[2][1] = "J";
            MainWindow.getButton32().setEnabled(false);
            checkWinner();
            machineTurn();
        });

        MainWindow.getButton33().setFocusable(false);
        MainWindow.getButton33().addActionListener(e -> {
            MainWindow.getButton33().setIcon(MainWindow.getCircle());
            MainWindow.getPositions()[2][2] = "J";
            MainWindow.getButton33().setEnabled(false);
            checkWinner();
            machineTurn();
        });
    }
}
