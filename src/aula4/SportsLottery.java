/*      06 - Escreva um programa que leia um vetor de 13 elementos inteiros,
        que é o Gabarito de um teste da loteria esportiva, contendo os valores
        1(coluna 1), 2 (coluna 2) e 3 (coluna 3). Leia, a seguir, para cada apostador,
        o número do seu cartão e um vetor de Respostas de 13 posições.
        Verifique para cada apostador o números de acertos, comparando o vetor de Gabarito com o vetor de Respostas.
        Escreva o número do apostador e o número de acertos. Se o apostador tiver 13 acertos,
        mostrar a mensagem "Ganhador".
*/

package aula4;

import java.util.Random;
import java.util.Scanner;

public class SportsLottery {
    static int numberOfWinners = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] lotteryResult = createArray();
        System.out.println("Enter the number of bets.");
        int numberBets = in.nextInt();
        int[][] bets = createBets(numberBets);

        System.out.println("\nThe Spots Lottery result is:");
        printarray(lotteryResult);
        System.out.println("\nThe Bets made are: ");
        for (int[] bet : bets) {
            printarray(bet);
        }
        winnerVerify(lotteryResult, bets);
        if (numberOfWinners == 0){
            System.out.println("\nThis Sports Lottery had no winner!");
        }


    }

    private static void printarray(int[] array) {
        System.out.print("[  ");
        for (int number : array ){
            System.out.printf("%d  ", number);
        }
        System.out.print("]\n");
    }

    private static void winnerVerify(int[] lotteryResult, int[][] bets) {

        for (int i = 0; i < bets.length; i++ ) {
            boolean winner = true;
            for (int j = 0; j < bets[0].length; j++){
                if(bets[i][j] != lotteryResult[j]){
                    winner = false;
                    break;
                }
            }
            if (winner){
                System.out.printf("\nThe bet nº %d is a Winner!!", i+1);
                numberOfWinners++;
            }

        }
    }

    private static int[][] createBets(int numberBets) {
        int[][] bets = new int[numberBets][13];
        for(int i = 0; i < numberBets; i++){
            bets[i] = createArray();
        }

        return bets;
    }

    private static int[] createArray() {
        Random random = new Random();
        int[] array = new int[13];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(2) + 1;
        }
        return array;
    }

}
