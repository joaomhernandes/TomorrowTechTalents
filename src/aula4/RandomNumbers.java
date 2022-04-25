//  01 - Escreva um código para armazenar 10 valores aleatórios até o número 100 do tipo double em um array;

package aula4;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        double [] numbers = new double[10];

        System.out.print("The random numbers:\n[ ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
            if (i != numbers.length - 1) {
                System.out.printf("%.2f , ", numbers[i]);
            }else {
                System.out.printf("%.2f ]", numbers[i]);
            }
        }
    }
}
