public class Main {
    public static void main(String args) {

       String  nome = "A";
       String nomes ="b";
       String nomes2 = "c";

        imprimirNomes(nome,nomes);

    }



    public static void imprimirNomes(String ... nome ){
        for(int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
        }
    }



}