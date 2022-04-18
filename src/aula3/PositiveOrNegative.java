/* 02 . Faça um programa que leia um número inteiro diferente de zero e
        mostre uma mensagem indicando se este número é positivo ou negativo.
        Pare a execução do programa quando o usuário requisitar
        (O programa deve parar quando o usuário escolher 0).
*/

package aula3;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Enter with a number, or 0 to exit.");
            number = in.nextInt();
            if (number > 0){
                System.out.println("This is a positive number");
            }else if(number < 0){
                System.out.println("This is a negative number");
            }else{
                break;
            }
        }while (number !=0 );
    }
}
