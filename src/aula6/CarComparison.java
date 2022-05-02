/*      07 - Faça um programa que carregue uma lista com os modelos de cinco carros
        (exemplo de modelos: FUSCA, GOL, VECTRA etc). Carregue outra lista com o consumo desses carros, isto é,
        quantos quilômetros cada um desses carros faz com um litro de combustível.
        Calcule e mostre:
        a) O modelo do carro mais econômico;
        b) Quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1000
        quilômetros e quanto isto custará, considerando um que a gasolina custe R$ 7,25 o litro.
        c) Abaixo segue uma tela de exemplo. A disposição das informações deve ser o mais próxima possível ao exemplo.
        Os dados são fictícios e podem mudar a cada execução do programa.
*/

package aula6;

public class CarComparison {
    static final double GASOLINE_PRICE = 7.25;
    static final String[] CAR_LIST ={"Fusca", "Gol", "Uno", "Vectra", "Peugeout"} ;
    static final double[] CAR_CONSUMPTION = { 7.0, 10.0, 12.5, 9.0, 14.5};
    public static void main(String[] args) {
        printList();
        printReport();
    }

    private static void printReport() {
        System.out.println("\nConsumption Report");
        for(int i = 0; i < CAR_LIST.length; i++){
            double gasVolume = 1000 / CAR_CONSUMPTION[i] ;
            double gasPrice = gasVolume * GASOLINE_PRICE;
            System.out.printf("%d - %-8s - %5s Km/l - %6s L - $%7s\n", i+1, CAR_LIST[i], String.format("%.2f",CAR_CONSUMPTION[i]), String.format("%.2f",gasVolume), String.format("%.2f",gasPrice));
        }
    }

    private static void printList() {
        for(int i = 0; i < CAR_LIST.length; i++){
            System.out.printf("""
                    Vehicle %d
                    Model : %s
                    Consumption : %.1f Km/L\n""", i+1, CAR_LIST[i], CAR_CONSUMPTION[i]);
        }
    }
}
