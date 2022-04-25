/*      16 - Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenar os nomes lidos em um vetor.
        Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois,
        escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor),
        ou NÃO ACHEI caso contrário
*/

package aula4;

import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[10];
        String nameOfIntrest;

        createNameArray(names, in);
        System.out.println("Enter the name that you want find.");
        nameOfIntrest = in.nextLine();
        findNameOfIntrest(nameOfIntrest,names);


    }

    private static void findNameOfIntrest(String nameOfIntrest, String[] names) {
        boolean found = false;
        for (String name : names) {
            if(name.equalsIgnoreCase(nameOfIntrest)){
                System.out.println("Found!");
                found = true;
            }
        }
        if (!found){
            System.out.println("Not found!");
        }
    }

    private static void createNameArray(String[] names, Scanner in) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Enter the %dº name.\n", i+1);
            names[i] = in.nextLine();
        }
    }
}
