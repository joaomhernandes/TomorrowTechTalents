// 11.	Uma loja está vendendo seus produtos em 5 prestações sem juros. Faça um programa que insira o valor total de uma compra e o valor das prestações.

package aula1;

import java.math.BigDecimal;
import java.util.Scanner;

public class ForwardSale {
    static final int NUMBER_OF_INSTALLMENTS = 5;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal salePrice;
        BigDecimal installment;

        System.out.println("Enter the sale price");
        salePrice = in.nextBigDecimal();
        installment = salePrice.divide(BigDecimal.valueOf(NUMBER_OF_INSTALLMENTS));

        System.out.printf("You must pay %d installments of $%.2f", NUMBER_OF_INSTALLMENTS, installment);


    }
}
