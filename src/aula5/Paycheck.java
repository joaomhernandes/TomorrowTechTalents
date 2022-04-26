/*      02 -Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda,
        que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde
        a 11% do salário bruto, mas não é descontado (é a empresa que deposita.)
        O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário
        o valor da sua hora e a quantidade de horas trabalhadas no mês.
        a. Desconto do IR;
        b. Salário Bruto até R$900,00 (inclusive) – Isento;
        c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
        d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
        e. Salário bruto acima de 2500 – Desconto de 20%.
*/

package aula5;

import java.util.Scanner;

public class Paycheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hourlyPay;
        int mounthlyHoursWorked;
        double grossSalary;
        double netSalary;
        double fgts;
        double unionDues;
        double incomeTax;

        System.out.println("Enter your hourly Pay.");
        hourlyPay = in.nextDouble();
        System.out.println("How many hours do you work per mounth?.");
        mounthlyHoursWorked = in.nextInt();

        grossSalary = hourlyPay * mounthlyHoursWorked;
        unionDues = grossSalary * 0.03;
        fgts = grossSalary * 0.11;

        if(grossSalary <= 900){
            incomeTax = 0;
        }else if (grossSalary > 900 && grossSalary<= 1500){
            incomeTax = grossSalary * 0.05;
        }else if (grossSalary > 1500 && grossSalary <= 2500){
            incomeTax = grossSalary * 0.10;
        }else{
            incomeTax = grossSalary * 0.20;
        }
        netSalary = grossSalary - incomeTax -unionDues;

        System.out.printf("""
                %-27s
                %-20s%5.2f
                %-27s
                %-20s%5.2f
                %-20s%5.2f
                %-20s%5.2f
                %-20s%5.2f
                %-20s%5.2f
                """,
                "Total incomes",
                "Gross salary $",grossSalary,
                "Disconts",
                "Union dues $",unionDues,
                "Income tax $",incomeTax,
                "FGTS $",fgts,
                "Total disconts $", unionDues + incomeTax ,
                "Net Salary $",netSalary);
    }
}
