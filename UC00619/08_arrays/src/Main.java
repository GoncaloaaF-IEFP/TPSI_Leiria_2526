import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nomes = {"João", "Carlos", "Rui", "Ana", "Maria"};

        System.out.println(nomes.length);

        System.out.println(nomes[0]);

        nomes[0] = "Luis";

        System.out.println(nomes[0]);

        System.out.println("-----------------------");

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        System.out.println("-----------------------");

        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-----------------------");

        int[] idades;

        System.out.println("code code code");

        idades = new int[4];

        idades[0] = 12;
        idades[1] = 8;
        idades[2] = 19;

        for(int idade: idades){
            System.out.println(idade);
        }

        System.out.println("-----------------------");

        String[] cursos = new String[3];
        cursos[0] = "Redes";

        for(String curso : cursos){
            System.out.println(curso);
        }

        System.out.println("-----------------------");


        int[][] mtx = {{1,2,3}, {1,2,3}};

        System.out.println(mtx[0][2]);



        System.out.println("-----------------------");



        /*

        Faça um Programa que peça 5 números inteiros adicione esses 5 números a uma lista e mostre o conteúdo da lista.

         */


        int numElm = 5;
        int[] num = new int[numElm];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numElm; i++) {
            System.out.printf("Digite um numero %d: ", i + 1);
            num[i] = sc.nextInt();
        }

        System.out.println("----");

        for (int i: num){
            System.out.println(i);
        }

        System.out.println("----");


        /*

        Faça um Programa que leia uma lista com 4 notas, mostre as notas e a média na tela.

         */


        int numNotas = 4;

        int[] notas = new int[numNotas];
        // Scanner sc = new Scanner(System.in); // <-- declarado na linha 75
        double media;
        int sumNotas = 0;

        for (int i = 0; i < numNotas; i++) {
            System.out.printf("Digite um numero %d: ", i + 1);
            notas[i] = sc.nextInt();
        }



        for (int i: notas){
            System.out.println(i);
            sumNotas += i;
        }

        media = (double) sumNotas / numNotas;

        System.out.println("Media: " + media);


    }
}