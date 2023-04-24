import java.util.Scanner;

public class A1ex1{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite as notas obtidas nas provas e em seguidas as notas do trabalho");

        float prova1 = in.nextFloat();
        float prova2 = in.nextFloat();
        float trab1 = in.nextFloat();
        float trab2 = in.nextFloat();

        float mediaFinal = (prova1 + prova2 + trab1 + trab2)/4;

        System.out.println("nota 1: " + prova1 +
        "\nnota 2: " + prova2 +
        "\nTrabalho 1: " + trab1 +
        "\nTrabalho 2: " + trab2);


        System.out.println("A média final é: " + mediaFinal);

        float mediaPonderada = ((prova1 * 0.3f) + (prova2 * 0.3f) + (trab1 * 0.2f) + trab2 * 0.2f);

        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}
    