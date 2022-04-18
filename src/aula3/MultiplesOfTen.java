/*      03 . Escreva um programa que conte de 1 até 100 e
        a cada múltiplo de 10 exiba uma mensagem: “Múltiplo de 10”.*/

package aula3;

public class MultiplesOfTen {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 0){
                System.out.printf("%d - Multiple of 10\n",i);
            }else {
                System.out.println(i);
            }
        }
    }
}
