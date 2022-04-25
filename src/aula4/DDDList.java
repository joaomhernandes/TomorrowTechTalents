/*      11 - Leia um número inteiro que representa um código de DDD para discagem interurbana.
        Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
        DDD       DESTINO
        61        Brasília
        71        Salvador
        11        São Paulo
        21        Rio de Janeiro
        32        Juiz de Fora
        19        Campinas
        27        Vitória
        31        Belo Horizonte

        Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
        DDD nao cadastrado

        Entrada
        A entrada consiste de um único valor inteiro.

        Saída
        Imprima o nome da cidade correspondente ao DDD existente na entrada.
        Imprima DDD não cadastrado caso não exista o DDD correspondente ao número digitado.


*/

package aula4;

import java.util.Scanner;

public class DDDList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ddd;
        boolean insistentDDD = true;
        
        System.out.println("Enter the desired area code.");
        ddd = in.nextInt();

        for (AreaCode code : AreaCode.values()){
            if(code.getDDD() == ddd){
                System.out.println(code);
                insistentDDD = false;
            }
        }
        if (insistentDDD){
            System.out.println("Area code not registered");
        }
    }

    public enum AreaCode {
        BRASILIA(61,"brasilia"),
        SALVADOR(71,"Salvador"),
        SAO_PAULO(11,"São Paulo"),
        RIO_DE_JANEIRO(21,"Rio de Janeiro"),
        JUIZ_DE_FORA(32,"Juiz de Fora"),
        CAMPINAS(19,"Campinas"),
        VITORIA(27,"Vitória"),
        BELO_HORIZONTE(31,"Belo Horizonte")
        ;
        private final int ddd;
        private final String city;

        AreaCode(int ddd, String city){
            this.ddd = ddd;
            this.city = city;
        }

        public int getDDD() {
            return ddd;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Area Code { " +
                    "ddd - " + getDDD() +
                    ", city - " + getCity() + '}';
        }
    }
}
