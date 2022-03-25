package CodingTank;

import java.util.Scanner;

public class UppercaseOddLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        String modifiedWord = "";

        System.out.println("Enter a word.");
        word = in.nextLine();
        for( int i = 1 ; i <= word.length() ; i++ ){
            if ( i % 2 != 0 ){
                modifiedWord += word.toUpperCase().charAt(i-1);
            }else{
                modifiedWord += word.charAt(i-1);
            }
        }
        System.out.println("The modified word is: " + modifiedWord);
        in.close();
    }
}
