//  03 - Crie um método que recebe uma matriz bidimensional double e retorna o maior valor da matriz.

package aula4;

import java.util.Random;

public class TheHighestValueOfMatrix {
    public static void main(String[] args) {
        double[][] matrix = createMatrix();

        System.out.println("The matrix created is :");
        printMatrix(matrix);
        System.out.printf("\nThe highest value of this matrix is: %.2f", highestValue(matrix));
    }

    static double[][] createMatrix(){
        Random random = new Random();
        double [][] matrix = new double[10][10];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = random.nextDouble() * 100;
            }
        }
        return matrix;
    }

    static double highestValue(double[][] matrix){
        double highestValue = 0;
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > highestValue || (i == 0 && j == 0) ){
                    highestValue = matrix[i][j];
                }
            }
        }
        return highestValue;
    }

    static void printMatrix(double[][] matrix) {
        for (double[] doubles : matrix) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[0].length; j++) {
                if (j != matrix[0].length - 1) {
                    System.out.printf("%5.2f , ", doubles[j]);
                } else {
                    System.out.printf("%5.2f ", doubles[j]);
                }
            }
            System.out.print(" ]\n");
        }
    }

}
