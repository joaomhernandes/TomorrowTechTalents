package CodingTank;

import java.util.Scanner;

public class LongestName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] nameList = new String[5];
        String longestName = "";
        for(int i = 0; i < 5; i++){
            System.out.printf("Enter the %dº name.\n", (i+1));
            nameList[i] = in.nextLine();
            if (longestName.length() < nameList[i].length() || i ==0 ){
                longestName = nameList[i];
            }
        }
        System.out.println("The longest name of the list is: " + longestName);
        in.close();
    }
}
