/*      04 - Leia a velocidade máxima permitida numa avenida e a velocidade com que o motorista estava dirigindo nela
        e calcule a multa que uma pessoa vai receber, sabendo serem pagos:
        a) 50 reais se o motorista estiver ultrapassar em até 10 km/h a velocidade permitida
        (ex.: velocidade máxima: 50 km/h; motorista a 60km/h ou a 56 km/h);
        b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
        c) 200 reais, se estiver acima de 31 km/h da velocidade permitida.
*/

package aula5;

import java.util.Scanner;

public class SpeedingFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxSpeed;
        int carSpeed;

        System.out.println("Enter with the maximum speed of the road.");
        maxSpeed = in.nextInt();
        System.out.println("Enter with the car speed.");
        carSpeed = in.nextInt();
        if(carSpeed > maxSpeed && carSpeed <= maxSpeed + 10){
            System.out.println("You exceeded the speed limit by up to 10 km/h and received a fine of $50,00");
        }
        if(carSpeed > maxSpeed + 10 && carSpeed <= maxSpeed + 30){
            System.out.println("You exceeded the speed limit between 11 km/h and 30 km/h and received a fine of $100,00");
        }
        if(carSpeed > maxSpeed + 30){
            System.out.println("You exceeded the speed limit above 31 km/h, and received a fine o $200,00");
        }
    }
}
