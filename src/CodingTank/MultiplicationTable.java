package CodingTank;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;

        while (number <1 || number >10) {
            System.out.println("Type a number between 1 and 10");
            number = in.nextInt();
        }
        System.out.printf("The multiplication table of %d is: \n\n", number);
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", number, i, (number * i));
        }
        in.close();
    }
}
