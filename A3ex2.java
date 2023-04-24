public class A3ex2{
    public static void main(String[] args){

        int tamanho = 10;
        int m[][] = new int[tamanho][tamanho];

        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < m[i].length; j++){

                if(i < j){
                    m[i][j] = (2*i +7*j - 2);
                } else if(i == j){
                    m[i][j] = (int) (3 * Math.pow(i,2) - 1);
                } else{
                    m[i][j] = (int) (4 * Math.pow(i,3) + 5 * Math.pow(j,2) + 1);
                }
            }
        }

        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " \t");
            }
            System.out.println();
        }

        
    }
}
