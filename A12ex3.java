import java.util.Scanner;

public class A12ex3 {
    
    public static boolean isPolindromo(String s1, String s2, int inicio, int fim){
        if(inicio == s1.length()){
            return true;
        } else if(s1.charAt(inicio) != s2.charAt(fim)){
            return false;
        } else{
            return isPolindromo(s1, s2, inicio + 1, fim - 1);
        }
    }

    public static boolean isPolindromo(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        } else{
            return isPolindromo(s1, s2, 0, s2.length() - 1);
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite duas palavras");

        String palavra1, palavra2;
        palavra1 = in.next();
        palavra2 = in.next();

        boolean resultado = isPolindromo(palavra1, palavra2);

        if(resultado == true){
            System.out.println("São Polindromas mutuas");
        } else{
            System.out.println("Não são polidromas");
        }
    }
}
