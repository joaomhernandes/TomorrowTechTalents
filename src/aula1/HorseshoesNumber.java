//  15.	Escreva um programa para calcular a quantidade de ferraduras necessárias para equipar todos os cavalos comprados para um haras. A informação de cavalos comprados deve ser informada pelo usuário.

package aula1;

import java.util.Scanner;

public class HorseshoesNumber {
    static final int NUMBER_OF_LEGS = 4;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfHorses;
        int numberOfHorseshoes;

        System.out.println("Enter the number of horses.");
        numberOfHorses = in.nextInt();
        numberOfHorseshoes = numberOfHorses * NUMBER_OF_LEGS;

        System.out.printf("For %d horse, is needed %d horseshoes.", numberOfHorses, numberOfHorseshoes);
    }
}
