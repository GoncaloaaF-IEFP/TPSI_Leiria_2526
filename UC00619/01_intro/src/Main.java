import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        nome = "Gonçalo";

        double preco = 1200.00; // 64bits <-> 12 a 14 casas decimais
        float altura = 12.3f;   // 32bits <-> 7 casas decimais
        boolean ligado = true;
        char sexo = 'M';

        byte nascimento = 12;   // int 8bit  <-> -128 a 127
        short idade = 32;       // int 16bit <-> -32.768 a 32.767
        int ano = 2026;         // int 32bit <-> -2.147.483.648 a 2.147.483.647
        long ano2 = 312321L;     // int 64bit <-> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807


        System.out.println("Ola Mundo " + nome);
        System.out.printf("Ola Mundo %s em %d\n", nome, ano); // <----
        // %n <=> /n
        System.out.printf("Ola Mundo %s%nem %d\n", nome, ano); // <----


        String msg = String.format("Ola Mundo %s", nome);
        System.out.println(msg);

        System.out.println("Teste");
        System.out.print("Ola Mundo ");
        System.out.print("Ola Mundo \n");

        System.out.println("----------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome2 = input.nextLine(); // ler txt

        System.out.print("idade: ");
        int idade2 = input.nextInt(); // ler int

        System.out.print("media: ");
        float media = input.nextFloat(); // ler float

        int anoNacs = 2026 - idade2;

        System.out.printf("O Teu nome é %s e tens %s anos e nasceste em %d\n", nome2, idade2, anoNacs);
        System.out.printf("media %f", media);

    }

}