import java.util.Scanner;

public class A2ex4 {
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

        int aux [] = new int[9];
        int m = 0;

        for(int i = 0; i < 10; i++){
            for(int j = i +1; j < 10; j++){
                if(U[i] == U[j]){
                    boolean repetido = false;
                    for(int k = 0; k < 9; k++){
                        if(aux[k] == U[j]){
                            repetido = true;
                            break;
                        }
                        
                    }

                    if(!repetido){
                        aux[m] = U[j];
                        m++;
                    }
                
                }
            }
        }

        for(int i = 0; i < m; i++){
            System.out.println(aux[i]);
        }
    }
}
