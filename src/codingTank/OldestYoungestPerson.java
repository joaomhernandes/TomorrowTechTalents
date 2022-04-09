package codingTank;

import java.util.Scanner;

public class OldestYoungestPerson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] names = new String[5];
        int [] ages = new int[5];
        String oldest = "";
        String youngest = "";
        int highestAge = 0;
        int lowestAge = 0;
        double averageAge = 0.0;

        for( int i = 0 ; i < 5 ; i++ ){
            if ( ages[i] > highestAge || i ==0 ){
                lowestAge = ages[i];
                oldest = names[i];
            }
            System.out.printf("Enter the name of the %dº person:\n", ( i+1 ));
            names[i] = in.nextLine();
            System.out.printf("Enter the age of the %dº person:\n", ( i+1 ));
            ages[i] = in.nextInt();
            in.nextLine();
            if ( ages[i] > highestAge || i ==0 ){
                highestAge = ages[i];
                oldest = names[i];
            }
            if ( ages[i] < lowestAge || i ==0 ){
                lowestAge = ages[i];
                youngest = names[i];
            }
            averageAge += ages[i];
        }
        averageAge /= 5;
        System.out.printf("The oldest person is: %s\nThe youngest person is: %s\nAnd the average age is: %.2f", oldest, youngest, averageAge);
        in.close();
    }
}
