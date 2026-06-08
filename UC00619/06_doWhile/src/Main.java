
public class Main {
    public static void main(String[] args) {

        int num = 100;

        do{

            if(num == 30){
                System.out.println("Vai sair");
                break; // termina o loop
            }

            if(num % 2 == 0){
                num -= 1;
                continue;
            }
            System.out.println(num);

            num -= 1; //  <=> n

        }while(num > 0);

    }
}