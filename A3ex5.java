import java.util.Scanner;

public class A3ex5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int m[][] = new int[4][4];
        int aux = 0;
        System.out.println("Digite os numeros da sua matriz");

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(j % 2 == 0){
                        aux = m[i][j];
                        m[i][j] = m[i][j+1];
                        m[i][j+1] = aux;
                    }
                }

            
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
