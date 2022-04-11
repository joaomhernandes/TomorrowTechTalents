package tikTakToe.components;

import java.util.concurrent.atomic.AtomicReference;

import static tikTakToe.components.MainWindow.positions;
import static tikTakToe.components.EndGame.endGame;

class CheckWinner {
    static void checkWinner() {
        AtomicReference<String> message = new AtomicReference<>();

        if ((positions[0][0].equals(positions[0][1]) && positions[0][0].equals(positions[0][2]) && positions[0][0].equals("J")) ||
                (positions[1][0].equals(positions[1][1]) && positions[1][0].equals(positions[1][2]) && positions[1][0].equals("J")) ||
                (positions[2][0].equals(positions[2][1]) && positions[2][0].equals(positions[2][2]) && positions[2][0].equals("J")) ||
                (positions[0][0].equals(positions[1][0]) && positions[0][0].equals(positions[2][0]) && positions[0][0].equals("J")) ||
                (positions[0][1].equals(positions[1][1]) && positions[0][1].equals(positions[2][1]) && positions[0][1].equals("J")) ||
                (positions[0][2].equals(positions[1][2]) && positions[0][2].equals(positions[2][2]) && positions[0][2].equals("J")) ||
                (positions[0][0].equals(positions[1][1]) && positions[0][0].equals(positions[2][2]) && positions[0][0].equals("J")) ||
                (positions[0][2].equals(positions[1][1]) && positions[0][2].equals(positions[2][0]) && positions[0][2].equals("J"))) {
            message.set("Congratulations!! You win!!!");
            endGame(message.get());

        }
        if ((positions[0][0].equals(positions[0][1]) && positions[0][0].equals(positions[0][2]) && positions[0][0].equals("M")) ||
                (positions[1][0].equals(positions[1][1]) && positions[1][0].equals(positions[1][2]) && positions[1][0].equals("M")) ||
                (positions[2][0].equals(positions[2][1]) && positions[2][0].equals(positions[2][2]) && positions[2][0].equals("M")) ||
                (positions[0][0].equals(positions[1][0]) && positions[0][0].equals(positions[2][0]) && positions[0][0].equals("M")) ||
                (positions[0][1].equals(positions[1][1]) && positions[0][1].equals(positions[2][1]) && positions[0][1].equals("M")) ||
                (positions[0][2].equals(positions[1][2]) && positions[0][2].equals(positions[2][2]) && positions[0][2].equals("M")) ||
                (positions[0][0].equals(positions[1][1]) && positions[0][0].equals(positions[2][2]) && positions[0][0].equals("M")) ||
                (positions[0][2].equals(positions[1][1]) && positions[0][2].equals(positions[2][0]) && positions[0][2].equals("M"))) {
            message.set("Unfortunately you lost!!");
            endGame(message.get());
        }
        if (!positions[0][0].equals("") && !positions[0][1].equals("") && !positions[0][2].equals("") &&
                !positions[1][0].equals("") && !positions[1][1].equals("") && !positions[1][2].equals("") &&
                !positions[2][0].equals("") && !positions[2][1].equals("") && !positions[2][2].equals("")) {
            message.set("The match ends in a draw!!");
            endGame(message.get());
        }
    }
}
