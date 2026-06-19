import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            // ligo a base de dados
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int n = input.nextInt(); // se txt -> InputMismatchException
            System.out.println(n);

            int res = 10/ n; // se n = 0 -> op impossivel -> ArithmeticException

            System.out.println(res);

            //Erro

            ArrayList<String> lst = new ArrayList<String>();

            lst.add("v1");
            lst.add("v2");

            System.out.println(lst.get(4));

        } catch (InputMismatchException e) {
            System.out.println("O valor é invalido ");
        } catch (ArithmeticException e) {
            System.out.println("O valor é invalido, a conta da erro " + e); // Log
        }catch (Exception e) {
            System.out.println("Erro Generico: " + e);

        }finally {  // é sempre Executado

            System.out.println("Finalizado");
            // fecha ligação a base de dados
        }

        System.out.print("O codigo segue ");


        // int res  = 10/1;


        /*
        ArrayList<String> lst = new ArrayList<String>();

        lst.add("v1");
        lst.add("v2");

        System.out.println(lst.get(4));


*/


        // faça um program Java que receba 2 num int e divida o 1º pelo 2ª
        // faça o tratamento dos erros


    }
}