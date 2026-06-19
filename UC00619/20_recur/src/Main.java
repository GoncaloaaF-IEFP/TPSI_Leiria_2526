
public class Main {

    /*

    5 + 4 + 3 + 2 + 1 = 15

    Soma 0 -> n -> 1 + 2 + 3
    Soma n -> 0 -> 3 + 2 + 1

     soma(4 + 3 + 2 + 1) = 4  + soma(3 + 2 + 1)
    soma(3 + 2 + 1) <=> 3 + soma(2 + 1)
    soma(2 + 1) = 2 + 1
    2 + 1 = 3

     */
    public static void main(String[] args) throws InvalidParamException {


       int res = Utils.somador0Ate(5);

       System.out.println(res);

        System.out.println("-------------");
        System.out.println(Utils.somador0Ate_recur(5));

    }





}