import java.util.Scanner;

public class A3ex1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int m[][] = new int[4][4];
        int maior = 0;

        System.out.println("Digite os valores da matris 4x4");

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] > 10){
                    maior++;
                }
                
            }
        }

        System.out.print(maior);




    }
}
