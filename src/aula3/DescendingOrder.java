/*      04 -Escreva um programa que receba 5 números inteiros,
        armazene-os em um array, e imprima na tela os valores em ordem decrescente.
*/

package aula3;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter the %dº number\n", i + 1);
            numbers[i] = in.nextInt();
        }
        orderNumbers(numbers);
        printNumbers(numbers);
    }

    private static void printNumbers(int[] numbers) {
        System.out.printf("Numbers in descending order [");
        for (int number : numbers) {
            System.out.printf(" %d ", number) ;
        }
        System.out.printf("]");
    }

    private static void orderNumbers(int[] numbers) {
        int aux;
        for (int k = 0 ; k <= numbers.length ; k++){
            for (int j = numbers.length - 1; j > 0; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    aux = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = aux;
                }

            }
        }
    }
}
