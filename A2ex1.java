import java.util.Scanner;

public class A2ex1{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu vetor com 10 numeros inteiros");

        int X[] = new int[10];
        int Y[] = new int[10];

        for(int i = 0; i < 10; i++){
            X[i] = in.nextInt();
        }

        

        for(int indice = 0; indice < 10; indice++){
            if(indice % 2 == 0){
                Y[indice] = X[indice] * 2;
            } else{
                Y[indice] = X[indice] * 3;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.println(Y[i]);
        }


    }
}