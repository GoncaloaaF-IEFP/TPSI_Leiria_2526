


public class Main {
    public static void main(String[] args) {

        int x = 100;

        System.out.println(x);

        System.out.println((double) x);

        System.out.println((float) x);

        // x = 12.313; <-- Errp pq 12.313 não e int

       //  System.out.println((String) x);

        String num = "100";

        System.out.println(num);
        // System.out.println((int) num);


        int i = 10;
        int j = 3;

        double div = (double) 10 / 3;
        System.out.println(div);

        float div2 = (float) 10 / 3;
        System.out.println(div2);


        // int -- > String
        int idade = 10;

        String idadeStr = String.format("%d", idade);
        System.out.println(idadeStr + " anos");

        String idadeStr2 = Integer.toString(idade);
        System.out.println(idadeStr2 + " anos 2");

        String idadeStr3 = String.valueOf(idade);
        System.out.println(idadeStr3 + " anos 3");

        // String ---> int
        String anoStr = "2026";
        int ano = Integer.parseInt(anoStr);
        System.out.println(ano + 10);
        
        String anoStr2 = "www2026";
        int ano2 = Integer.parseInt(anoStr2);
        System.out.println(ano + 10);

    }
}