class Carro {

    private String marca; // so podem aceder dentro da class
    public String modelo; // podem aceder onde a class for instanciada
    protected String cor; // so podem aceder dentro da class e nas sub-class
    int totalKm; // por defeito -> public


    Carro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.totalKm = 0;
    }


    void atualizarKm(int km) {
        this.totalKm += km;
    }


    private String getInfo(){
            return "Infos do Carro";

    }



}