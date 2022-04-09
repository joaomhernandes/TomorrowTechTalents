/*  3 - Escreva um programa que realize o cálculo do empréstimo a juros compostos. Onde definimos:
        o valor da variável de quanto a pessoa quer emprestado;
        em quantos meses ela irá pagar
        A taxa de juros será de 2% ao mês
        Fórmula: M = C * (1+i)^t
        M = valor final após a aplicação dos juros
        C = valor que a pessoa vai pegar emprestado
        i é a taxa de juros
        t é o tempo
        Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros
*/

package aula1;

import java.math.BigDecimal;
import java.util.Scanner;

public class CompoundInterestLoan {
    final static double MONTHLY_INTEREST = 0.02;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal amount;
        BigDecimal principal;
        double totalInterest;
        int months;

        System.out.println("Enter how much you need to borrow");
        principal = in.nextBigDecimal();
        System.out.println("Enter in how many months you will pay your loan");
        months = in.nextInt();
        totalInterest = Math.pow((1+MONTHLY_INTEREST),months);
        amount = principal.multiply(new BigDecimal(totalInterest));

        System.out.printf("The amount you will need to pay is $%.2f",amount);


    }
}
