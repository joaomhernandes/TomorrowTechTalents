//06- Escreva um programa que exiba os números de 1 a 100 de forma decrescente

package aula3;

public class DescendingNumbers {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--){
            if(i != 1 && i != 50){
                System.out.printf("%d, ", i);
            }
            else if (i == 50){
                System.out.printf("%d,\n", i);
            }else {
                System.out.printf("%d.", i);
            }
        }
    }
}
