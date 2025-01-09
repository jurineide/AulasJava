public class Main {
    public static void main(String... args) {

       String [] nomes = {"n1", "n2", "n3", "n4", "n5"};

        imprimirNomes(nomes);

    }

    public static void imprimirNomes(String... nomes){
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}