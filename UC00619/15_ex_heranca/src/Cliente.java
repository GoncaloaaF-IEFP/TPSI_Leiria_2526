public class Cliente extends Pessoa{

    private double totalGasto;

    public Cliente(String nome, int idade, String email) {
        super(nome, idade, email); // <- a super class tem de ser init antes
        this.totalGasto = 0;
    }


    public void metodoCliente() {
        System.out.println("Metodo Cliente");
    }

    @Override
    public void getInfos() {
        System.out.println("Cliente: ");
        super.getInfos();
    }


}
