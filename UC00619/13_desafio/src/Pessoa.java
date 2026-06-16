import java.util.ArrayList;

public class Pessoa {

    static public ArrayList<Pessoa> ListaPessoas = new ArrayList<Pessoa>();

    static public void AdicionarPessoa(Pessoa p) {
        ListaPessoas.add(p);
    };

    static public void AdicionarPessoa(String nome, int idade) {
        AdicionarPessoa(new Pessoa(nome, idade));
    };



    private String nome;
    private int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
