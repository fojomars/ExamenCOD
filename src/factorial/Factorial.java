package factorial;

public class Factorial {

    public static void main(String[] args) {

        int numero;
        int factorial;

        numero = 8;

        int producto;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (producto = numero; producto >= 1; producto--) {
                factorial = factorial * producto;
            }
        }

        System.out.println(factorial);

    }

}
