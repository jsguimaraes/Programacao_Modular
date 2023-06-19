public class A10ex5 {
    
    public static void printReverse(char v[], int i){
        if(i != 0){
            System.out.print(v[i - 1] + " ");
            printReverse(v, i - 1);
        }
    }



    public static void main(String[] args) {
        
        String s = "jaime";
        char c[] = s.toCharArray();
        int tamanho = c.length;

        printReverse(c, tamanho);
    }
}
