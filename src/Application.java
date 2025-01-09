public class Application {
    public static void main(String[] args) {
        soma(2,2,4,2);
    }
//criar um metodo sem definir os objetos, usando o  varargs "..." , não sendo obrigado a fornecet  todos os elementos  que está no metodo
    public static void soma(int... a) {
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {

            resultado += a[i];

        }
        System.out.println(resultado);
    }
}
