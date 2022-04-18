/*      05 -Escreva um programa que receba o peso e a altura de uma pessoa e calcule o seu IMC,
        o resultado irá dizer se a pessoa está: abaixo do peso (IMC inferior a 18,5), com peso normal (IMC entre 18,5 a 24,9),
        com excesso de peso (IMC entre 25,0 a 29,9) ou obesa (30 ou mais de IMC), informe cada um deles com uma mensagem.

        Use a fórmula: IMC = Peso / (Altura × Altura)
*/

package aula3;

import java.util.Scanner;

public class IBM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight;
        double height;
        double ibm;

        System.out.println("Enter your weight in kilograms (Kg).");
        weight = in.nextDouble();
        System.out.println("Enter your height in meters (m)");
        height = in.nextDouble();
        ibm = weight/Math.pow(height,2);

        if (ibm < 18.5){
            System.out.printf("Your IBM is %.1f, because of that, you are underweight.", ibm);
        }
        if (ibm >= 18.5 && ibm < 25.0) {
            System.out.printf("Your IBM is %.1f, because of that, you are of normal weight.", ibm);
        }
        if (ibm >= 25.0 && ibm < 30.0) {
            System.out.printf("Your IBM is %.1f, because of that, you are overweight.", ibm);
        }
        if (ibm >= 30.0) {
            System.out.printf("Your IBM is %.1f, because of that, you are obese.", ibm);
        }
    }
}
