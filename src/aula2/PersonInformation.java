/* 2. Elabore um programa que escreve seu nome completo na primeira linha,
      seu endereço na segunda, e o CEP e telefone na terceira.
*/

package aula2;

import java.util.Scanner;

public class PersonInformation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        String address;
        String cep;
        String telephoneNumber;

        System.out.println("\nEnter your first name.");
        firstName = in.nextLine();
        System.out.println("Enter your last name.");
        lastName = in.nextLine();
        System.out.println("Enter your address.");
        address = in.nextLine();
        System.out.println("Enter your CEP.");
        cep = in.nextLine();
        System.out.println("Enter your telephone number.");
        telephoneNumber = in.nextLine();

        System.out.printf("%s %s\n" +
                "%s - %s\n" +
                "%s", firstName, lastName, address, cep, telephoneNumber);


    }
}
