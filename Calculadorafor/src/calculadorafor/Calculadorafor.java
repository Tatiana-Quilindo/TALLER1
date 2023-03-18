
package calculadorafor;
import java.util.Scanner;
public class Calculadorafor {

   public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
      
      System.out.print("Ingrese la cantidad de cálculos a realizar: ");
      int cantidad = Sc.nextInt();
      
      for(int i = 1; i <= cantidad; i++) {
         System.out.print("Ingrese el primer número: ");
         double num1 = Sc.nextDouble();
         
         System.out.print("Ingrese el segundo número: ");
         double num2 = Sc.nextDouble();
         
         System.out.print("Ingrese el tercer número: ");
         double num3 = Sc.nextDouble(); 
         
         System.out.print("Ingrese la operación a realizar (+, -, *, /, %): ");
         char operacion = Sc.next().charAt(0);
         
         double resultado = 0;
         
         switch(operacion) {
            case '+':
               resultado = num1 + num2 + num3;
               break;
            case '-':
               resultado = num1 - num2 - num3;
               break;
            case '*':
               resultado = num1 * num2 * num3;
               break;
            case '/':
               resultado = num1 / num2 / num3;
               break;
            case '%':
               resultado = num1 % num2 % num3;
               break;
            default:
               System.out.println("Operación inválida. Intenta nuevamente.");
               i--;
               continue;
         }
         
         System.out.println("El resultado de la operación es: " + resultado);
      }
   }
}