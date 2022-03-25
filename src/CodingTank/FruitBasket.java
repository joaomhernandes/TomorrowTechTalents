package CodingTank;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] fruits = new String [5];
        for(int i = 0; i < 5; i++){
            System.out.printf("Enter the fruit number %d\n", (i+1) );
            fruits[i] = in.nextLine();
        }
        for(int i = 0; i < 5; i++){
            if (i == 4){
                System.out.printf("%s.", fruits[i] );
                break;
            }
            System.out.printf("%s, ", fruits[i] );
        }
        in.close();
    }
}