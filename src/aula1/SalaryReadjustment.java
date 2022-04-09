/*  5 - Crie um programa que com base em um salário de um funcionário,
    reajusta o salário em 7% e mostra o valor antes do reajuste e após.
*/


package aula1;

import java.math.BigDecimal;
import java.util.Scanner;

public class SalaryReadjustment {
    final static double SALARY_READJUSTMENT = 0.07;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal salary;
        BigDecimal newSalary;

        System.out.println("Enter you salary");
        salary = in.nextBigDecimal();
        newSalary = salary.add(salary.multiply(new BigDecimal(SALARY_READJUSTMENT)));
        System.out.printf("Your current salary is $%.2f\n" +
                "And your salary after the readjustment will be $%.2f", salary, newSalary);



    }
}
