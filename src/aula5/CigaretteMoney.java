/*      01 -Calcular a quantidade de dinheiro gasta por um fumante.
        Dados: o número de anos que ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira com 20 cigarros.
*/

package aula5;

import java.util.Scanner;

public class CigaretteMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cigarettePackPrice;
        int cigarettePerDay;
        int yearsSmoking;

        System.out.println("How many year have you smoked?");
        yearsSmoking = in.nextInt();
        System.out.println("How many many cigaretts do you smoke a day?");
        cigarettePerDay = in.nextInt();
        System.out.println("How much is the cigarette pack?");
        cigarettePackPrice = in.nextDouble();

        System.out.printf("You've already spent $%.2f on cigarettes.",
                (((cigarettePerDay * yearsSmoking * 365) / 20) * cigarettePackPrice));

    }
}
