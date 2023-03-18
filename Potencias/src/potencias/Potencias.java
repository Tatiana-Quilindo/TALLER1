
package potencias;

import java.math.BigInteger;

public class Potencias {
    public static void main(String[] args) {
        // números de entrada
        String[] numeros = {"1234567890", "9876543210", "5555555555", "1111111111"};

        // ciclo for para calcular la cuarta potencia de cada número
        for (int i = 0; i < numeros.length; i++) {
            BigInteger numero = new BigInteger(numeros[i]);
            BigInteger potencia = numero.pow(4);

            System.out.println(numero + " elevado a la 4 = " + potencia);
        }
    }
}
