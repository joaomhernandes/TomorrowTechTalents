/*      17 - A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos
        para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
        - Média de salário da população
        - Média do número de filhos
        - Maior salário dos habitantes
        - Percentual de pessoas com salário menor que R$ 150,00
        Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.
*/

package aula4;

import java.util.Scanner;

public class SalarySense {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                double salary;
                double higherSalary = 0;
                double averageSalary = 0;
                double percentageSalaryLowerThan = 0;
                int numberOfSalaries = 0;
                double averageNumberOfChildren = 0;

                while (true){
                      System.out.println("Enter a salary, or enter a negative number to end.");
                      salary = in.nextDouble();
                      if(salary < 0){
                              break;
                      }
                      System.out.println("Enter the number of children of this person.");
                      averageNumberOfChildren += in.nextInt();
                      if (salary > higherSalary){
                              higherSalary = salary;
                      }
                      if(salary < 150){
                           percentageSalaryLowerThan++;
                      }
                      averageSalary += salary;
                      numberOfSalaries++;
                }
                averageNumberOfChildren /= numberOfSalaries;
                averageSalary /= numberOfSalaries;
                percentageSalaryLowerThan = percentageSalaryLowerThan / numberOfSalaries * 100;

                System.out.printf("""
                        The average salary is $%.2f.
                        The average children number is %.2f
                        The higher salary is $%.2f.
                        And the percentage of interviewees that have salarys under $150,00 is %.2f%%""",averageSalary, averageNumberOfChildren, higherSalary, percentageSalaryLowerThan);
        }
}
