import java.util.Scanner;

public class A9ex3 {
    
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        System.out.println("Digite as n posições");
        int n = in.nextInt();

        String resposta = "";

        for(int i = 0; i < a.length(); i++){
            int c = a.charAt(i);
            if(c >= 65 && c <= 90){
                c += n;
                if(c > 90){
                    c = c - 26;
                }
                resposta = resposta + (char)c;
            }
            else if(c >= 97 && c <= 122){
                c += n;
                if(c > 122){
                    c = c - 26;
                }
                resposta = resposta + (char)c;
            }else{
                resposta = resposta + (char)c;
            }
        }

        System.out.println(resposta);
    }


}
