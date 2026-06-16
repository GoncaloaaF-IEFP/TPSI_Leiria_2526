


public class Main {
    public static void main(String[] args) {

        System.out.println(Pessoa.count);
        Pessoa p = new Pessoa("Gonçalo", 20);

        System.out.println(Pessoa.count);
        Pessoa p2 = new Pessoa("Maria", 19);

        System.out.println(Pessoa.count);
        System.out.println(p);
        System.out.println(p2);

        System.out.println(Pessoa.count);
    }
}