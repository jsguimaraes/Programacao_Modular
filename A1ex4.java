import java.util.Scanner;

public class A1ex4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");

        int numero = in.nextInt();
        if(numero%3 == 0 && numero%5 == 0){
            System.out.println("NÃO");
        }else if(numero%3 == 0 || numero%5 == 0){
            System.out.println("SIM");
        } else{
            System.out.println("NAO");
        }
    }
}
