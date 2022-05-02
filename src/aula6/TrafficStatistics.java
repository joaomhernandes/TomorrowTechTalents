/*      04 - Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
        Foram obtidos os seguintes dados:
        a) Código da cidade;
        b) Número de veículos de passeio (em 2021);
        c) Número de acidentes de trânsito com vítimas (em 2021).
        Deseja-se saber:
        a) Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
        b) Qual a média de veículos nas cinco cidades juntas;
        c) Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
*/

package aula6;

import java.util.Scanner;

public class TrafficStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double higherTrafficAcidentRate = 0;
        String higherTrafficAcidentRateCity = "";
        double lowerTrafficAcidentRate = 0;
        String lowerTrafficAcidentRateCity = "";
        double averageAmountVehicles = 0;
        double averageAcidentsUnder2000Vehicles = 0;
        int numberOfCityUnder2000Vehicles = 0;

        for (int i = 0; i < 5; i++ ){
            String cityCode;
            double numberOfPassengerVehicles;
            double numberOfTrafficAcidentsWithVictims;
            double trafficAcidentRate;

            System.out.printf("Enter the code of the %d city.\n", i+1);
            cityCode = in.nextLine();
            System.out.printf("Enter the number of passenger vehicles of the %d city.\n", i+1);
            numberOfPassengerVehicles = in.nextInt();
            System.out.printf("Enter the number of traffic acidents with victims of the %d city.\n", i+1);
            numberOfTrafficAcidentsWithVictims = in.nextInt();
            in.nextLine();
            trafficAcidentRate = numberOfTrafficAcidentsWithVictims / numberOfPassengerVehicles;
            if(higherTrafficAcidentRate < trafficAcidentRate){
                higherTrafficAcidentRate = trafficAcidentRate;
                higherTrafficAcidentRateCity = cityCode;
            }
            if(lowerTrafficAcidentRate > trafficAcidentRate || i == 0){
                lowerTrafficAcidentRate = trafficAcidentRate;
                lowerTrafficAcidentRateCity = cityCode;
            }
            if(numberOfPassengerVehicles <= 2000){
                numberOfCityUnder2000Vehicles++;
                averageAcidentsUnder2000Vehicles += numberOfTrafficAcidentsWithVictims;
            }
            averageAmountVehicles += numberOfPassengerVehicles;
        }
        averageAmountVehicles /= 5;
        averageAcidentsUnder2000Vehicles /= numberOfCityUnder2000Vehicles;

        System.out.printf("""
                a) The highest rate of traffic accidents is %.3f, and belongs to the city code %s
                   The lowest rate of traffic accidents is %.4f, and belongs to the city code %s
                b) The average number of vehicles in the five cities together is %.2f;
                c) The average number of traffic accidents in cities with less than 2,000 passenger vehicles is %.2f.""",
                higherTrafficAcidentRate, higherTrafficAcidentRateCity,
                lowerTrafficAcidentRate, lowerTrafficAcidentRateCity,
                averageAmountVehicles, averageAcidentsUnder2000Vehicles);



    }
}
