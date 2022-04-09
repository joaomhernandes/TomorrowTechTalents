package prova;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Estacionamento {
    static int linhasAdicionadas=0;
    static int rowSize = 1;
    static String[][] numeros = new String[rowSize][3];
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer option= 0;
        do{
            System.out.println("Options \n\t 1 - Adicionar número da placa \n\t 0 - Sair do programa");
            option = scanner.nextInt();
            if(option!=0){
                System.out.println("Placa do carro para entrada ou saída do estacionamento");
                String plate   = scanner.next();
                addLicensePlate(plate);
            }

        }while(option>0);

    }

    private static void addLicensePlate(String numero) {
        int indice=0;
        Long tempo = System.currentTimeMillis();
        if( (indice=isPositionExistent(numero))>=0){
            numeros[indice][2] = tempo.toString() ;
            long timeSeconds = gotTimeMinutes(indice);
            System.out.printf("Saída do veículo de placa %s. Tempo no estabelecimento %d. ",numero, timeSeconds);

        }else{
            addRecord(numero, tempo.toString());
            System.out.printf("Entrada do veículo de  placa: %s%n", numero);

        }
        printResult();
    }



    private static Long gotTimeMinutes(int position) {
        Long initialTime = Long.parseLong(numeros[position][1]);
        Long finalTime = Long.parseLong(numeros[position][2]);
        return TimeUnit.MILLISECONDS.toMinutes(finalTime-initialTime);
    }

    private static void printResult() {
        for (int i =0;i<numeros.length;i++){
            if(null!=numeros[i][0]) {
                boolean type = null == numeros[i][2];
                System.out.printf(" %s %s %dm %n", (type ? "Entrada" : "Saída"), numeros[i][0], (type ? 0L : gotTimeMinutes(i)));
            }
        }
    }

    private static void addRecord(String numero, String tempo) {

        if(linhasAdicionadas>=rowSize){

            duplicateArrayRows();
        }

        numeros[linhasAdicionadas][0] = numero;
        numeros[linhasAdicionadas][1] = tempo;
        linhasAdicionadas++;
    }

    private static void duplicateArrayRows() {
        rowSize*=2;
        String[][] temp = new String[rowSize][3];
        for (int i =0;i<numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                temp[i][j] = numeros[i][j];
            }
        }
        numeros = temp;
    }

    public static int isPositionExistent(String numero){
        for(int i =numeros.length-1;i>=0;i--){
            if(null!=numeros[i][0] && numeros[i][0].equals(numero)
                    &&numeros[i][2]==null){
                return i;
            }
        }
        return -1;
    }
}
