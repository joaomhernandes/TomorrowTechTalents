/*      07 -Escreva um programa que recebe um número inteiro maior que zero e calcula o seu valor fatorial.

        Exemplo: Entrada usuário: 6, saída do programa: 720
        Explicação: 6 x 5 x 4 x 3 x 2 x 1 = 720
*/

package aula3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Enter the integer number that you want calculate the factorial.");
        number = in.nextInt();
        System.out.printf("The factorial of %d is %d.\n", number, factorial(number));
    }

    private static int factorial(int number) {
        int factorial = 1;
        for(int i =number; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }
}
