package CodingTank;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProfitCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal purchaseValue = new BigDecimal(0);
        BigDecimal saleValue = new BigDecimal(0);
        System.out.println("Enter the purchase value.");
        purchaseValue = in.nextBigDecimal();

        if (!((purchaseValue.compareTo(new BigDecimal(20))) > 0)){
            saleValue = purchaseValue.multiply(new BigDecimal("1.45"));
        }else {
            saleValue = purchaseValue.multiply(new BigDecimal("1.30"));
        }
        System.out.printf("The sale value must be R$%.2f", saleValue);
        in.close();
    }

}
