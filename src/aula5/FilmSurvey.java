/*      10 - Cada espectador de um cinema respondeu a um questionário no qual constava sua idade
        e a sua opinião em relação ao filme:
        3 - ótimo,
        2 - bom,
        1 - regular
        Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:
        A média das idades das pessoas que responderam ótimo;
        A quantidade de pessoas que respondeu regular;
        A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.
*/

package aula5;

import java.util.Scanner;

public class FilmSurvey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double averageAgeGreat = 0;
        int greatQuantity = 0;
        int regularQuantity = 0;
        double goodPercent = 0;

        for (int i = 0; i < 5; i++){
            int option;

            System.out.println("""
                    What did you think of the movie?
                    3 - Great.
                    2 - Good.
                    1 - Regular""");
            option = in.nextInt();
            if (option == 3){
                System.out.println("What's your age?");
                averageAgeGreat += in.nextDouble();
                greatQuantity++;
            }
            if (option == 2){
                goodPercent ++;
            }
            if (option == 1){
                regularQuantity++;
            }
        }
        averageAgeGreat /= greatQuantity;
        goodPercent *= 20;
        System.out.printf("""
                The average age of viewers who rated the film as great was %.2f
                The number of viewers who rated the film as regular was %d
                The percentage of viewers who rated the film as good was %.2f%%""", averageAgeGreat, regularQuantity, goodPercent);
    }
}
