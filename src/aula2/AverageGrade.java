/*1. Escreva um programa que seja capaz de receber as seguintes informações e calcular a média da nota de um aluno:
        Nome
        Turma
        Nota 1
        Nota 2
        Nota 3
*/

package aula2;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String studentName;
        String className;
        double firstGrade;
        double secondGrade;
        double thirdGrade;
        double averageGrade;

        System.out.println("Enter the student name.");
        studentName = in.nextLine();
        System.out.println("Enter the student class");
        className = in.nextLine();
        System.out.println("Enter the first grade");
        firstGrade = in.nextDouble();
        System.out.println("Enter the second grade");
        secondGrade = in.nextDouble();
        System.out.println("Enter the third grade");
        thirdGrade = in.nextDouble();

        averageGrade = (firstGrade + secondGrade + thirdGrade) / 3;

        System.out.printf("%s in the class %s reached the average of %.2f", studentName, className, averageGrade);
    }
}
