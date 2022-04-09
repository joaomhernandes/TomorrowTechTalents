package codingTank;

public class ConversaoKgLb {
    static final double FATOR_CONVERSAO_KG_LB = 2.20462;

    public static void main(String[] args) {

        double kilos = 100;
        double libras = kilos * FATOR_CONVERSAO_KG_LB;

        System.out.printf("%.0fKg são %flb", kilos, libras );

    }
}
