package codingTank;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;

        System.out.println("Enter the first number.");
        firstNumber = in.nextDouble();
        System.out.println("Enter the second number.");
        secondNumber = in.nextDouble();

        if(firstNumber >= secondNumber){
            System.out.printf("The biggest number is %.2f, %.2f square is %.2f and cubed %.2f is %.2f",firstNumber,firstNumber,Math.pow(firstNumber,2),secondNumber,Math.pow(secondNumber,3));
        }else {
            System.out.printf("The biggest number is %.2f, %.2f square is %.2f and cubed %.2f is %.2f",secondNumber,secondNumber,Math.pow(secondNumber,2),firstNumber,Math.pow(firstNumber,3));
        }
        in.close();
    }
}
