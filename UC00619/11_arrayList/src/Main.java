import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<Integer>();

        idades.add(12);
        idades.add(23);
        idades.add(42);
        idades.add(45);
        idades.add(65);
        idades.add(70);
        idades.add(90);

        System.out.println(idades);

        System.out.println(idades.getFirst());
        System.out.println(idades.get(2));
        // System.out.println(idades.get(100)); // -> se nao existir IndexOutOfBoundsException

        idades.removeFirst();
        System.out.println(idades);




        int s = idades.size();
        System.out.println(s);

        ArrayList<Integer> newData = new ArrayList<Integer>();
        newData.add(12);
        newData.add(23);
        newData.add(42);
        newData.add(45);
        newData.add(65);
        newData.add(70);
        newData.add(90);

        idades.addAll(newData);
        s = idades.size();
        System.out.println(s);

        idades.addAll(List.of(12,23,42,45,65,70,90));
        s = idades.size();
        System.out.println(s);

        System.out.println(idades.contains(12));

        System.out.println(idades.indexOf(12));
        System.out.println(idades.lastIndexOf(12));


        System.out.println(idades);
        idades.add(1, 99);
        System.out.println(idades);

        System.out.println("------------------------");
        System.out.println("------------------------");

        for(int i = 0; i < idades.size(); i++){
            System.out.print(idades.get(i)+ " " );
        }

        System.out.println("\n------------------------");
        System.out.println("------------------------");

        for (int i :  idades){
            System.out.print(i + " " );
        }

        System.out.println("\n------------------------");
        System.out.println("------------------------");

        Collections.sort(idades);
        idades.sort(null);

        System.out.println(idades);

        Collections.sort(idades, Collections.reverseOrder());
        idades.sort(Collections.reverseOrder());

        System.out.println(idades);

        System.out.println("\n------------------------");
        System.out.println("------------------------");


        ArrayList<String> nomes = new ArrayList<>(List.of(
                "Ana", "Bruno","Carlos", "Diana", "Eduardo",
                "Filipa", "Gonçalo", "Helena", "Inês", "João",
                "Leonor", "Miguel", "Núria", "Pedro", "Rita",
                "Sofia", "Tiago", "Vera", "Xavier","Yara"
        ));

        System.out.println(nomes.subList(0, 5));

        nomes.subList(0, 5);

        System.out.println(nomes.subList(10, 20));

        nomes.add("Joana");
        nomes.add("Rui");
        nomes.add("Luis");
        System.out.println(nomes.subList(10,  nomes.size()));

    }


    // Crie um metodo que mostre penas a 2ª metade da lista
    // se a lista tem 10 elm -> 5 ao 10
    // se a lista tem 11 elm -> 5 ou 6 ao 11
    public static List<String> mostrarSegundaMetade(List<String> lista) {
        int tamanho = lista.size();
        int inicio = tamanho / 2;

        return  lista.subList(inicio, tamanho);

    }


}




