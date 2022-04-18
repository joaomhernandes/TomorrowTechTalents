// 08 -Escreva um programa que leia 10 valores inteiros e positivos e encontre o maior valor, o menor valor e calcule a média dos números lidos e exiba essas informações.

package aula3;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];
        int lower = 0;
        int highest = 0;
        double average = 0;

        for(int i = 0; i < numbers.length; i++){
            System.out.printf("Enter the %dº number.\n", i + 1 );
            numbers[i] = in.nextInt();
            if(numbers[i] > highest || i == 0){
                highest = numbers[i];
            }
            if(numbers[i] < lower || i == 0){
                lower = numbers[i];
            }
            average += numbers[i];
        }
        average /= numbers.length;

        System.out.printf("""
                The lower number is %d.
                The highest number is %d.
                And the average of these numbers is %.2f
                """, lower, highest, average);


    }
}
