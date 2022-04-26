/*      03 - Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        a - "Telefonou para a vítima? “
        b - “Esteve no local do crime?”
        c - “Mora perto da vítima? “
        d - “Devia para a vítima? “
        e - “Já trabalhou com a vítima? “
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
        entre 3 e 4 como “Cúmplice” e 5 como “Assassino”. Caso contrário, ela será classificada como “Inocente”.
*/

package aula5;

import java.util.Scanner;

public class CriminalInvestigation {
    static final String[] QUESTIONS = {"Did you call the victim?","Were you at the scene of the crime?", "Do you live near the victim?","Did you owe something to the victim?","Have you worked with the victim?"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int clueCounter = 0;

        while (true){
            System.out.println("Answer with yes ou no only");
            for(String question : QUESTIONS){
                System.out.println(question);
                if (in.nextLine().equalsIgnoreCase("yes")){
                    clueCounter++;
                }
            }
            switch (clueCounter) {
                case (2) -> {
                    System.out.println("The interrogated is suspect.");
                }
                case (3), (4) -> {
                    System.out.println("The interrogated is an accomplice.");
                }
                case (5) -> {
                    System.out.println("The interrogated is the killer.");
                }
                default -> {
                    System.out.println("The interrogated is innocent.");
                }
            }
            clueCounter = 0;
            System.out.println("Do you want to interrogate someone else? ");
            if(in.nextLine().equalsIgnoreCase("no")){
                break;
            }
        }
    }
}
