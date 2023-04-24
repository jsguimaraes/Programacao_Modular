import java.util.Scanner;

public class ex5Aula2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int U[] = new int[10];
        System.out.println("Digite o seu vetor com 10 numeros ");
        
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite outro numero");
            int U[] = new int[10];
            for(int j = 0; j < i; j++){
                if(U[i] == U[j]){
                    i--;
                }
            }
            
        }


        for(int i = 0; i < 10; i++){
            System.out.println(U[i]);
        }


    }
}
