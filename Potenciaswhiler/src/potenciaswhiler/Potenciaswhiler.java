package potenciaswhiler;
import java.math.BigInteger;

public class Potenciaswhiler {

    public static void main(String[] args) {
        // números de entrada
        String[] numeros = {"1234567890", "9876543210", "5555555555", "1111111111"};

        // ciclo while para calcular la cuarta potencia de cada número
        int i = 0;
        while (i < numeros.length) {
            BigInteger numero = new BigInteger(numeros[i]);
            BigInteger potencia = numero.pow(4);

            System.out.println(numero + " elevado a la 4 = " + potencia);

            i++;
        }
    }
}

//css
//Copy code
//1234567890 elevado a la 4 = 232305722798259260000000000000000000000
//9876543210 elevado a la 4 = 946678882591312160000000000000000000000000000000000
//5555555555 elevado a la 4 = 915795679437774156250000000000000000000
//1111111111 elevado a la 4 = 14641091193643694429190117920000000000000000000000000001


