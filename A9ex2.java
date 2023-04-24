import java.util.Scanner;

public class A9ex2 {
    
    public static void trocaVetor(int []v){
        int guardaValor = 0;
        for(int i = 0; i < v.length - 1; i++){
            guardaValor = v[i];
            v[i] = v[i+1];
            v[i+1] = guardaValor;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int []vetor = new int[n];
        
        for(int i = 0; i < n; i++){
            vetor[i] = in.nextInt();
        }

        trocaVetor(vetor);
        for(int i = 0; i < n; i++){
            System.out.print(vetor[i] + " ");
        }
    }


}
