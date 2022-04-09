package codingTank;

import java.util.Scanner;

public class PlaceOfBirth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String state = "";

        System.out.println("Enter, in capital letters, the state code of interest: (example: SP)");
        state = in.nextLine();
        switch (state) {
            case "SP" -> System.out.println("Paulista");
            case "RJ" -> System.out.println("Carioca");
            case "MG" -> System.out.println("Mineiro");
            case "PE" -> System.out.println("Pernambucano");
            case "RN" -> System.out.println("Potiguar");
            default -> System.out.println("Outros Estados");
        }
        in.close();
    }
}
