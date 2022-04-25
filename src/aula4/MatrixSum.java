//  04 - Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.

package aula4;

import java.util.Random;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        printMatrix(matrix);
        sumElements(matrix);

        System.out.printf("\nThe sum of all elements of this matrix is: %d", sumElements(matrix));
    }

    private static int sumElements(int[][] matrix) {
        int sumElements = 0;
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                sumElements += matrix[i][j];
            }
        }
        return sumElements;
    }

    private static int[][] createMatrix() {
        int[][] matrix = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[0].length; j++) {
                if (j != matrix[0].length - 1) {
                    System.out.printf("%3d , ", ints[j]);
                } else {
                    System.out.printf("%3d ", ints[j]);
                }
            }
            System.out.print(" ]\n");
        }
    }

}
