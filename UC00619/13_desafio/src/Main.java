import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Crie uma app que me permita adicionar pessoas a uma lista de pessoas (nome e idade),
            quando terminar de adicionar as pessoas (termine como considerar mais simples) mostre o conteúdo da lista

         */

    /*
        String nome = "Joao";
        String nome2 = "Maria";

        System.out.println(nome.equals(nome2));

        nome2 = "jOAO";
        System.out.println(nome.equalsIgnoreCase(nome2));

     */
        Scanner sc = new Scanner(System.in);
        // ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {

            System.out.print("Informe o nome: ");
            String nome = sc.nextLine(); // validar se o nome é valido

            sc = new Scanner(System.in);
            System.out.print("Informe a idade: ");
            int idade = sc.nextInt();// validar se o input e um int

            Pessoa pessoa = new Pessoa(nome, idade);
            // pessoas.add(pessoa);
            Pessoa.AdicionarPessoa(nome, idade);

            sc = new Scanner(System.in);
            System.out.print("Terminar? (S para sair): ");
            String sair = sc.nextLine();

            if (sair.equalsIgnoreCase("S")) {
                System.out.println("Terminou de adicioanr pessoas");
                break;
            }

        }

        System.out.println(Pessoa.ListaPessoas);




    }
}