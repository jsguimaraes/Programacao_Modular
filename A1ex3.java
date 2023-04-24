import java.util.Scanner;

public class A1ex3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float altura, peso;

        System.out.println("Digite sua altura, e logo em seguida o seu peso: ");

        altura = in.nextFloat();
        peso = in.nextFloat();

        
        if(peso <= 60){
            if(altura < 1.20){
                System.out.println("Sua classificação é A");
            } else if(altura < 1.70){
                System.out.println("Sua classificação é B");
            } else{
                System.out.println("Sua classificação é C");
            }
        } else if(peso <= 90){
            if(altura < 1.20){
                System.out.println("Sua classificação é D");
            } else if(altura < 1.70){
                System.out.println("Sua classificação é E");
            } else{
                System.out.println("Sua classificação é F");
            }
        }
    }
    
}
