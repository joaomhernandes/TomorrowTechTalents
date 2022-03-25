package CodingTank;

import java.util.Scanner;

public class HighestLowestAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int highest = 0;
        int lowest = 0;
        double average = 0.0;

        for ( int i = 0; i < 5; i++) {
            System.out.printf("Enter the %dº number\n", ( i + 1 ));
            number = in.nextInt();
            if (highest < number || i == 0) {
                highest = number;
            }
            if (lowest > number || i == 0) {
                lowest = number;
            }
            average += number;
        }
        average /= 5;
        System.out.printf("The highest number is %d\nThe lowest number is %d\nThe average of these number is %.2f\n", highest ,lowest ,average );
        in.close();
    }
}
