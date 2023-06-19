import java.util.InputMismatchException;
import java.util.Scanner;

public class A11ex2 {
    
    public static double dividirNumeros(int numerador, int denominador){
        if(denominador == 0){
            throw new ArithmeticException();
        }
        double divisao = (double) numerador / denominador;

        return divisao;
    }


    
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int A = 0;
        int B = 0;
        
        while(true){
            try{
                System.out.println("digite dois valores A e B");
                A = in.nextInt();
                B = in.nextInt();
                double resultado = dividirNumeros(A, B);
                System.out.println(resultado);
                break;
            } catch(InputMismatchException e) {
                System.out.println("valor invalido digite outro valor");
                in.nextLine();
            } catch(ArithmeticException e){
                System.out.println("ERRO, divisao por zero nao e permitida");
                in.nextLine();
            }
            

        }

    }
}
