/*  7 - Crie um programa que receba 2 números e ao final mostre as seguintes operações:
        Soma
        Subtração
        Multiplicação
        Divisão
*/

package aula1;

import java.util.Scanner;

public class BasicOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstNumber;
        double secondNumber;

        System.out.println("Enter the first number");
        firstNumber = in.nextDouble();
        System.out.println("Enter the second number");
        secondNumber = in.nextDouble();

        System.out.printf("%.2f + %.2f = %.2f\n", firstNumber, secondNumber, sum(firstNumber,secondNumber));
        System.out.printf("%.2f - %.2f = %.2f\n", firstNumber, secondNumber, subtraction(firstNumber,secondNumber));
        System.out.printf("%.2f * %.2f = %.2f\n", firstNumber, secondNumber, multiplication(firstNumber,secondNumber));
        System.out.printf("%.2f / %.2f = %.2f\n", firstNumber, secondNumber, division(firstNumber,secondNumber));

    }
    static double sum(double first, double second){
        return first + second;
    }
    static double subtraction(double first, double second){
        return first - second;
    }
    static double multiplication(double first, double second){
        return first * second;
    }
    static double division(double first, double second){
        return first / second;
    }
}
