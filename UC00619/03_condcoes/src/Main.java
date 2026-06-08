import java.util.Scanner;



/*


>
<
>=
<=
==
!=

! - not
&& - and
|| - or



 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Adulto");
        }else if (idade >= 12) {
            System.out.println("Teen");
        }else{
            System.out.println("Kid");
        }


        System.out.println("----------------------");

        int nota = 9;

        String msg = (nota >= 10) ? "Arpovado":"Não Arpovado" ;
        System.out.println(msg);

        
        System.out.println("Fim do programa");
    }
}