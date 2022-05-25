package oop2Class1;

import java.util.Scanner;

public class Menu {
    public static void initialize() {
        do  {
            Scanner in = new Scanner(System.in);
            int menuOption;
            Operation operation;
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
                    operation = new Sum();
                    operation.Calculate(enterNumber(in), enterNumber(in));
                }
                case 2 -> {

                    operation = new Subtraction();
                    operation.Calculate(enterNumber(in), enterNumber(in));
                }
                case 3 -> {
                    operation = new Multiplication();
                    operation.Calculate(enterNumber(in), enterNumber(in));
                }
                case 4 -> {
                    operation = new Division();
                    operation.Calculate(enterNumber(in), enterNumber(in));
                }
                case 0 -> {
                    System.out.println("Bye.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option!");
            }
        }while (true);
    }
    private static double enterNumber(Scanner in){
        System.out.println("Enter an number.");
        return in.nextDouble();
    }
}
