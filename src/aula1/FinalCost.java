 /*     13.	O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos.
        Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%. Escreva um programa que leia o custo de fábrica e informe o custo ao consumidor final.
*/
package aula1;

 import java.math.BigDecimal;
 import java.util.Scanner;

 public class FinalCost {
     static final BigDecimal DISTRIBUTOR_PERCENTAGE = BigDecimal.valueOf(0.28);
     static final BigDecimal TAX = BigDecimal.valueOf(0.45);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal factoryCost;
        BigDecimal endConsumerCost;

        System.out.println("Enter the factory cost of the car.");
        factoryCost = in.nextBigDecimal();
        endConsumerCost = factoryCost.multiply(DISTRIBUTOR_PERCENTAGE.add(BigDecimal.valueOf(1))).multiply(TAX.add(BigDecimal.valueOf(1)));
        System.out.printf("The Factory cost of this car is $%.2f, the distributor percentage is %.2f%% and the tax is %.2f%%.\n" +
                "The end costumer cost wil be $%.2f", factoryCost, DISTRIBUTOR_PERCENTAGE.multiply(BigDecimal.valueOf(100)), TAX.multiply(BigDecimal.valueOf(100)), endConsumerCost);
    }
}
