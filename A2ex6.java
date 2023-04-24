import java.util.Scanner;

public class A2ex6{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int R[] = new int[5];
        int S[] = new int[10];
        int X[] = new int[5];
        int cont = 0;

        System.out.println("Digite 5 valores para o vetor R e 10 Valores para o vetor S");

        for(int i = 0; i < 5; i++){
            R[i] = in.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            S[i] = in.nextInt();
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                if(R[i] == S[j]){
                    X[cont] = R[i];
                    cont++;
                }
            }
        }

        for(int i = 0; i < cont; i++){
            System.out.println(X[i]);
        }
    }
}