/*      09 - Faça um programa que apresente o menu de opções a seguir:
        Menu de opções:
        1. Média aritmética
        2. Média ponderada
        Digite a opção desejada:
        Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
        Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
        Verifique a possibilidade de opção inválida, mostrando uma mensagem.
*/

package aula5;

import java.util.Scanner;

public class WeightArithimeticAverage {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int option;
        System.out.println("""
                Enter the desired option:
                1 - Arithimetic average.
                2 - Weight average.
                0 - exit.""");
        option = in.nextInt();
        if (option == 1){
            arithimeticAverage();
        }else if (option == 2){
            weightAverage();
        }else if (option == 0){
            System.exit(0);
        }else {
            System.out.println("Invalid option!");
            menu();
        }
    }

    private static void weightAverage() {
        int[] weights = new int[3];
        int totalWeight = 0;
        double[] grades = new double[3];
        double weightAverage = 0;
        for(int i = 0; i < grades.length; i++ ){
            System.out.printf("Enter the %dº grade.\n",i+1);
            grades[i] = in.nextDouble();
            System.out.printf("Enter the %dº grade weight.\n",i+1);
            weights[i] = in.nextInt();
            grades[i] *= weights[i];
            weightAverage += grades[i];
            totalWeight += weights[i];
        }
        weightAverage /= totalWeight;
        System.out.printf("The weight average is %.2f.\n\n", weightAverage);
        menu();
    }

    private static void arithimeticAverage() {
        double arithimeticAverage = 0;
        for (int i =0; i < 2; i++){
            System.out.printf("Enter the %dº grade.\n",i+1);
            arithimeticAverage += in.nextDouble();
        }
        arithimeticAverage /= 2;
        System.out.printf("The arithimetic average is %.2f.\n\n", arithimeticAverage);
        menu();
    }
}
