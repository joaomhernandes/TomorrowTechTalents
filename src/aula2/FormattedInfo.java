/*  3. Escreva um programa que produza a seguinte saída na tela:
        ALUNO(A)        NOTA
        =========       =====
        ALINE           9.0
        MÁRIO           DEZ
        SÉRGIO          4.5
        SHIRLEY         7.0
*/

package aula2;

public class FormattedInfo {
    static final String[][] STUDENTS_GRADES = {{"ALINE", "9.0"},{"MÁRIO", "DEZ"},{"SÉRGIO", "4.5"}, {"SHIRLEY", "7.0"}};

    public static void main(String[] args) {
        System.out.printf("%-15s %-7s\n%-15s %-7s\n","ALUNO(A)", "NOTA", "=========", "=====" );
        for(int i = 0; i < 4; i++){
            System.out.printf("%-15s %-7s\n",STUDENTS_GRADES[i][0], STUDENTS_GRADES[i][1]);
        }


    }
}
