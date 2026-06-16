public class Funcionario extends Pessoa{

    private String dpt;

    public Funcionario(String nome, int idade, String email,  String dpt) {
        super(nome, idade, email); // <- a super class tem de ser init antes
        this.dpt = dpt;
    }


    public void metodoFuncionario() {
        System.out.println("Metodo Funcionario");
    }

    @Override
    public void getInfos() {
        System.out.println("infos Funcionario:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
    }

}
