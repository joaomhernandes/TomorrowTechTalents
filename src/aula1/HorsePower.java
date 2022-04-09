/*    2 - Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de “m” quilogramas a uma altura de “h” em “t” segundos.
        Considere cavalos = (m * h / t ) / 745,6999
*/

package aula1;

import java.util.Scanner;

public class HorsePower {
    final static double CONVERSION_FACTOR_HP = 745.6999;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mass;
        double height;
        double time;
        double horsePower;

        System.out.println("Enter the mass of this weight (Kg)");
        mass = in.nextDouble();
        System.out.println("Enter the height that this weight will be lifted (m)");
        height = in.nextDouble();
        System.out.println("Enter the time that this action will be done(s)");
        time = in.nextDouble();
        horsePower = (mass * height / time) / CONVERSION_FACTOR_HP;

        System.out.printf("You will need %.4f HP to this action", horsePower);


    }
}
