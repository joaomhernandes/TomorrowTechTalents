/*       12 - Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
         Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$1.500,00
         mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
*/

package aula4;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.*;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal fixedSalary;
        BigDecimal totalSalary;
        BigDecimal totalSales;

        System.out.println("Enter the seller's fixed salary.");
        fixedSalary = in.nextBigDecimal();
        System.out.println("Enter the total the seller's total sales");
        totalSales = in.nextBigDecimal();

        if(totalSales.compareTo(valueOf(1500)) > 0){
            totalSalary = fixedSalary.add(totalSales.multiply(BigDecimal.valueOf(0.05)));
        }else{
            totalSalary = fixedSalary.add(totalSales.multiply(BigDecimal.valueOf(0.03)));
        }

        System.out.printf("The seller's fixed salary is $%.2f, the seller's total sales is $%.2f, and the seller's total salary will be $%.2f", fixedSalary, totalSales, totalSalary);
    }
}
