/*      07 - Escreva um código que leia um vetor G de 10 elementos do tipo caracter que representa o
        gabarito de uma prova. A seguir, para cada um dos 10 alunos da turma, leia o vetor de respostas
        (R) do aluno e conte o número de acertos. Mostre o número de acertos do aluno e uma mensagem APROVADO,
        se a nota for maior ou igual a 6; e mostre uma mensagem de REPROVADO, caso contrário.
*/

package aula4;

import java.util.Random;

public class GradesVerify {
    static final char[] POSSIBLE_ANSWERS = {'a','b','c','d','e'};


    public static void main(String[] args) {

        char[] G = createAnswers();
        String[] Students = {"Pedro", "João", "Ana", "Paula", "Paulo", "Maria", "Victor", "Janaína", "Karen", "Alberto"};
        char[][] R = new char[10][10];
        for (int i = 0; i < 10; i++){
            R[i] = createAnswers();
        }
        System.out.println("The correct answers of the test are:");
        printAnswers(G);
        System.out.println("\nThe students answers was: ");
        printStudentAnswers(Students,R);
        studentGradesStatus(Students,R,G);
    }
    private static void studentGradesStatus(String[] students, char[][] R, char[] G) {
        for(int i = 0; i < 10 ; i++){
            if(verifyGrades(R[i], G) >= 6){
                System.out.printf("%-8s was APPROVED!!\n", students[i]);
            }else{
                System.out.printf("%-8s FAILED!!\n", students[i]);
            }
        }
    }
    private static int verifyGrades(char[] answers, char[] G) {
        int hitsNumber = 0;
        for(int i = 0; i < 10; i++){
            if (answers[i] == G[i]) {
                hitsNumber++;
            }
        }
        return hitsNumber;
    }
    private static void printStudentAnswers(String[] students, char[][] answers) {
        for(int i = 0; i < 10; i++){
            System.out.printf("%-8s ", students[i]);
            printAnswers(answers[i]);
        }
    }
    private static void printAnswers(char[] answers) {
        for(int i = 0; i < 10; i++ ){
            if ( i!=0 && i != 9){
                System.out.printf("%c, ", answers[i]);
            }else if(i == 9) {
                System.out.printf("%c )\n", answers[i]);
            }else {
                System.out.printf("( %c, ", answers[i]);
            }
        }
    }
    private static char[] createAnswers() {
        Random random = new Random();
        char[] answers = new char[10];
        for (int i = 0; i < 10; i++){
                answers[i] = POSSIBLE_ANSWERS[random.nextInt(5)];
        }
        return answers;
    }
}
