import java.util.Scanner;

public class A3ex4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero de linhas e colunhas");

        int L = in.nextInt();
        int C = in.nextInt();

        int A[][] = new int[L][C];
        int T[][] = new int[C][L];

        System.out.println("Digite os numeros da sua matriz");
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                A[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < C; i++){
            for(int j = 0; j < L; j++){
                T[i][j] = A[j][i];
            }
        }

        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < C; i++){
            for(int j = 0; j < L; j++){
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }


    }
}
