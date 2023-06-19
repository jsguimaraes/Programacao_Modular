import java.util.Scanner;

public class A10ex1 {
    
    public static int fibo(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de N maior ou igual a 0");
        
        int numero = in.nextInt();

        while(numero < 0){
            System.out.println("O numero digitado foi negativo, Digite um numero maior ou igual a zero");
            numero = in.nextInt();
            if(numero >= 0){
                break;
            }
        }

        int resultado = fibo(numero);
        System.out.println(resultado);
    }
}
