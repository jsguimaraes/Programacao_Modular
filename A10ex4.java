public class A10ex4 {
    
    public static void printArray(int v[], int tam){
        if(tam != 0){
            printArray(v, tam - 1);
            System.out.print(v[tam - 1] + " ");
        }
    }
    
    
    public static void main(String[] args) {
        
        int a[] = {1, 2, 3, 4, 5};
        int t = a.length;
        printArray(a, t);
    }
}
