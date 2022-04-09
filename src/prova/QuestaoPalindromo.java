package prova;

import java.util.Scanner;

public class QuestaoPalindromo {
        public static void main(String[] args) {
            System.out.print("Digite uma palavra para ve-la ao contrário: ");
            Scanner sc = new Scanner(System.in);

            String palavra = sc.next();
            char[] palavraInvertida = new char[palavra.length()];
            int tamanhoPalavra = palavra.length() - 1;
        //<Instrução I>
            for (int i = 0; i <= tamanhoPalavra; i++ ) {
                palavraInvertida[i] = palavra.charAt(tamanhoPalavra - i);
            }

            String palavraInvertidaStr = new String(palavraInvertida);
            //if(<(Instrução II)> ){ - substituído abaixo.
            if(palavra.equals(palavraInvertidaStr)){
                System.out.printf("A palavra %s é um palíndromo",palavraInvertidaStr);
            }else{
                System.out.printf("A palavra %s não é um palíndromo",palavraInvertidaStr);
            }

        }
}
