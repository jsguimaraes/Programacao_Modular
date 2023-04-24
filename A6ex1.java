import java.util.Scanner;

public class A6ex1{
    
    public static int calculaPotencia(int base, int expoente){
        int potencia = 1;
        for(int i = 0; i < expoente; i++){
            potencia = potencia * base;
        }
        return potencia;
    }


    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da base, e logo em seguida o expoente");

        int base = in.nextInt();
        int expoente = in.nextInt();
        int resultado = 0;
        
        resultado = calculaPotencia(base, expoente);

        System.out.println(resultado);

    }
}