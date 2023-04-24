import java.util.Scanner;

public class A7ex1 {

    public static int somaElementosVetor(int [] a){
        int soma = 0;
        for(int i = 0; i < a.length; i++){
            soma = soma + a[i];
        }
        return soma;
    }

    public static int multiplicaElementosVetor(int [] b){
        int multiplica = 1;
        for(int i = 0; i < b.length; i++){
            multiplica = multiplica * b[i];
        }
        return multiplica;
    }

    public static int calculaMaior(int [] c){
        int maior = c[0];
        for(int i = 0; i < c.length; i++){
            if( maior < c[i]){
                maior = c[i];
            }
        }
        return maior;
    }

    public static int numeroRepeticaoMaior(int [] d){
        int repetiu = 0;
        for(int i = 0; i < d.length; i++){
            if(d[i] == calculaMaior(d)){
                repetiu++;
            }
        }
        return repetiu;
    }





    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("digite o tamanho do seu vetor");

        int n = in.nextInt();

        int v [] = new int [n];

        for(int i = 0; i < n; i++){
            v[i] = in.nextInt();
        }

        int resultadoSoma = somaElementosVetor(v);
        int resultadoMultiplica = multiplicaElementosVetor(v);
        int resultadoMaior = calculaMaior(v);
        int resultadoRepetiu = numeroRepeticaoMaior(v);

        System.out.println(resultadoSoma);
        System.out.println(resultadoMultiplica);
        System.out.println(resultadoMaior);
        System.out.println(resultadoRepetiu);

        
        


    }







}