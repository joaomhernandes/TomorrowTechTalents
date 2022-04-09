/*  6 -Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
        Dólar
        Euro
        Libra
*/
package aula1;

import java.math.BigDecimal;
import java.util.Scanner;

public class CoinConverter {
    static final double CONVERSION_FACTOR_BRL_USD = 0.2129;
    static final double CONVERSION_FACTOR_BRL_EUR = 0.1957;
    static final double CONVERSION_FACTOR_BRL_GBP = 0.1634;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal brl;
        BigDecimal usd;
        BigDecimal eur;
        BigDecimal gbp;

        System.out.println("Enter the amount of Reais (BRL) do you want convert");
        brl = in.nextBigDecimal();
        usd = brl.multiply(new BigDecimal(CONVERSION_FACTOR_BRL_USD));
        eur = brl.multiply(new BigDecimal(CONVERSION_FACTOR_BRL_EUR));
        gbp = brl.multiply(new BigDecimal(CONVERSION_FACTOR_BRL_GBP));
        System.out.printf("R$%.2f is\n$%.2f\n€%.2f\n£%.2f", brl, usd, eur, gbp);

    }
}
