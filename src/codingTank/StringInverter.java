package codingTank;

import java.util.Scanner;

public class StringInverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        System.out.println("Enter a word.");
        word = in.nextLine();
        System.out.println("The word backwards is:");
        for(int i = 0; i < word.length(); i++){
            System.out.printf("%c", word.charAt( word.length() - 1 - i ));
        }
        in.close();
    }
}
