//  11- Escreva um programa que receba dois números inteiros e imprima os números inteiros que estão no intervalo compreendido entre eles.


package aula3;

import java.util.Scanner;

public class NumbersBetween {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Enter the first number.");
        firstNumber = in.nextInt();
        System.out.println("Enter the second number.");
        secondNumber = in.nextInt();

        if (firstNumber < secondNumber) {
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                System.out.printf(" %d ", i);
            }
        } else
            for (int i = secondNumber + 1; i < firstNumber; i++) {
                System.out.printf(" %d ", i);
            }
    }
}
