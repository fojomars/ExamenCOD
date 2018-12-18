package numerosprimos;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean primo = false;

    public static void main(String arg[]) {
        int numeroDigitos = 0; // Cambie el nombre de la variable numDigitos por numeroDigitos
        int contadorNumDigitos = 0; // Cambie el nombre de la variable nDigitos por contadorNumDigitos
        numeroDigitos = Integer.parseInt(arg[0]);
        if (numeroDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int numero = 1; numero <= 99999; numero++) {
            int divisionEntera = numero;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contadorNumDigitos = contador;

            if (contadorNumDigitos == numeroDigitos) {
                if (numero < 4) {
                    primo = true;
                } else {
                    if (numero % 2 == 0) {
                        primo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (numero - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (numero % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(numero);
                }
            }
        }
    }
// Terminado
}
