import java.util.Scanner;

public class A10ex3 {
    
    public static int mult(int A, int B){
        if(A == 0 || B == 0){
            return 0;
        } else{
            return A + mult(A, B - 1);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois valores para fazer a multiplicação atraves de soma sucessiva");

        int a =in.nextInt();
        int b =in.nextInt();
        int resultado = mult(a, b);

        System.out.println(resultado);
    }
}
