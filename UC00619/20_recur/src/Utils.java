public class Utils {


    static int somador0Ate(int n) throws InvalidParamException {
        if (n < 0 ){
            throw new InvalidParamException();
        }

        int soma  = 0;

        // some todos os num int de 0 até n
        for (int i = 0; i <= n; i++){
            soma += i;
        }

        return  soma;
    }

    static int somador0Ate_recur(int n) throws InvalidParamException {
        if (n < 0 ){
            throw new InvalidParamException();
        }

        if (n == 0){
            return n;
        }else{
            return n + somador0Ate_recur(n-1);
        }


    }


    // Crie uma func recursiva para calcular um fatorial

    //  --->  crie uma func q faça o calcula de um expoente de forma recursiva <---

}
