package tikTakToe;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.*;

public class MainWindow {

    private JFrame frame;
    private final String[][] positions = new String[3][3];
    int  playNumber = 0;

    JButton button11 = new JButton();
    JButton button12 = new JButton();
    JButton button13 = new JButton();
    JButton button21 = new JButton();
    JButton button22 = new JButton();
    JButton button23 = new JButton();
    JButton button31 = new JButton();
    JButton button32 = new JButton();
    JButton button33 = new JButton();

    ImageIcon circle = new ImageIcon("D:\\Programacao\\Let's Code\\TomorrowTechTalents\\src\\TikTakToe\\TikTakToeCircle.png");
    ImageIcon x = new ImageIcon("D:\\Programacao\\Let's Code\\TomorrowTechTalents\\src\\TikTakToe\\TikTakToeX.png");


    public MainWindow() {
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                positions[i][j] = "";
            }
        }
        frame = new JFrame();
        this.frame.setTitle("Tik-Tak-Toe");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(600, 600);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 5, 5));
        panel.setBackground(Color.BLACK);


        button11.setFocusable(false);
        button11.addActionListener(e -> {
            button11.setIcon(circle);
            positions[0][0] = "J";
            button11.setEnabled(false);
            checkWinner();
            machineTurn();
        });


        button12.setFocusable(false);
        button12.addActionListener(e -> {
            button12.setIcon(circle);
            positions[0][1] = "J";
            button12.setEnabled(false);
            checkWinner();
            machineTurn();
        });


        button13.setFocusable(false);
        button13.addActionListener(e -> {
            button13.setIcon(circle);
            positions[0][2] = "J";
            button13.setEnabled(false);
            checkWinner();
            machineTurn();
        });


        button21.setFocusable(false);
        button21.addActionListener(e -> {
            button21.setIcon(circle);
            positions[1][0] = "J";
            button21.setEnabled(false);
            checkWinner();
            machineTurn();
        });


        button22.setFocusable(false);
        button22.addActionListener(e -> {
            button22.setIcon(circle);
            positions[1][1] = "J";
            button22.setEnabled(false);
            checkWinner();
            machineTurn();
        });


        button23.setFocusable(false);
        button23.addActionListener(e -> {
            button23.setIcon(circle);
            positions[1][2] = "J";
            button23.setEnabled(false);
            checkWinner();
            machineTurn();
        });


        button31.setFocusable(false);
        button31.addActionListener(e -> {
            button31.setIcon(circle);
            positions[2][0] = "J";
            button31.setEnabled(false);
            checkWinner();
            machineTurn();
        });


        button32.setFocusable(false);
        button32.addActionListener(e -> {
            button32.setIcon(circle);
            positions[2][1] = "J";
            button32.setEnabled(false);
            checkWinner();
            machineTurn();
        });


        button33.setFocusable(false);
        button33.addActionListener(e -> {
            button33.setIcon(circle);
            positions[2][2] = "J";
            button33.setEnabled(false);
            checkWinner();
            machineTurn();
        });


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

        this.frame.setVisible(true);
    }

    private void machineTurn() {
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

    private void disableButton(int i, int j) {
        String button = String.valueOf(i) + String.valueOf(j);
        switch (button) {
            case "00" -> {
                button11.setIcon(x);
                button11.setEnabled(false);
                checkWinner();
            }
            case "01" -> {
                button12.setIcon(x);
                button12.setEnabled(false);
                checkWinner();
            }
            case "02" -> {
                button13.setIcon(x);
                button13.setEnabled(false);
                checkWinner();
            }
            case "10" -> {
                button21.setIcon(x);
                button21.setEnabled(false);
                checkWinner();
            }
            case "11" -> {
                button22.setIcon(x);
                button22.setEnabled(false);
                checkWinner();
            }
            case "12" -> {
                button23.setIcon(x);
                button23.setEnabled(false);
                checkWinner();
            }
            case "20" -> {
                button31.setIcon(x);
                button31.setEnabled(false);
                checkWinner();
            }
            case "21" -> {
                button32.setIcon(x);
                button32.setEnabled(false);
                checkWinner();
            }
            case "22" -> {
                button33.setIcon(x);
                button33.setEnabled(false);
                checkWinner();
            }
        }
    }

    private void checkWinner() {
        String message;

        if ((positions[0][0].equals(positions[0][1]) && positions[0][0].equals(positions[0][2]) && positions[0][0].equals("J")) ||
                (positions[1][0].equals(positions[1][1]) && positions[1][0].equals(positions[1][2]) && positions[1][0].equals("J")) ||
                (positions[2][0].equals(positions[2][1]) && positions[2][0].equals(positions[2][2]) && positions[2][0].equals("J")) ||
                (positions[0][0].equals(positions[1][0]) && positions[0][0].equals(positions[2][0]) && positions[0][0].equals("J")) ||
                (positions[0][1].equals(positions[1][1]) && positions[0][1].equals(positions[2][1]) && positions[0][1].equals("J")) ||
                (positions[0][2].equals(positions[1][2]) && positions[0][2].equals(positions[2][2]) && positions[0][2].equals("J")) ||
                (positions[0][0].equals(positions[1][1]) && positions[0][0].equals(positions[2][2]) && positions[0][0].equals("J")) ||
                (positions[0][2].equals(positions[1][1]) && positions[0][2].equals(positions[2][0]) && positions[0][2].equals("J"))) {
            message = "Parabéns! Você venceu!!";
            endGame(message);

        }
        if ((positions[0][0].equals(positions[0][1]) && positions[0][0].equals(positions[0][2]) && positions[0][0].equals("M")) ||
                (positions[1][0].equals(positions[1][1]) && positions[1][0].equals(positions[1][2]) && positions[1][0].equals("M")) ||
                (positions[2][0].equals(positions[2][1]) && positions[2][0].equals(positions[2][2]) && positions[2][0].equals("M")) ||
                (positions[0][0].equals(positions[1][0]) && positions[0][0].equals(positions[2][0]) && positions[0][0].equals("M")) ||
                (positions[0][1].equals(positions[1][1]) && positions[0][1].equals(positions[2][1]) && positions[0][1].equals("M")) ||
                (positions[0][2].equals(positions[1][2]) && positions[0][2].equals(positions[2][2]) && positions[0][2].equals("M")) ||
                (positions[0][0].equals(positions[1][1]) && positions[0][0].equals(positions[2][2]) && positions[0][0].equals("M")) ||
                (positions[0][2].equals(positions[1][1]) && positions[0][2].equals(positions[2][0]) && positions[0][2].equals("M"))) {
            message = "Infelizmente você perdeu!!";
            endGame(message);
        }
        if (!positions[0][0].equals("") && !positions[0][1].equals("") && !positions[0][2].equals("") &&
                !positions[1][0].equals("") && !positions[1][1].equals("") && !positions[1][2].equals("") &&
                !positions[2][0].equals("") && !positions[2][1].equals("") && !positions[2][2].equals("")) {
            message = "A partida teminou empatada!!";
            endGame(message);
        }
    }

    private void endGame(String message) {
        JFrame frame = new JFrame("Fim de jogo");

        int answer = JOptionPane.showConfirmDialog(frame,message + "\nDeseja reiniciar o jogo?", "Fim de jogo", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Reiniciando tabuleiro.");
            reset();

        }
        else {
            JOptionPane.showMessageDialog(null, "Até logo");
            System.exit(0);
        }
    }

    private void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                positions[i][j] = "";
            }
        }
        playNumber = 0;
        button11.setIcon(null);
        button12.setIcon(null);
        button13.setIcon(null);
        button21.setIcon(null);
        button22.setIcon(null);
        button23.setIcon(null);
        button31.setIcon(null);
        button32.setIcon(null);
        button33.setIcon(null);

        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button21.setEnabled(true);
        button22.setEnabled(true);
        button23.setEnabled(true);
        button31.setEnabled(true);
        button32.setEnabled(true);
        button33.setEnabled(true);

    }

}

