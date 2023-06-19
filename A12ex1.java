import java.util.Scanner;

public class A12ex1 {

    public static int soma(int v[], int tam){
        if(tam == 1){
            return v[0];
        } else{
            return v[tam - 1] + soma(v, tam - 1);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do seu vetor");
        int tamanho = in.nextInt();

        System.out.println("Digite os valores do seu vetor");
        int array[] = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            array[i] = in.nextInt();
        }
        int resultado = soma(array, tamanho);

        System.out.println(resultado);
    }
    
}
