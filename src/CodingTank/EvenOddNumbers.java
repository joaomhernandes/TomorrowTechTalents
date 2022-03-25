package CodingTank;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] numbers = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.printf("Enter the number %d\n", ( i + 1 ) );
            numbers[i] = in.nextInt();
        }
        System.out.printf("The even numbers:");
        for(int number : numbers){
            if (number % 2 == 0 ){
                System.out.printf("%d ", number);
            }
        }
        System.out.printf("\nThe odd numbers:");
        for(int number : numbers){
            if (number % 2 != 0 ){
                System.out.printf("%d ", number);
            }
        }
        in.close();
    }
}
