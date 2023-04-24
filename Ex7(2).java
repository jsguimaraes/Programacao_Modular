import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um valor para A: ");
        
        int A = in.nextInt();
        
        System.out.println("Digite um valor para N: ");
            
        int N = in.nextInt();
        
        while(true){
            if(N > 0){
                break;
            } else{
                System.out.println("Digite um novo valor para N: ");
                N = in.nextInt();
            } 
        }
        
        int soma = 0;
        
        for(int i = 0; i < N; i++){
            soma = soma + A;
            A++;
        }
        
        System.out.print(soma);
        
    }
}