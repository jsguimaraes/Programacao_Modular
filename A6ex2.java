import java.util.Scanner;

public class A6ex2 {

    public static boolean isMultiple(int v1, int v2){
        boolean multiplo = false;
        if(v2 % v1 == 0){
            multiplo = true;
        }
        return multiplo;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantos pares de inteiros voce quer verificar");
        int qtd = in.nextInt();
        int v1 = 0;
        int v2 = 0;
        boolean resultado;

        for(int i = 0; i < qtd; i++){
            System.out.println("digite o par de inteiros");
            v1 = in.nextInt();
            v2 = in.nextInt();
            resultado = isMultiple(v1, v2);
            System.out.println(resultado);
        }
    }
    
}
