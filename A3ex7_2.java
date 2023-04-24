import java.util.Scanner;

public class A3ex7_2{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o tamanho das suas matrizes quadradas");
        int tamanho = in.nextInt();
        
        int A[][] = new int[tamanho][tamanho];
        int B[][] = new int[tamanho][tamanho];
        System.out.println("Digite os valores da suas matrizes A e B");
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                A[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                B[i][j] = in.nextInt();
            }
        }
        
        int R[][] = new int[tamanho][tamanho];
        int soma = 0;
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                for(int k = 0; k < tamanho; k++){
                    soma = soma + (A[i][k] * B[k][j]);
                }
                R[i][j] = soma;
                soma = 0;
            }
        }
        int achou1 = 0;
        int achou0 = 0;
        for(int i = 0; i < R.length; i++){
            for(int j = 0; j < R[i].length; j++){
                if(i == j && i ==1){
                    achou1++;
                } else if(i != j && i == 0){
                    achou0++;
                }
                if(achou1 == tamanho && achou0 == (tamanho*tamanho) - achou1){
                    System.out.println("São inversas");
                }
            }
        }
        
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                System.out.print(R[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}