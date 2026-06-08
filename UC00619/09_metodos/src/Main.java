
public class Main {

    public static void main(String[] args) {

        int i = soma(2,4);

        System.out.println(i);


        somaImposto(0.1, 100);

    }


    public static int soma(int a, int b) {
        return a + b;
    }

    /*

    Faça um programa com uma função chamada somaImposto.
    A função possui dois parâmetros formais:
    taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem (0 - 1)
    custo, que é o custo de um item antes do imposto. (double)
    A função devolva o valor de custo para incluir o imposto sobre vendas.

     */

    static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * taxaImposto ;
        return custo + imposto;
    }



}