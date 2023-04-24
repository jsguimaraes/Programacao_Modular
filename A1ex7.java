import java.util.Scanner;

public class A1ex7 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor A:");

        int A = in.nextInt();
        System.out.println("Digite um valor N:");

        int N = in.nextInt();

        while(N <= 0){
            System.out.println("Digite um novo valor N:");
        }
        
        int soma = 0;

        for(int i = 0; i < N; i++){
            soma = soma + A;
            A++;

        }

        System.out.print(soma);

    }
}
