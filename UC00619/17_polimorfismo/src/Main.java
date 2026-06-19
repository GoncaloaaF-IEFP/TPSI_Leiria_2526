import java.util.ArrayList;
import java.util.Scanner;

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




        ArrayList<Animal> animais = new ArrayList<Animal>();

        animais.add(c);
        animais.add(g);
        animais.add(new Cao());


        while(true){



            Scanner sc = new Scanner(System.in);

            System.out.println("Continuar (S/N): ");
            String s = sc.nextLine();

            if(s.equalsIgnoreCase("N")){
                break;
            } else if (!s.equalsIgnoreCase("S")) {
                // se s ≠ 'N' e s ≠ 'S'
                System.out.println("Opção invalida");
                System.out.println("tente novamente");

            }


                System.out.println("Vai continuar");




        }


    }

    // Crie um array(apenas 1 array) para guardar animais
    // adicione estaticamente 2 cães e um gato
    // faça todos os animais fazerSom





    // crie a possibilidade de adicionar cães e gatos (usando apenas um loop)
    // deve perguntar se quer continuar
    // se a opt for invalida deve dar essa indicação e pedir novamente
    // bonus limpe o ecrã


}