/*   6. Leia  4 (quatro) números calcule o quadrado para cada um (n²)
        some todos e exiba o resultado
*/

package aula2;

import java.util.Scanner;

public class FourNumbersCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double[] squareNumbers = new Double[4];
        double sum = 0;

        for (int i = 0; i < 4 ; i++) {
            System.out.printf("Enter %dº number\n", i+1);
            squareNumbers[i] = Math.pow(in.nextDouble(),2);
            sum += squareNumbers[i];
        }
        System.out.printf("the sum of the squared numbers is %.2f", sum);
    }
}
