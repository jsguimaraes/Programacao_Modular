import java.util.Scanner;
    
public class A3ex6 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite as dimensões da matriz A: L e C");
        int L = in.nextInt();
        int C = in.nextInt();
        int A[][] = new int[L][C];

        System.out.println("Digite os valores da matriz A");
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                A[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite as dimensões da matriz B: L e C");
        int Lb = in.nextInt();
        int Cb = in.nextInt();
        int B[][] = new int[Lb][Cb];

        System.out.println("Digite os valores da matriz B");
        for(int i = 0; i < Lb; i++){
            for(int j = 0; j < Cb; j++){
                B[i][j] = in.nextInt();
            }
        }
    
        if(C == Lb){
            int R[][] = new int[L][Cb];
            int soma = 0;

            for(int i = 0; i < L; i++){
                for(int j = 0; j < Cb; j++){
                    for(int k = 0; k < C; k++){
                        soma = soma + A[i][j] * B[i][j];
                    }
                    R[i][j] = soma;
                }
            }

            for(int i = 0; i < L; i++){
                for(int j = 0; j < Cb; j++){
                    System.out.print(R[i][j] + " ");
                }
                System.out.println();
            }

        }else{
            System.out.println("Não é possivel realizar a multiplicação das matrizes por incompatibilidade");
        }


    }
}
