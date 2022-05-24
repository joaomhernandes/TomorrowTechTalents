package oop2Class1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menuOption = -1;
        double firstNumber;
        double secondNumber;
        Operation operation;
        while(menuOption != 0) {
            System.out.println("""
                    Enter an operation.
                    1 - Sum.
                    2 - Subtraction.
                    3 - Multiplication.
                    4 - Division.
                    0 - Exit.""");
            menuOption = in.nextInt();
            switch (menuOption) {
                case 1 -> {
                    System.out.println("Enter the first number.");
                    firstNumber = in.nextDouble();
                    System.out.println("Enter the second number.");
                    secondNumber = in.nextDouble();
                    operation = new Sum();
                    operation.Calculate(firstNumber, secondNumber);
                }
                case 2 -> {
                    System.out.println("Enter the first number.");
                    firstNumber = in.nextDouble();
                    System.out.println("Enter the second number.");
                    secondNumber = in.nextDouble();
                    operation = new Subtraction();
                    operation.Calculate(firstNumber, secondNumber);
                }
                case 3 -> {
                    System.out.println("Enter the first number.");
                    firstNumber = in.nextDouble();
                    System.out.println("Enter the second number.");
                    secondNumber = in.nextDouble();
                    operation = new Multiplication();
                    operation.Calculate(firstNumber, secondNumber);
                }
                case 4 -> {
                    System.out.println("Enter the first number.");
                    firstNumber = in.nextDouble();
                    System.out.println("Enter the second number.");
                    secondNumber = in.nextDouble();
                    operation = new Division();
                    operation.Calculate(firstNumber, secondNumber);
                }
                case 0 ->{
                    System.out.println("Bye.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
