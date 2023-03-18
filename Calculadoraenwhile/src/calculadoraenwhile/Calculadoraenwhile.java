
package calculadoraenwhile;

import java.util.Scanner;
public class Calculadoraenwhile {



    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cantidad = 0;
        int i = 0;
        int num1 = 0, num2 = 0, num3 = 0;
        int resultado = 0;
        String operacion = "";
        
        // Pedir cantidad de veces a realizar el cálculo
        System.out.print("\033[0;32mIngrese la cantidad de veces que desea hacer el calculo: \033[0m");
        cantidad = entrada.nextInt();
        
        while (i < cantidad) {
            // Pedir los tres números
            System.out.print("\033[0;34mIngrese el primer número: \033[0m");
            num1 = entrada.nextInt();
            System.out.print("\033[0;34mIngrese el segundo número: \033[0m");
            num2 = entrada.nextInt();
            System.out.print("\033[0;34mIngrese el tercer número: \033[0m");
            num3 = entrada.nextInt();
            
            // Pedir la operación a realizar
            System.out.print("\033[0;34mIngrese la operación a realizar (suma, resta, multiplicación, división o modulo): \033[0m");
            operacion = entrada.next();
            
            // Realizar la operación correspondiente
            switch (operacion) {
                case "suma":
                    resultado = num1 + num2 + num3;
                    break;
                case "resta":
                    resultado = num1 - num2 - num3;
                    break;
                case "multiplicación":
                    resultado = num1 * num2 * num3;
                    break;
                case "división":
                    resultado = num1 / num2 / num3;
                    break;
                case "modulo":
                    resultado = num1 % num2 % num3;
                    break;
                default:
                    System.out.println("\033[0;31mOperación no valida.\033[0m");
                    continue;
            }
            
            // Mostrar el resultado
            System.out.println("\033[0;32mEl resultado es: " + resultado + "\033[0m");
            i++;
        }
        
        entrada.close();
    }
    
}