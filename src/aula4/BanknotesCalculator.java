/*      10 - Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas)
        onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
        Na sequência mostra o valor lido e a relação de notas necessárias.
*/

package aula4;

import java.util.Scanner;

public class BanknotesCalculator {
    static final String[] BANKNOTES = {"$100,00", "$50,00", "$20,00", "$10,00", "$5,00", "$2,00", "$1,00",};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount;

        System.out.println("Enter the amount that you want withdraw");
        amount = in.nextInt();

        int[] banknotes = billsCalculator(amount);
        printWithdraw(banknotes);
        }

    private static void printWithdraw(int[] banknotes) {
        System.out.println("The withdraw will be:");
        for (int i = 0; i < banknotes.length; i++) {
            if (banknotes[i] != 0) {
                System.out.printf("%-5d %7s bills\n", banknotes[i], BANKNOTES[i]);
            }
        }
    }

    private static int[] billsCalculator(int amount){
        int[] bills = {0, 0, 0, 0, 0, 0, 0};

        bills[0] = amount / 100;
        amount %= 100;
        if(amount == 0) {
            return bills;
        }
        bills[1] = amount / 50;
        amount %= 50;
        if(amount == 0) {
            return bills;
        }
        bills[2] = amount / 20;
        amount %=  20;
        if(amount == 0) {
            return bills;
        }
        bills[3] = amount / 10;
        amount %= 10;
        if(amount == 0) {
            return bills;
        }
        bills[4] = amount / 5;
        amount %= 5;
        if(amount == 0) {
            return bills;
        }bills[5] = amount / 2;
        amount %= 2;
        if(amount == 0) {
            return bills;
        }
        bills[6] = amount;
        return bills;
    }
}
