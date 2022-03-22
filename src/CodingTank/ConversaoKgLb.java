package CodingTank;

public class ConversaoKgLb {

    public static void main(String[] args) {
        final double FATOR_CONVERSAO_KG_LB = 2.20462;

        double kilos = 100;
        double libras = kilos * FATOR_CONVERSAO_KG_LB;

        System.out.printf("%.0fKg são %flb", kilos, libras );

    }
}
