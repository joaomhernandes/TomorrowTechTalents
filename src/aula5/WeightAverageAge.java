/*      08 - Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
        A quantidade de pessoas com mais de 90 quilos;
        A média das idades das sete pessoas;
*/

package aula5;

import java.util.Scanner;

public class WeightAverageAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double averageAge = 0;
        int over90Quantity = 0;

        for(int i = 0; i < 7; i++){
            System.out.println("How old are you?");
            averageAge += in.nextDouble();
            System.out.println("What's your weight?");
            if(in.nextInt() >= 90){
                over90Quantity++;
            }
        }
        System.out.printf("""
                Ther are %d persons with 90 kg or more.
                The average age for these people is %.2f""",
                over90Quantity, averageAge/7);

    }
}
