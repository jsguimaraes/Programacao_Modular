import java.util.Scanner;

public class A10ex2 {
    
    public static int somacubos(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else{
            return (int)Math.pow(n, 3) + somacubos(n - 1);
        }
        
    }
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de N");

        int N = in.nextInt();

        int resultado = somacubos(N);

        System.out.println("Soma = " + resultado);


    }
}
