package CodingTank;

import java.util.Scanner;

public class IMCOutOfIdeal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] names = new String[5];
        double [] weights = new double[5];
        double [] heights = new double[5];
        double [] imcs = new double[5];

        for ( int i = 0 ; i < 5 ; i++){
            System.out.printf("Enter the name of the %dº person:\n", ( i+1 ));
            names[i] = in.nextLine();
            System.out.printf("Enter the height of the %dº person:\n", ( i+1 ));
            heights[i] = in.nextDouble();
            System.out.printf("Enter the weight of the %dº person:\n", ( i+1 ));
            weights[i] = in.nextDouble();
            in.nextLine();
            imcs[i] = weights[i] / ( Math.pow( heights[i] , 2 ));
        }
        for( double imc : imcs){
            if(imc < 18.5 || imc > 25.0){
                System.out.println("Someone in the list is out of ideal IMC range!");
                break;
            }
        }
        in.close();
    }
}
