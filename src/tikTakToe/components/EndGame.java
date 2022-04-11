package tikTakToe.components;

import javax.swing.*;

import static tikTakToe.components.Reset.reset;

public class EndGame {
    static public void endGame(String message) {
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
}
