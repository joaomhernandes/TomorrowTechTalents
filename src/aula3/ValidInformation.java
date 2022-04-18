/*          12 - Escreva um programa que leia e valide as seguintes informações:
            Nome: maior que 3 caracteres;
            Idade: entre 0 e 150
            Salário: maior que 0
            Sexo: ‘f’ ou ‘m’
            Estado civil: ‘s’, ‘c’, ‘v’, ‘d’
*/

package aula3;

import java.math.BigDecimal;
import java.util.Scanner;

public class ValidInformation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age ;
        BigDecimal salary;
        String gender;
        String maritalStatus;

        do {
            System.out.println("Enter your name (must have more than 3 characters).");
            name = in.nextLine();
        }while (name.length() <= 3);

        do {
            System.out.println("Enter your age (between 0 and 150).");
            age = in.nextInt();

        }while (age <= 0 || age >= 150);
        do {
            System.out.println("Enter your salary (greater than 0.0).");
            salary = in.nextBigDecimal();
        }while (salary.compareTo(BigDecimal.valueOf(0)) <= 0);
        in.nextLine();
        do {
            System.out.println("Enter your gender ('f' or 'm').");
            gender = in.nextLine();

        }while (!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m"));
        do {
            System.out.println("Enter your marital status ('s', ‘m’, ‘w’, ‘d’).");
            maritalStatus = in.nextLine();

        }while (!maritalStatus.equalsIgnoreCase("s") && !maritalStatus.equalsIgnoreCase("m") && !maritalStatus.equalsIgnoreCase("w") && !maritalStatus.equalsIgnoreCase("d"));

        System.out.printf("""
                Name : %s
                Age : %d
                Salary : %.2f
                Gender : %S
                Marital status : %s""", name, age, salary, gender, maritalStatus);
    }
}
