
package validacionnumeros;
import java.util.Scanner;

public class ValidacionNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // arreglo para almacenar los números de entrada
        int[] numeros = new int[5];

        // ciclo for para recibir los números de entrada y validarlos
        for (int i = 0; i < numeros.length; i++) {
            // recibir número de entrada
            System.out.print("Ingrese el número #" + (i+1) + ": ");
            numeros[i] = sc.nextInt();

            // validar número de entrada
            if (numeros[i] >= 74 && numeros[i] <= 189 && numeros[i] % 2 == 0 && numeros[i] % 5 == 0) {
                System.out.println("Número validado.");
            }
        }

        sc.close();
    }
}


//El número debe ser mayor o igual a 74 (numeros[i] >= 74)
//El número debe ser menor o igual a 189 (numeros[i] <= 189)
//El número debe ser par (numeros[i] % 2 == 0)
//El número debe ser múltiplo de 5 (numeros[i] % 5 == 0)






