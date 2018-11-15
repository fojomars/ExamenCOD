package factorial;

public class Factorial {

    public static void main(String[] args) {

        int x; // Cambie la variable j por x
        int f;

        x = 8;

        int i;
        if (x == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = x; i >= 1; i--) {
                f = f * i;
            }
        }

        System.out.println(f);

    }

}
