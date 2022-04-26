/*      06 - Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa
        e diga se ela pode doar sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
*/

package aula5;

import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;

        System.out.println("How old are you?");
        age = in.nextInt();

        if (age >= 18 && age <= 67){
            System.out.println("You can donate blood!");
        }else{
            System.out.println("You can't donate bood");
        }
    }
}
