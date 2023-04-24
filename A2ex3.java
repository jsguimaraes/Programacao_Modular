import java.util.Scanner;

public class A2ex3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu vetor com 10 numeros inteiros Positivos");

        int U[] = new int[10];
        
        for(int i = 0; i < 10; i++){
            U[i] = in.nextInt();
            if(U[i] <= 0){
                System.out.println("Digite um numero inteiro positivo");
                U[i] = in.nextInt();
            }
        }

        for(int i = 0; i < 10; i++){
            for(int j = i +1; j < 10; j++){
                if(U[i] == U[j]){
                    System.out.println(U[i]);
                    break;
                }
            }
        }


    }
}
