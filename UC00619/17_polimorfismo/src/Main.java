

public class Main {
    public static void main(String[] args) {

        Animal a =  new Animal();
        Animal c = new Cao();
        Animal g = new Gato();

        a.fazerSom();

        c.fazerSom();
       // c.metodoCao();
        ((Cao) c).metodoCao();

        g.fazerSom();
    //    g.metodosGato();
        ((Gato) g).metodoGato();
    }

    //Aplique o polimosfismo ao seu exemplo de funcionarios e clientes
}