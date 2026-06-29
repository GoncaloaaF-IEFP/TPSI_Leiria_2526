/*

 n =  1 * 2 * 3 * 4  <=> n = 4 * 3 * 2 * 1

n =  1 * n2
n2 = 2 * n3
n3 = 3 * n4
n4 = 4 * 1

n??

 */



public class Main {
    public static void main(String[] args) {
    System.out.println(factorial(5));
    }


    public static int factorial(int n){ // n  = n * n-1 * n-1 * ... * 1

        if(n == 1){
            return n;
        }

        return n * factorial(n-1);
    }

    /*
        Crie um contador de 10 a 0 recursivo
     */


       /*
        Crie um contador de 0 a 10 recursivo

     */



    /*
        Crie um contador de 0 a N recursivo

        O N deve ser fornecido pelo utilizador

          se N = 5
          o output
          0
          1
          2
          3
          4
          5

     */

}