package CodingTank;

import java.math.BigDecimal;
import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal exchangeRate = new BigDecimal(0);
        BigDecimal valueBRL = new BigDecimal(0);
        BigDecimal valueUSD = new BigDecimal(0);

        System.out.println("Enter the exchange rate BRL to USD");
        exchangeRate = in.nextBigDecimal();
        System.out.println("Enter de amount of BRL that you want convert");
        valueBRL = in.nextBigDecimal();
        valueUSD = valueBRL.multiply(exchangeRate) ;

        System.out.printf("The conversion of R$%.2f is $%.2f", valueBRL, valueUSD);
        in.close();
    }
}
