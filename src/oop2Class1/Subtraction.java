package oop2Class1;

import java.util.Scanner;

public class Subtraction extends Operation{
    public Subtraction() {
    }

    @Override
    public void Calculate(double firstNumber, double secondNumber) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%.2f - %.2f = %.2f\n\n",firstNumber, secondNumber, firstNumber - secondNumber);
    }
}
