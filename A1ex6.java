import java.util.Scanner;

public class A1ex6 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");

        int numero = in.nextInt();
        int numerador = 1, denominador = 2;
        float soma = 0;

        for(int i = 1; i <= numero; i++){
            soma = soma + (1f/i);
        }

        System.out.println("A soma é: " + soma);


    }
}
