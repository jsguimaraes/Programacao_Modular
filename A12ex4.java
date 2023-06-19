import java.util.Scanner;

import javax.xml.crypto.Data;

public class A12ex4 {
    
    public static void validarData(String data) throws DataVaziaException, DataInvalidaException{
        if(data.equals("")){
            throw new DataVaziaException();
        }else if(!data.matches("\\d{2}/\\d{2}/\\d{4}")){
            throw new DataInvalidaException();
        }

        String vetorData [] = data.split("/");

        if(Integer.parseInt(vetorData[0]) > 31 || Integer.parseInt(vetorData[0]) <= 0){
            throw new DataInvalidaException();
        } else if(Integer.parseInt(vetorData[1]) > 12 || Integer.parseInt(vetorData[1]) <= 0){
            throw new DataInvalidaException();
        } else if(Integer.parseInt(vetorData[2]) <= 0){
            throw new DataInvalidaException();
        }

    }


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma data");
        String date = in.next();

        try{
            validarData(date);
            System.out.println("Data Valida");
        } catch (DataVaziaException e) {
            System.out.println("A data nao pode estar vazia");
        } catch (DataInvalidaException e){
            System.out.println("A data fornecida não está no formato correto");
        }

    }
}
class DataVaziaException extends Exception{

}
class DataInvalidaException extends Exception{
    
}