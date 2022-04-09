// 10 - Crie um programa que receba um valor que foi depositado e logo em seguida o valor com rendimento após 1 mês. Considere a taxa de juros da poupança em 0,70% a.m.

package aula1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Investment {
    static final double MONTHLY_INTEREST = 0.007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal principal;
        BigDecimal amount;

        System.out.println("How much do you want to deposit?");
        principal = in.nextBigDecimal();
        amount = principal.multiply(new BigDecimal(1+MONTHLY_INTEREST));

        System.out.printf("You deposited $%.2f, and after one month, you will have $%.2f", principal, amount);

    }
}
