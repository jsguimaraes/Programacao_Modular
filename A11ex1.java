import java.util.InputMismatchException;
import java.util.Scanner;

public class A11ex1 {
    
    // public static int calculaMaior(int a[]){
    //     int oMaior = a[0];
    //     for(int i = 1; i < a.length; i++){
    //         if(oMaior < a[i]){
    //             oMaior = a[i];
    //         }
    //     }
    //     return oMaior;
    // }

    public static int calculaMaior(int a[]){
        return calcMaior(a, a.length);
    }

    public static int calcMaior(int b[], int tamanho){
        if(tamanho == 1){
            return b[0];
        } else {
            int maior = calcMaior(b, tamanho - 1);
            if(maior < b[tamanho - 1]){
                return b[tamanho - 1];
            }
            return maior;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de N");
        int tamanho = in.nextInt();

        System.out.println("Digite os numeros do seu vetor de tamanho N");
        int v[] = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            try{
                System.out.println("Digite o valor do vetor de tamanho N");
                v[i] = in.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("valor invalido digite outro valor");
                in.nextLine();
                i--;
            }
        }

        int resultado = calculaMaior(v);
        System.out.println(resultado);


    }
}
