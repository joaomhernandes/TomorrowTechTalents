package aula4;

import java.util.Random;
import java.util.Scanner;

public class AverageValueOfLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines for this matrix.");
        int i = in.nextInt();
        System.out.println("Enter the number of columns for this matrix.");
        int j = in.nextInt();
        int line;
        System.out.println("Enter the line that you want the average of its values.");
        line = in.nextInt();
        int [][] matrix = createMatrix(i,j);
        printMatrix(matrix);
        System.out.printf("\nThe average value of line %d of this matrix is %.2f",line, averageLine(matrix,line));

    }

    private static double averageLine(int[][] matrix, int line) {
        double average = 0;
        for(int values : matrix[line]){
            average += values;
        }
        average /= matrix[line].length;
        return average;
    }

    private static int[][] createMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
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
