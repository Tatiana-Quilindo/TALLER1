
package factorial;

public class Factorial {
   public static void main(String[] args) {
      int num;
      //num es el número y lo pongo como int porque es un entero. 
      long factorial;
// el long es un tipo de dato primitivo que guarda numeros enteros muy grandes.
      for(num = 1; num <= 10; num++) {
         factorial = 1;
         for(int i = 1; i <= num; i++) {
            factorial *= i;
         }
         System.out.println("Factorial de " + num + " es: " + factorial);
      }
   }
}

