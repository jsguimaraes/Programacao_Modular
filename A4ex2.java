import java.util.Random;

public class A4ex2{
    public static void main(String[] args){
        
        String [] artigo = {"the", "a", "one", "some", "any"};
        String [] substantivo = {"boy", "girl", "dog", "town", "car"};
        String [] verbo = {"drove", "jumped", "ran", "walked", "skipped"};
        String [] preposicao = {"to", "from", "over", "under", "on"};
        String frase = "";
        Random r = new Random();
        
        for(int i = 0; i < 10; i++){
            frase = artigo[r.nextInt(5)] + " " + substantivo[r.nextInt(5)] + " " + verbo[r.nextInt(5)] + " " + preposicao[r.nextInt(5)] + " " + artigo[r.nextInt(5)] + " " + substantivo[r.nextInt(5)];
            System.out.println(frase.toUpperCase().charAt() + frase.substring(1) + ".");
        }
        
        
    }
}