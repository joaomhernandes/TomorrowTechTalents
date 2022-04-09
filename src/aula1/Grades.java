// 9 - Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele obteve no semestre. No final deverá informar a média do aluno

package aula1;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String studentName;
        double firstGrade;
        double secondGrade;
        double thirdGrade;
        double gradeAverage;

        System.out.println("Enter the student name.");
        studentName = in.nextLine();
        System.out.printf("Enter %s's first grade.\n", studentName);
        firstGrade = in.nextDouble();
        System.out.printf("Enter %s's first grade.\n", studentName);
        secondGrade = in.nextDouble();
        System.out.printf("Enter %s's first grade.\n", studentName);
        thirdGrade = in.nextDouble();

        gradeAverage = (firstGrade + secondGrade + thirdGrade)/3;

        System.out.printf("%s's grade average is %.2f",studentName, gradeAverage);
    }
}
