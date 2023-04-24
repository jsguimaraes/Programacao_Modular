import java.util.Scanner;

public class A6ex6 {
    
    public static int calculaFatorial(int numero){
        int resultado = 1;
        int contador = numero;
        for(int i = 0; i < numero; i++){
            resultado = resultado * contador;
            contador --;
        }
        return resultado;
    }


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numero = in.nextInt();

        int resultado = 0;
        resultado = calculaFatorial(numero);

        System.out.println(resultado);
        
    }



}
