/*      14.	Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
        ○	Cálculo:  área = PI * (raio²)
*/

package aula1;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double circleRadius;
        double circleArea;

        System.out.println("Enter the circle radius.");
        circleRadius = in.nextDouble();
        circleArea = Math.PI * Math.pow(circleRadius, 2);

        System.out.printf("The circle area is %.2f.", circleArea);
    }
}
