package CodingTank;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double farenheit = 0;

        System.out.println("Type a temperature in ºCelsius.");
        celsius = in.nextDouble();
        farenheit = ((celsius * 9) /5) + 32;
        System.out.printf("%.1fºC in Farenheit is: %.1fºF",celsius,farenheit);
        in.close();
    }
}

