import java.util.Scanner;

public class A9ex1 {
    
    public static int calculaFatorial(int numero){
        int resultado = 1;
        for(int i = 1; i <= numero; i++){
            resultado = resultado * i;
        }
        return resultado;
    }

    public static double converteEmRadianos(double grau){
        double radiano = 0;
        radiano = grau * Math.PI / 180;
        return radiano;
    }

    public static double calculaSeno(double grau){
        double radiano = converteEmRadianos(grau);
        double soma = 0;
        for(int i = 0; i <= 5; i++){
            soma = soma + (Math.pow(-1, i)) / calculaFatorial(2*i+1) * Math.pow(radiano, 2*i+1);
        }  
        return soma;      
    }

    public static void main(String[] argrs){

        Scanner in = new Scanner(System.in);


        int a = in.nextInt();

        // System.out.println(calculaFatorial(a));
        // System.out.println(converteEmRadianos(a));
        System.out.println(calculaSeno(a));
    }
}
