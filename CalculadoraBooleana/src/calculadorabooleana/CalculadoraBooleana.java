
package calculadorabooleana;
import java.util.Scanner;
public class CalculadoraBooleana {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       int cantidadCalculos = 0;
        boolean operando1, operando2, resultado;
        String operacion;

        try {
            System.out.print("Ingrese la cantidad de cálculos a realizar: ");
            cantidadCalculos = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: entrada inválida. Sólo se permiten números enteros.");
            return;
        }

        for (int i = 0; i < cantidadCalculos; i++) {
            System.out.println("\nCálculo " + (i+1) + ":");

            try {
                System.out.print("Ingrese el primer operando (true o false): ");
                operando1 = scanner.nextBoolean();
            } catch (Exception e) {
                System.out.println("Error: entrada inválida. Sólo se permiten los valores 'true' o 'false'.");
                i--;
                continue;
            }

            try {
                System.out.print("Ingrese el segundo operando (true o false): ");
                operando2 = scanner.nextBoolean();
            } catch (Exception e) {
                System.out.println("Error: entrada inválida. Sólo se permiten los valores 'true' o 'false'.");
                i--;
                continue;
            }

            try {
                System.out.print("Ingrese la operación a realizar (AND, OR o XOR): ");
                operacion = scanner.next();
            } catch (Exception e) {
                System.out.println("Error: entrada inválida. Sólo se permiten las operaciones 'AND', 'OR' o 'XOR'.");
                i--;
                continue;
            }

            if (operacion.equals("AND")) {
                resultado = operando1 && operando2;
                System.out.println("El resultado de " + operando1 + " AND " + operando2 + " es: " + resultado);
            } else if (operacion.equals("OR")) {
                resultado = operando1 || operando2;
                System.out.println("El resultado de " + operando1 + " OR " + operando2 + " es: " + resultado);
            } else if (operacion.equals("XOR")) {
                resultado = operando1 ^ operando2;
                System.out.println("El resultado de " + operando1 + " XOR " + operando2 + " es: " + resultado);
            } else {
                System.out.println("Operación inválida.");
                i--;
                continue;
            }
        }

        System.out.println("\nFin del programa.");
    }
}