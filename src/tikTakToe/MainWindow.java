package tikTakToe;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import static tikTakToe.components.CreateButtons.createButtons;

public class MainWindow {

    static public final String[][] positions = new String[3][3];

    public static JButton button11 = new JButton();
    public static JButton button12 = new JButton();
    public static JButton button13 = new JButton();
    public static JButton button21 = new JButton();
    public static JButton button22 = new JButton();
    public static JButton button23 = new JButton();
    public static JButton button31 = new JButton();
    public static JButton button32 = new JButton();
    public static JButton button33 = new JButton();

    public static ImageIcon circle = new ImageIcon("src/tikTakToe/assets/TikTakToeCircle.png");
    public static ImageIcon x = new ImageIcon("src/tikTakToe/assets/TikTakToeX.png");


    public MainWindow() {
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                positions[i][j] = "";
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

        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button21);
        panel.add(button22);
        panel.add(button23);
        panel.add(button31);
        panel.add(button32);
        panel.add(button33);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}

