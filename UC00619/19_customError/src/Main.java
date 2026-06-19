import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int n = -1;
        try {
            n = readInt("Numero:");
        } catch (InputMismatchException ex) {
            System.err.println("o input é  invalido ");
        }
        System.out.println(n);


        try {
            numNegativo(-1);
        }catch (NumeroNegativoException e) {

            System.out.println(e.getMessage());
        }



        System.out.println("fim do programa");
        
    }
    
    
    public static int readInt(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.print(prompt + " ");
        return input.nextInt();
    }


    public static boolean numNegativo(int i) throws NumeroNegativoException {

        if (i < 0) {
            throw new NumeroNegativoException();
        }

        return true;



    }

}