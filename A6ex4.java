import java.util.Scanner;

public class A6ex4 {
    
    public static void squareOfAsterisks(int side){
        for(int i = 0; i < side; i++){
            for(int j = 0; j < side; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
        
    }


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("digite um valor para o lado");
        int lado = in.nextInt();

        squareOfAsterisks(lado);

    }
}
