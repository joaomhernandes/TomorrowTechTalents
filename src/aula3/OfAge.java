// 09 - Escreva um programa que exiba quantas pessoas possuem mais de 18 anos. O algoritmo deverá ler a idade de 10 pessoas.

package aula3;

import java.util.Scanner;

public class OfAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] ages = new int[10];
        int peopleOfAges = 0;

        for(int i = 0; i < ages.length; i++){
            System.out.printf("Enter the age of the %dº person.\n", i + 1);
            ages[i] = in.nextInt();
            if (ages[i] >= 18){
                peopleOfAges ++;
            }
        }
        if (peopleOfAges > 1) {
            System.out.printf("There are %d persons of age", peopleOfAges);
        } else if (peopleOfAges == 1) {
            System.out.printf("There is %d persons of age", peopleOfAges);
        }else {
            System.out.printf("There isn't any persons of age", peopleOfAges);
        }

    }
}
