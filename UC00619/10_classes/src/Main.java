


public class Main {
    public static void main(String[] args) {

        // Carro c = new Carro();
        // System.out.println(c.marca);
        // c.marca = "Fiat";
        // System.out.println(c.marca);

        Carro c2 = new Carro("Fiat","500", "Branco");

        //System.out.println(c2.marca);
        //System.out.println(c2.totalKm);

        c2.atualizarKm(10);

        System.out.println(c2.totalKm);

        c2.atualizarKm(15);

        System.out.println(c2.totalKm);

        System.out.println("-------Aluno------------");


        Aluno al = new Aluno("Ana", "Redes", 15.4);

        System.out.println(al.getNome());


        System.out.println(al.getHorasFalta());

        al.addFalta(6);

        System.out.println(al.getHorasFalta());

        al.addFalta();

        System.out.println(al.getHorasFalta());


        System.out.println("---");

        String al_str = al.toString();

        System.out.println(al_str);
        System.out.println(al);
    }

}

/*


Crie a class Pessoa com nome, idade, altura,e telefone

func para Altere a idade (fazer a pessoa envelhecer)

para cada ano que envelhece deve crescer 1.5 cm, aos 25 anos para de crescer

adapte o exercicio anterior de forma a encapsular as porp.

implemente o overload na sua Pessoa

adicione o metodo toString a class Pessoa

garanta que o nome da pessoa não pode ser alterado

 */