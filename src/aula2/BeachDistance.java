/* 4. Um hotel quer fazer um levantamento das praias da cidade para uma
        programação turística. Sabendo-se que cada praia tem um nome e uma
        distância (em Km) do hotel, escreva um programa que forneça os
        seguintes dados:

        - O nome da praia mais distante.
        - Quantas praias estão a mais de 10km e a menos de 15km.
        - A distância média das praias.

        Para cada praia deverá ser informado seu nome e a distância em Km
        do hotel.

        Você deve receber 5 praias;
        Você deve armazenar o nome das 5 praias em um array;
*/

package aula2;

import java.util.Scanner;

public class BeachDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] beachName = new String[5];
        double[] beachDistance = new double[5];
        int beachesBetweenTenFifteen = 0;
        double averageDistance = 0;
        String furtherBeach = null;
        double furtherDistance = 0;

        for (int i =0; i < 5 ;i++){
            System.out.println("Enter the beach name.");
            beachName[i] = in.nextLine();
            System.out.println("Enter the distance to this beach.");
            beachDistance[i] = in.nextDouble();
            in.nextLine();
            if (beachDistance[i] <= 15 && beachDistance[i] >=10){
                beachesBetweenTenFifteen++;
            }
            if ( furtherDistance <= beachDistance[i] ){
                furtherDistance = beachDistance[i];
                furtherBeach = beachName[i];
            }
            averageDistance += beachDistance[i];
        }
        averageDistance /= 5;

        System.out.printf("""
                The further beach name is %s
                %d beaches are between 10 and 15 km
                The average distance to a beach is %.2f""", furtherBeach, beachesBetweenTenFifteen, averageDistance);

    }
}
