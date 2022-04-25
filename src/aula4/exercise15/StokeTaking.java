/*      15 - Uma loja levantará o valor total de todas as mercadorias em estoque.
        Escreva um algoritmo que permita a entrada das seguintes informações:
        a) a quantidade de produtos que irá cadastrar
        b) para cada produto:
         - o nome do produto
         - o número total de mercadorias no estoque;
         - o valor unitário da mercadoria.
        c) Imprimir o valor total em estoque e a média de valor das mercadorias.
*/

package aula4.exercise15;

import java.util.Scanner;

public class StokeTaking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantityOfProducts;

        System.out.println("Enter the quantity of products will be registered.");
        quantityOfProducts = in.nextInt();
        Product[] productsList = new Product[quantityOfProducts];
        fillProductsList(productsList,in);

        printProductListInfo(productsList);
        printProductList(productsList);

    }

    private static void printProductList(Product[] productsList) {
        for (Product product:productsList) {
            System.out.println(product);
        }
    }

    private static void fillProductsList(Product[] productsList, Scanner in) {
        for (int i = 0; i < productsList.length; i++) {
            Product product = new Product("",0,0);
            System.out.printf("Enter the %dº product name\n", i + 1);
            in.nextLine();
            product.setName(in.nextLine()) ;
            System.out.printf("Enter the %dº product quantity\n", i + 1);
            product.setQuantity(in.nextInt());
            System.out.printf("Enter the %dº product unit price\n", i + 1);
            product.setUnitPrice(in.nextDouble());
            in.nextLine();
            productsList[i] = product;
        }
    }

    private static void printProductListInfo(Product[] productsList) {
        double averagePrice = 0;
        double totalPrice = 0;
        for (Product product : productsList){
            averagePrice += product.getUnitPrice();
            totalPrice += (product.getQuantity() * product.getUnitPrice());
        }
        averagePrice /= productsList.length;
        System.out.printf("The total value in stock is $%.2f, and the avarege price of the products is $%.2f\n",
                totalPrice, averagePrice);
    }
}