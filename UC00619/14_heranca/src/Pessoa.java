/*
private - > so dentro da class
public  - > em qualquer lado
protected
 */


public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    private String telefone;

    public Pessoa(String nome, int idade, String email) {

        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String infoPessoa(){
        return  "Info da Pessoa";
    }

    protected void funcTeste(){
        System.out.println("It Works!!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {this.telefone = telefone;}


}