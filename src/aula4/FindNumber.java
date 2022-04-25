/*      08 - Faça um programa para receber um conjunto de 10 valores até 100, e insira em uma matriz,
        em seguida você deverá receber um outro valor e verificar se o elemento existe no conjunto de
        10 valores da matriz. Caso exista você deve imprimir uma mensagem: "O valor existe no conjunto",
        caso contrário deverá exibir: "--
*/

package aula4;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int[] numbers = createArray();
        int numberOfInterest;
        System.out.println("Enter a number that you are interest.");
        numberOfInterest = in.nextInt();
        verifyNumber(numberOfInterest, numbers);



    }

    private static void verifyNumber(int numberOfInterest, int[] numbers) {
        boolean exist = false;
        for (int number : numbers) {
            if(number == numberOfInterest){
                System.out.printf("The value %d exists in the set\n", numberOfInterest);
                exist = true;
            }
        }
        if (!exist){
            System.out.println("--");
        }
    }

    private static int[] createArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
