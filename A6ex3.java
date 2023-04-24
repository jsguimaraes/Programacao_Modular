import java.util.Scanner;

public class A6ex3 {
    
    public static float calculaOperacao(float v1, float v2, char simbolo){
        float resultado = 0;
        if(simbolo != '+' && simbolo != '-' && simbolo != '*' && simbolo != '/'){
            System.out.println("Símbolo Invalido");
            return -1;
        }
        

        if(simbolo == '+'){
            resultado = v1 + v2;
        } else if(simbolo == '-'){
            resultado = v1 - v2;
        } else if(simbolo == '*'){
            resultado = v1 * v2;
        } else{
            resultado = v1 / v2;
        }
        return resultado;
    }


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois valores");

        float v1 = in.nextFloat();
        float v2 = in.nextFloat();

        System.out.println("Digite o simbolo da operação");
        char simbolo = in.next().charAt(0);

        float operacao = 0;

        operacao = calculaOperacao(v1, v2, simbolo);

        System.out.println(operacao);
    }

}
