/*      05 - Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
        calcule o seu peso ideal, utilizando as seguintes fórmulas:
        a) Para homens: (72.7*h) - 58
        b) Para mulheres: (62.1*h) - 44.7
*/

package aula6;

import java.util.Scanner;

public class IdealWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hight;
        String gender;

        System.out.println("Enter your hight. (m)");
        hight = in.nextDouble();
        in.nextLine();

        System.out.println("Enter your gender. (M/F)");
        gender = in.nextLine();
        if (gender.equalsIgnoreCase("m")){
            System.out.printf("Your ideal weight is %.2f Kg", (72.7 * hight) - 58);
        }
        if(gender.equalsIgnoreCase("f")){
            System.out.printf("Your ideal weight is %.2f Kg", (62.1 * hight) - 44.7);
        }
    }
}
