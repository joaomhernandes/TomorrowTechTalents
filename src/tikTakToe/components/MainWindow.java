package tikTakToe.components;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import static tikTakToe.components.CreateButtons.createButtons;

public class MainWindow {

    static final String[][] positions = new String[3][3];

    private static final JButton button11 = new JButton();
    private static final JButton button12 = new JButton();
    private static final JButton button13 = new JButton();
    private static final JButton button21 = new JButton();
    private static final JButton button22 = new JButton();
    private static final JButton button23 = new JButton();
    private static final JButton button31 = new JButton();
    private static final JButton button32 = new JButton();
    private static final JButton button33 = new JButton();

    private static final ImageIcon circle = new ImageIcon("src/tikTakToe/assets/TikTakToeCircle.png");
    private static final ImageIcon x = new ImageIcon("src/tikTakToe/assets/TikTakToeX.png");


    public MainWindow() {
        initialize();
    }

    static String[][] getPositions() {
        return positions;
    }

    static JButton getButton11() {
        return button11;
    }

    static JButton getButton12() {
        return button12;
    }

    static JButton getButton13() {
        return button13;
    }

    static JButton getButton21() {
        return button21;
    }

    static JButton getButton22() {
        return button22;
    }

    static JButton getButton23() {
        return button23;
    }

    static JButton getButton31() {
        return button31;
    }

    static JButton getButton32() {
        return button32;
    }

    static JButton getButton33() {
        return button33;
    }

    static ImageIcon getCircle() {
        return circle;
    }
    static ImageIcon getX() {
        return x;
    }

    private void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                getPositions()[i][j] = "";
            }
        }
        JFrame frame = new JFrame();
        frame.setTitle("Tik-Tak-Toe");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 5, 5));
        panel.setBackground(Color.BLACK);
        createButtons();

        panel.add(getButton11());
        panel.add(getButton12());
        panel.add(getButton13());
        panel.add(getButton21());
        panel.add(getButton22());
        panel.add(getButton23());
        panel.add(getButton31());
        panel.add(getButton32());
        panel.add(getButton33());

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}

