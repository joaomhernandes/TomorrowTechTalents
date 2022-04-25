/*      14 -Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
        (considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres).
        Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
        e o produto das idades do homem mais novo com a mulher mais velha.
*/

package aula4;

import java.util.Scanner;

public class AgeOperations {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int ageFirstMan;
                int ageSecondMan;
                int ageFirstWoman;
                int ageSecondWoman;

                System.out.println("Enter the age of the first man.");
                ageFirstMan = in.nextInt();
                do{
                        System.out.println("Enter the age of the second man(the ages must be different).");
                        ageSecondMan = in.nextInt();
                }while (ageFirstMan == ageSecondMan);
                System.out.println("Enter the age of the first woman.");
                ageFirstWoman = in.nextInt();
                do{
                        System.out.println("Enter the age of the second woman(the ages must be different).");
                        ageSecondWoman = in.nextInt();
                }while (ageFirstWoman == ageSecondWoman);

                if (ageFirstMan > ageSecondMan){
                        if(ageFirstWoman > ageSecondWoman){
                                sumAges(ageFirstMan,ageSecondWoman);
                                multiplyAges(ageSecondMan,ageFirstWoman);
                        }else{
                                sumAges(ageFirstMan,ageFirstWoman);
                                multiplyAges(ageSecondMan,ageSecondWoman);
                        }
                }else{
                        if(ageFirstWoman > ageSecondWoman){
                                sumAges(ageSecondMan,ageSecondWoman);
                                multiplyAges(ageFirstMan,ageFirstWoman);
                        }else{
                                sumAges(ageSecondMan,ageFirstWoman);
                                multiplyAges(ageFirstMan,ageSecondWoman);
                        }
                }
        }

        private static void multiplyAges(int ageYoungerMan, int ageOlderWoman) {
                System.out.printf("Product of age of the younger man and the older woman is: %d\n", ageYoungerMan * ageOlderWoman);
        }

        private static void sumAges(int ageOlderMan, int ageYoungerWoman) {
                System.out.printf("Sum of age of the older man and the younger woman is: %d\n", ageOlderMan + ageYoungerWoman);
        }
}
