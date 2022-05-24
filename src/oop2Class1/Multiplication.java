package oop2Class1;

import java.util.Scanner;

public class Multiplication extends Operation{
    public Multiplication() {
    }

    @Override
    public void Calculate(double firstNumber, double secondNumber) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%.2f * %.2f = %.2f\n",firstNumber, secondNumber, firstNumber * secondNumber);
    }
}
