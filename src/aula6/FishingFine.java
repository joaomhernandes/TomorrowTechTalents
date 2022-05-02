/*      03 - João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário
        do seu trabalho. Toda a vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de
        pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
        João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
        Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa
        que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*/



package aula6;

import java.util.Scanner;

public class FishingFine {
    static final double MAX_WEIGHT_ALLOWED = 50.00;
    static final double FISHING_FINE_PER_KG = 4.00;
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        double totalWeightCaught;
        double excess;
        double fishingFine;

        System.out.println("What was the total weight caught today?");
        totalWeightCaught = in.nextDouble();
        if(totalWeightCaught > MAX_WEIGHT_ALLOWED){
            excess = totalWeightCaught - MAX_WEIGHT_ALLOWED;
            fishingFine = excess * FISHING_FINE_PER_KG;
            System.out.printf("The excess caught today is %.2f Kg, and you must pay a fishing fine of $%.2f",excess,fishingFine);
        }else {
            System.out.println("You did not exceed the maximum allowed limit today, and therefore, you will not have to pay any fines.");
        }
    }
}
