package prova;

import java.util.Scanner;

public class Divisivel {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número para saber se ele é divisivel por 2, 5 ou 10");
        numero = in.nextInt();
        if((numero % 2 != 0) && (numero % 5 !=0)){
            System.out.println("O número informado não é divisivel por 2, 5 nem por 10");
        }else {

            if (numero % 2 == 0) {
                System.out.println("O número informado é divisivel por 2");
            }
            if (numero % 5 == 0) {
                System.out.println("O número informado é divisivel por 5");
            }
            if (numero % 10 == 0) {
                System.out.println("O número informado é divisivel por 10");
            }
        }


    }
}
