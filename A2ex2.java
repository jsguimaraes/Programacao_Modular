import java.util.Scanner;

public class A2ex2 {
    public static void main(String[] arg){


        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu vetor U com 10 numeros inteiros");

        int U[] = new int[10];
        
        for(int i = 0; i < 10; i++){
            U[i] = in.nextInt();
        }

        int guardaValor = 0;
        int ultimo = 9;


        for(int i = 0; i < 5; i++){
            guardaValor = U[i];
            U[i] = U[ultimo];
            U[ultimo] = guardaValor;
            ultimo--;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(U[i]);
        }



    }
}
