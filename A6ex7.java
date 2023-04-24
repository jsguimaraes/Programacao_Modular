import java.util.Scanner;

public class A6ex7 {

    public static int calculaFatorial(int numero){
        int resultado = 1;
        
        for(int i = 1; i <= numero; i++){
            resultado = resultado * i;
            
        }
        return resultado;
    }

    public static double calculaNeperiano(int numero){

        double soma = 0;
        
        for(int i = 0; i <= numero; i ++){
            
            soma = soma + 1 / (double)calculaFatorial(i);

        }
        return soma;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numero = in.nextInt();

        double resultado = 0;
        resultado = calculaNeperiano(numero);

        System.out.println(resultado);





    }






}
