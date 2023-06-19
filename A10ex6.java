public class A10ex6 {
    
    public static int encontraMaior(int v[], int tam){
        
        if(tam == 1){
            return v[0];
        } else{
            int maior = encontraMaior(v, tam - 1);
            if(maior < v[tam - 1]){
                return v[tam - 1];
            }
            return maior;
        }
    }

    public static void main(String[] args) {
        
        int a[] = {1, 2, 6, 4, 5};
        int tamanho = a.length;

        int resultado = encontraMaior(a, tamanho);
        System.out.println(resultado);
    }
}
