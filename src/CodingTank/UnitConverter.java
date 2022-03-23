package CodingTank;

import java.util.Scanner;

public class UnitConverter {
    public final static double CONVERSION_FACTOR_INCH_CM = 2.54;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inch = 0;
        double cm = 0;

        System.out.println("Enter the measurement in inches");
        inch = in.nextDouble();
        cm = inch * CONVERSION_FACTOR_INCH_CM;

        System.out.printf("%.2f\" it's equivalent to %.2fcm", inch, cm);
        in.close();
    }
}
