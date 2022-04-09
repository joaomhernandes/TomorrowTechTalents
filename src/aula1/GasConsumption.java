// 8 - Escreva um programa em java para definir o consumo médio de um automóvel sendo fornecido a distância total percorrida pelo automóvel e o total de combustível gasto (litros).

package aula1;

import java.util.Scanner;

public class GasConsumption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double distance;
        double spentGas;
        double averageConsumption;

        System.out.println("Enter the amount of spent gasoline");
        spentGas = in.nextDouble();
        System.out.println("Enter the travelled distance");
        distance = in.nextDouble();
        averageConsumption = distance / spentGas;

        System.out.printf("You spent %.2fL of gasoline to travel %.2fKm. Your average consumption was %.2f Km/L", spentGas, distance, averageConsumption);
    }
}
