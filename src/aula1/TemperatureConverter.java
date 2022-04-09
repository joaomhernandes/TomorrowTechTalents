/*  1 - Escreva um programa que com base em uma temperatura em graus celsius, realize a conversão e exiba os resultados conforme as fórmulas abaixo:
        Kelvin
        K = Celsius + 273.15;
        Fahrenheit
        F = Celsius * 1.8 + 32;
        Rankine
        Ra = Celsius * 1.8 + 32 + 459.67
        Réaumur
        Re = Celsius * 0.8;
*/

package aula1;

import java.util.Scanner;

public class TemperatureConverter {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                double celsius;
                double kelvin;
                double fahrenheit;
                double rankine;
                double reaumur;

                System.out.println("Enter a temperature in Celsius.");
                celsius = in.nextDouble();
                kelvin = celsius + 273.15;
                fahrenheit = celsius * 1.8 + 32;
                rankine = fahrenheit + 459.67;
                reaumur = celsius * 0.8;

                System.out.printf("%.2fºC is:\nIn Kelvin: %.2f\nIn Fahrenheit: %.2f\nIn Rankine: %.2f\nIn Réaumur: %.2f", celsius, kelvin, fahrenheit, rankine, reaumur);
        }
}
