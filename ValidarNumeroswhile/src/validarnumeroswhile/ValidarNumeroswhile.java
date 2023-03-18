
package validarnumeroswhile;
import java.util.Scanner; 
public class ValidarNumeroswhile {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Inicializamos una variable contador para contar cuántos números válidos hemos obtenido
        int contador = 0;
        
        // Mientras no hayamos obtenido 5 números válidos, seguimos pidiendo al usuario que ingrese números
        while (contador < 5) {
            System.out.print("Ingresa un número: ");
            int numero = sc.nextInt();
            
            if (numero >= 74 && numero <= 189 && numero % 2 == 0 && numero % 5 == 0) {
                System.out.println("Numero validado");
                contador++;
            } else {
                System.out.println("Numero invalido");
            }
        }
        
        // Cuando hemos obtenido 5 números válidos, salimos del bucle while y mostramos un mensaje de finalización
        System.out.println("Se han validado 5 numeros correctamente");
        
        sc.close();
    }
}





