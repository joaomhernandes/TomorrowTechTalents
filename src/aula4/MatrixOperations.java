/*      09 - Crie um programa que preencha uma matriz de 3x5 com números inteiros. Em seguida faça:
         - some cada uma das linhas armazenando o resultado em um vetor;
         - some cada uma das colunas armazenando o resultado em um vetor;
         - imprima o resultado da soma das linhas;
         - imprima o resultado da soma das coluna;
         - imprima a matriz completa
*/

package aula4;

import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        int[] lineSum = lineSum(matrix);
        int[] columnsSum = columnSum(matrix);

        System.out.println("This is the created matrix 3x5\n");
        printMatrix(matrix);
        System.out.println("\nThis is the array of the lines sum\n");
        printarray(lineSum);
        System.out.println("\nThis is the array of the columns sum\n");
        printarray(columnsSum);


    }

    private static int[] columnSum(int[][] matrix) {
        int[] columnsSum = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++){
            for (int[] ints : matrix) {
                columnsSum[i] += ints[i];
            }
        }
        return columnsSum;
    }

    private static int[] lineSum(int[][] matrix) {
        int[] lineSum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                lineSum[i] += matrix[i][j];
            }
        }

        return lineSum;
    }

    private static int[][] createMatrix() {
        int[][] matrix = new int[3][5];
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
    private static void printarray(int[] array) {
        System.out.print("[  ");
        for (int number : array ){
            System.out.printf("%d  ", number);
        }
        System.out.print("]\n");
    }
}
