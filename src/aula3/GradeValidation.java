/*   1. Escreva um programa que leia quatro notas escolares de um aluno e
        apresenta uma mensagem informando se o aluno foi aprovado
        caso apresente o valor da média escolar maior ou igual a 7.
        Caso contrário, apresente uma mensagem informando que ele está de recuperação.
*/

package aula3;

import java.util.Scanner;

public class GradeValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] grades = new double[4];
        double averageGrade = 0;

        for(int i = 0; i < grades.length; i++){
            System.out.printf("Enter the %dº grade\n", i+1);
            grades[i] = in.nextDouble();
            averageGrade += grades[i];
        }
        averageGrade /= grades.length;
        if (averageGrade >= 7 && averageGrade <= 10){
            System.out.println("You were approved");
        }else if(averageGrade > 0 && averageGrade < 7) {
            System.out.println("You failed");
        }
    }
}
