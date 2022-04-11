package tikTakToe.assets;

import static tikTakToe.MainWindow.positions;
import static tikTakToe.assets.EndGame.endGame;

public class CheckWinner {
    public static void checkWinner() {
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
}
