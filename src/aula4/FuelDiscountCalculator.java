/*
        13 - Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        Álcool
        até 20 litros, desconto de 3% por litro
        acima de 20 litros, desconto de 5% por litro
        Gasolina
        até 20 litros, desconto de 4% por litro
        acima de 20 litros, desconto de 6% por litro

        Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
        (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente,
        sabendo-se que o preço do litro da gasolina é R$ 7,59 e o preço do litro do álcool é R$ 5,20.
*/

package aula4;

import java.math.BigDecimal;
import java.util.Scanner;

public class FuelDiscountCalculator {
    static final BigDecimal GASOLINE_PRICE = BigDecimal.valueOf(7.59);
    static final BigDecimal Alcohol_PRICE = BigDecimal.valueOf(5.20);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fuelType;
        BigDecimal litesOfFuel;

        do {
            System.out.println("enter 'A' for alcohol or 'G' for gasoline.");
            fuelType = in.nextLine();
        }while (!fuelType.equalsIgnoreCase("G") && !fuelType.equalsIgnoreCase("A"));

        System.out.println("Enter the fuel volume in liters.");
        litesOfFuel = in.nextBigDecimal();

        priceCalculator(fuelType,litesOfFuel);
    }

    private static void priceCalculator(String fuelType, BigDecimal litesOfFuel) {
        BigDecimal price;
        if (fuelType.equalsIgnoreCase("G")){
            if (litesOfFuel.compareTo(BigDecimal.valueOf(20)) <=0){
                price = litesOfFuel.multiply(GASOLINE_PRICE).multiply(BigDecimal.valueOf(0.97));
            }else {
                price = litesOfFuel.multiply(GASOLINE_PRICE).multiply(BigDecimal.valueOf(0.95));
            }
            System.out.printf("The total supplied were %.2f liters of gasoline, and the total price was $%.2f",litesOfFuel,price);
        } else{
            if (litesOfFuel.compareTo(BigDecimal.valueOf(20)) <=0){
                price = litesOfFuel.multiply(Alcohol_PRICE).multiply(BigDecimal.valueOf(0.96));
            }else {
                price = litesOfFuel.multiply(Alcohol_PRICE).multiply(BigDecimal.valueOf(0.94));
            }
            System.out.printf("The total supplied were %.2f liters of alcohol, and the total price was $%.2f",litesOfFuel,price);
        }
    }
}
