import java.util.Scanner;

public class A3ex3 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        int m[][] = new int[3][3];
        int v[] = new int[3];
        int soma = 0;

        System.out.println("Digite os valores da matris 3x3");


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(j == 0){
                    v[0] =  v[0] + m[i][0];
                }
                if(j == 1){
                    v[1] = v[1] + m[i][1];
                }
                if(j == 2){
                    v[2] = v[2] + m[i][2];
                }
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println(v[i]);  
        }
    }
}
