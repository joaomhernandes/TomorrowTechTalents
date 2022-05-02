/*      06 - Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
        da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e
        que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam
        R$ 25,00. Informe ao usuário as quantidades de tinta a serem compradas e os respetivos preços em 2 situações:
        a) comprar apenas latas de 18 litros;
        b) comprar apenas galões de 3,6 litros;
*/

package aula6;

import java.util.Scanner;

public class PaintStore1 {
    static final double PAINT_CAN_PRICE = 80.00;
    static final double PAINT_CAN_VOLUME = 18;
    static final double PAINT_GALLON_PRICE = 25.00;
    static final double PAINT_GALLON_VOLUME = 3.6;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double size;
        double volume;

        System.out.println("What is the size of the area to be painted? (m²)");
        size = in.nextDouble();
        volume = size / 6 ;
        canCalculate(volume);
        gallonCalculate(volume);
    }

    private static void canCalculate(double volume) {
        double cans;
        double price;
        volume = volume / PAINT_CAN_VOLUME;
        cans =  Math.ceil(volume);
        price = cans * PAINT_CAN_PRICE;
        System.out.printf("You will need %.1f 18L cans, and the total price will be $%.2f\n",cans, price);
    }

    private static void gallonCalculate(double volume) {
        double gallons;
        double price;
        volume = volume / PAINT_GALLON_VOLUME;
        gallons =  Math.ceil(volume);
        price = gallons * PAINT_GALLON_PRICE;
        System.out.printf("You will need %.1f 3,6L gallons, and the total price will be $%.2f\n",gallons, price);

    }
}
