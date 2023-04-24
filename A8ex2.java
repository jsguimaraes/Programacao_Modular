import java.util.Scanner;

public class A8ex2 {

    public static int contar(String a){
        int resultado = 0;
        resultado = a.length();
        return resultado;

    }

    public static int contar(char []b){
        int resultado = b.length;
        return resultado;


    }



    public static void main(String[] args){

        String s1 = "Jaime";

        char [] v = {'J','a','i','m','e'};
    
        System.out.println(contar(s1));
        System.out.println(contar(v));
    

    }

}
