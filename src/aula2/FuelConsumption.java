/*  5. Escreva um programa para calcular a quantidade de litros de combustível necessária para se fazer uma viagem, sabendo-se que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.

        utilizar as seguintes fórmulas:
        distância = tempo x velocidade
        litros usados = distância / 12
*/

package aula2;

import java.util.Scanner;

public class FuelConsumption {
    static final double CONSUMPTION = 12.0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double travelTime;
        double averageSpeed;
        double travelDistance;
        double fuelVolume;

        System.out.println("Enter the time spent in this trip.");
        travelTime = in.nextDouble();
        System.out.println("Enter the average speed.");
        averageSpeed = in.nextDouble();
        travelDistance = travelTime * averageSpeed;
        fuelVolume = travelDistance / CONSUMPTION;

        System.out.printf("You used %.2f L of fuel in the trip.", fuelVolume);
    }

}
