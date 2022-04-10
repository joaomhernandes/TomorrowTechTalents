// 12.	Faça um programa que receba o preço de custo do produto e exiba o valor de venda. O valor de venda receberá um acréscimo de acordo com o percentual informado pelo usuário.

package aula1;

import java.math.BigDecimal;
import java.util.Scanner;

public class SalePrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal productCost;
        BigDecimal percentageIncrease;
        BigDecimal salePrice;

        System.out.println("Enter the product cost.");
        productCost = in.nextBigDecimal();
        System.out.println("Enter the percentage Increase.");
        percentageIncrease = in.nextBigDecimal().divide(BigDecimal.valueOf(100));
        salePrice = productCost.multiply(percentageIncrease.add(BigDecimal.valueOf(1)));

        System.out.printf("The sale price must to be $%.2f", salePrice);


    }
}
