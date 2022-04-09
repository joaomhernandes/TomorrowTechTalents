package prova;

public class Principal {
    static int linhasAdicionadas=0;
    static int rowSize = 1;
    public static void main(String[] args) {

        int[] numeros = new int[rowSize];

        for (int i = 0; i < args.length; i++) {
            int numero = Integer.parseInt(args[i]);

            if(linhasAdicionadas>=rowSize){

                rowSize*=2;
                int[] temp = new int[rowSize];
                for (int j =0;j<numeros.length;j++){
                    temp[j] = numeros[j];

                }
                numeros = temp;
            }

            numeros[linhasAdicionadas] = numero;
            linhasAdicionadas++;
        }

        for (int numero:numeros) {
            System.out.printf("%d ",numero);
        }
    }
}