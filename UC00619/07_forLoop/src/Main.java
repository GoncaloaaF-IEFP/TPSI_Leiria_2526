

public class Main {
    public static void main(String[] args) {


        for(int i = 0; i < 10; i++) {

            System.out.println(i);

        }

        //Crie uma app para mostrar a tabuada do 2

        int tabuada = 2;

        for(int i = 1; i <= 10; i++) {
            int res = i * tabuada;
            System.out.printf("%d x %2d = %2d\n", tabuada, i, res);
        }
    }
}