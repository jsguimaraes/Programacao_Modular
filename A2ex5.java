import java.util.Scanner;

public class A2ex5{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int v[] = new int[10];
        
        System.out.println("Digite 10 valores para o seu veotor");
        
        for(int i = 0; i < 10; i++){
            v[i] = in.nextInt();
            for(int j = 0; j < i; j++){
                if(v[i] == v[j]){
                    System.out.println("O Numero digitado, ja existe. Digite outro numero");
                    i--;                   
                }
            }
            
        }


        for(int i = 0; i < 10; i++){
            System.out.println(v[i]);
        }
    }
}