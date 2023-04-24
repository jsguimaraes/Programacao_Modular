import java.util.Scanner;

public class A7ex2 {

    public static void modificaVetor(int []a){
        for(int i = 0; i < a.length; i++){
            if(i%2 == 0){
                a[i] = a[i] * 2;
            } else{
                a[i] = a[i] * 3;
            }
        }
    }


    public static void printVetor(int []b){
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        
        int tamanho = in.nextInt();

        int [] v = new int[tamanho];

        System.out.println("Digite elementos inteiros ao seu vetor de tamanho escolhido acima");

        for(int i = 0; i < tamanho; i++){
            v[i] = in.nextInt();
        }

        printVetor(v);
        modificaVetor(v);
        printVetor(v);
    }

}