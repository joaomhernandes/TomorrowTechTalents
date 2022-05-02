/*      02 - Faça um programa para uma loja de tintas.
        O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
        Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
        e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
        Informe ao usuário a quantidade de latas de tinta a serem compradas e o preço total.
*/

package aula6;

import java.util.Scanner;

public class PaintStore {
    static final double PAINT_CAN_PRICE = 80.00;
    static final int PAINT_CAN_VOLUME = 18;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double size;
        double volume;
        double cans;
        double price;

        System.out.println("What is the size of the area to be painted? (m²)");
        size = in.nextDouble();
        volume = size / 3 ;
        volume = volume / PAINT_CAN_VOLUME;
        cans =  Math.ceil(volume);
        price = cans * PAINT_CAN_PRICE;
        System.out.printf("You will need %.1f cans, and the total price will be $%.2f",cans, price);

    }
}
