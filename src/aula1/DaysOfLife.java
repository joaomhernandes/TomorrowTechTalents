// 4 - Crie um programa que você atribua um valor da idade de uma pessoa e calcule quantos dias aquela pessoa já viveu

package aula1;

import java.util.Scanner;

public class DaysOfLife {
    final static int DAYS_IN_A_YEAR = 365;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        int daysLived;

        System.out.println("How old are you?");
        age = in.nextInt();
        daysLived = age * DAYS_IN_A_YEAR;
        System.out.printf("You already lived, at least, %d days", daysLived);
    }
}
