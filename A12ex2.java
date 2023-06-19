public class A12ex2 {
    
    public static int power(int base, int expoente){
        if(expoente == 0){
            return 1;
        } else{
            return base * power(base, expoente - 1);
        }
    }
    
    
    
    public static void main(String[] args) {
        
        int numero, exp, resultado;
        numero = 3;
        exp = 1;
        resultado = power(numero, exp);
        System.out.println(resultado);
    }
}
