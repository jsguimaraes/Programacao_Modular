import java.util.Scanner;

public class A1ex5 {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        int soma = 0;

        for(int i = 0; i <= 100; i++){
            if(i%2 == 0){
                soma = soma + i;
            }
        }

        System.out.println("A soma é :" + soma);



    }
}
