/*      07 - Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba código e valor de 15 transações usando laços de repetição. Calcule e mostre:
        O valor total das compras à vista
        O valor total das compras a prazo.
        O valor total das compras efetuadas
        O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes
*/

package aula5;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String saleType;
        double salePrice;
        double totalSold = 0;
        double totalCashSales = 0;
        double totalFowardSales = 0 ;

        for (int i = 0; i <= 15; i++){
            do {
                System.out.println("What type of sale is this transaction? \"C\" for cash, \"F\" for foward sale.");
                saleType = in.nextLine();
            }while (!saleType.equalsIgnoreCase("f") && !saleType.equalsIgnoreCase("c"));
            if(saleType.equalsIgnoreCase("c")){
                System.out.println("Enter the sale price.");
                salePrice = in.nextDouble();
                totalCashSales += salePrice;
                totalSold +=salePrice;
            }
            if(saleType.equalsIgnoreCase("f")){
                System.out.println("Enter the sale price.");
                salePrice = in.nextDouble();
                totalFowardSales += salePrice;
                totalSold +=salePrice;
            }
            in.nextLine();
        }
        System.out.printf("""
                Total Cash sales - $%.2f
                Total Foward sales - $%.2f
                Total sold - $%.2f
                First installment - $%.2f""",
                totalCashSales, totalFowardSales, totalSold, totalFowardSales/3 );
    }
}
