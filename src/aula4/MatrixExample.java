// 02 -Escreva um código Java que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5.

package aula4;

import java.util.Scanner;

public class MatrixExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] numbers = new double[2][5];

        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[0].length; j++){
                System.out.printf("Enter a number to the position (%d, %d) of the matrix\n", i+1, j+1);
                numbers[i][j] = in.nextDouble();
            }
        }
        System.out.println("The matrix created is:");
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("[ ");
            for(int j = 0; j < numbers[0].length; j++){
                if (j != numbers[0].length - 1) {
                    System.out.printf("%.2f , ", numbers[i][j]);
                }else {
                    System.out.printf("%.2f ", numbers[i][j]);
                }
            }
            System.out.printf(" ]\n");
        }
    }
}
