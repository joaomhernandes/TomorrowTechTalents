/*      01 - Numa competição de salto em distância cada atleta tem direito a cinco saltos.
        No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados.
        O seu resultado será a média dos três valores restantes.
        Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta nos seus saltos
        e depois informe a média dos saltos conforme a descrição acima informada (retirar o melhor e o pior salto
        e depois calcular a média). Use uma lista para armazenar os saltos.
        Os saltos são informados na ordem da execução, portanto não são ordenados.
        O programa deve ser encerrado quando não for informado o nome do atleta.
        A saída do programa deve ser conforme o exemplo abaixo:
        Atleta: João da Silva
        Primeiro Salto: 6.5 m
        Segundo Salto: 6.1 m
        Terceiro Salto: 6.2 m
        Quarto Salto: 5.4 m
        Quinto Salto: 5.3 m
        Melhor salto: 6.5 m
        Pior salto: 5.3 m
        Média dos demais saltos: 5.9 m
        Resultado final:
        João da Silva: 5.9 m
*/

package aula6;

import java.util.Scanner;

public class JumpCompetition {
    static int rowSize = 0;
    static int addedCompetidor=0;
    static String[][] jumps = new String[rowSize][9];
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        addCompetidorJumps();

    }

    private static void addCompetidorJumps() {
        String[] competidorJumps = new String[9];
        double bestJump = 0;
        double worstJump = 0;
        double averageJump = 0;
        double jump;
        System.out.println("Enter the competidor's name.");
        competidorJumps[0] = in.nextLine();
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter the %d jump\n", i);
            competidorJumps[i] = in.nextLine();
            jump = Double.parseDouble(competidorJumps[i]);
            if (bestJump < jump) {
                bestJump = jump;
            }
            if (worstJump > jump || i==1) {
                worstJump = jump;
            }
            averageJump += jump;
        }
        averageJump -= (bestJump + worstJump);
        averageJump /= 3;
        competidorJumps[6] = String.valueOf(bestJump);
        competidorJumps[7] = String.valueOf(worstJump);
        competidorJumps[8] = String.format("%.2f",averageJump);

        if(addedCompetidor >= rowSize){

            rowSize+=1;
            String[][] temp = new String[rowSize][3];
            System.arraycopy(jumps, 0, temp, 0, jumps.length);
            jumps = temp;
        }
        jumps[addedCompetidor] = competidorJumps;
        addedCompetidor++;
        System.out.println("Competidor's jumps added successifuly\n");
        addMore();
    }

    private static void addMore() {
        String option;
        System.out.println("Do you want add more competidors jumps? (Yes/No)");
        option = in.nextLine();
        if (option.equalsIgnoreCase("yes")){
            addCompetidorJumps();
        }else{
            printResults();
        }


    }

    private static void printResults() {
        for (String[] jump : jumps) {
            System.out.printf("""
                            Athlete: %-15s
                                    First Jump: %-3sm
                                    Second Jump: %-3sm
                                    Third Jump: %-3sm
                                    Fourth Jump: %-3sm
                                    Fifth Jump: %-3sm
                                    Best jump: %-3sm
                                    Worst jump: %-3sm
                                    Average of the other jumps: %-3sm
                                    Final result:
                                    %-15s: %-3sm\n
                            """,
                    jump[0], jump[1], jump[2],
                    jump[3], jump[4], jump[5],
                    jump[6], jump[7], jump[8],
                    jump[0], jump[8]);
        }
    }
}

