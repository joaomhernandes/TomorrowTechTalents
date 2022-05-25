package oop2Class1;

import java.util.Scanner;

public class Division extends Operation{
    public Division() {
    }

    @Override
    public void Calculate(double firstNumber, double secondNumber) {
        if(secondNumber!=0){
            System.out.printf("%.2f / %.2f = %.2f\n\n",firstNumber, secondNumber, firstNumber / secondNumber);
        }else {
            throw new ArithmeticException("Impossible to divide by 0");
        }
    }
}
