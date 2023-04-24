import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite as dimensoes da sua matriz A");
        int La = in.nextInt();
        int Ca = in.nextInt();
        int A[][] = new int[La][Ca];
        
        System.out.println("Digite os VALORES da sua matriz A");
        for(int i = 0; i < La; i++){
            for(int j = 0; j < Ca; j++){
                A[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Digite as dimensoes da sua matriz B");
        int Lb = in.nextInt();
        int Cb = in.nextInt();
        int B[][] = new int[Lb][Cb];
        
        System.out.println("Digite os VALORES da sua matriz B");
        for(int i = 0; i < Lb; i++){
            for(int j = 0; j < Cb; j++){
                B[i][j] = in.nextInt();
            }
        }
        
        if(Ca == Lb){
            
            int R[][] = new int[La][Cb];
            int soma = 0;
            
            for(int i = 0; i < La; i++){
                for(int j = 0; j < Cb; j++){
                    for(int k = 0; k < Ca; k++){
                        soma = soma + (A[i][k] * B[k][j]);
                    }
                    R[i][j] = soma;
                }
            }
            
            System.out.println("Multiplicação da matriz A e B");
            for(int i = 0; i < La; i++){
                for(int j = 0; j < Cb; j++){
                    System.out.print(R[i][j] + " ");
                }
                System.out.println();
            }
            
        } else{
            System.out.println("Não é possivel realizar multiplicação de matrizes por incompatibilidade nas dimensões");
        }
        
    }
}