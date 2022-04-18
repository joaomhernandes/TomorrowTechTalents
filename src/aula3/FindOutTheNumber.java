/*    10- Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e peça que o usuário informe o número correto,
        você deve dar dicas caso o palpite esteja errado, informando se o número correto é maior ou menor do que o informado,
        caso ele erre três vezes o programa se encerra e imprime uma mensagem informando que ele perdeu.
*/

package aula3;

import java.util.Random;
import java.util.Scanner;

public class FindOutTheNumber {
    static final int MAX_ATTEMPTS = 3;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomNumber;
        int guessNumber;

        randomNumber = random.nextInt(10) + 1;

        for(int i = 0; i < MAX_ATTEMPTS; i++){
            System.out.println("Enter your guess( 1 - 10 )");
            guessNumber = in.nextInt();
            if (guessNumber == randomNumber){
                System.out.printf("""
                        Congratulations!!!
                        You found the number!!!
                        The number was %d""", randomNumber);
                    System.exit(0);
            } else if (guessNumber < randomNumber) {
                System.out.println("""
                        Sorry, but you're wrong!
                        The number is higher than your guess!""");
            } else {
                System.out.println("""
                        Sorry, but you're wrong!
                        The number is lower than your guess!""");
            }
            }
        System.out.printf("""
                        Sorry, but you have no more attempts!
                        The number was %d""", randomNumber);
    }
}
