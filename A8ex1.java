import java.util.Scanner;

public class A8ex1 {

    public static double calculaNotaFinal(double prova1, double prova2){
        double media = 0;
        media = (prova1 + prova2) / 2;
        return media;
    }

    public static double calculaNotaFinal(double prova1, double prova2, double trab1){
        double mediaPonderada = 0;
        mediaPonderada = (prova1 * 3 + prova2 * 3 + trab1 * 4)/10;

        return mediaPonderada;
    }

    public static double calculaNotaFinal(double prova1, int peso1, double prova2, int peso2){
        double mediaPonderada = 0;
        mediaPonderada = (prova1 * peso1 + prova2 * peso2) / (peso1 + peso2);
        return mediaPonderada;
    }

    public static void main(String[] args){

        double provaA, provaB, trabC;
        int pesoA, pesoC;
        pesoA = 9;
        pesoC = 5;

        provaA = 9.5;
        provaB = 8.4;
        trabC = 7.0;

        System.out.println(calculaNotaFinal(provaA, provaB));
        System.out.println(calculaNotaFinal(provaA, provaB, trabC));
        System.out.println(calculaNotaFinal(provaA, pesoA, provaB, pesoA));


    }

}
