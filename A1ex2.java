import java.util.Scanner;

public class A1ex2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do raio da sua circunferencia:");

        double raio, area;

        raio = in.nextDouble();

        area = (Math.PI) * Math.pow(raio, 2);

        System.out.printf("A area da circunferencia é: %.2f ", area);


    }
}
