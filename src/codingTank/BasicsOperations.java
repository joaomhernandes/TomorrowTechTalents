package codingTank;

import java.util.Scanner;

public class BasicsOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the first number.");
        double firstNumber = in.nextDouble();
        System.out.println("Type the second number.");
        double secondNumber = in.nextDouble();

        System.out.printf("%.0f + %.0f = %.0f\n", firstNumber, secondNumber, (firstNumber + secondNumber));
        System.out.printf("%.0f - %.0f = %.0f\n", firstNumber, secondNumber, (firstNumber - secondNumber));
        System.out.printf("%.0f * %.0f = %.0f\n", firstNumber, secondNumber, (firstNumber * secondNumber));
        System.out.printf("%.0f / %.0f = %.2f\n", firstNumber, secondNumber, (firstNumber / secondNumber));
        in.close();
    }
}

