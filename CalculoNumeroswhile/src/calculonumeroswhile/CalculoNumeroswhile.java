/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculonumeroswhile;

public class CalculoNumeroswhile {

    public static void main(String[] args) {
        // arreglo para almacenar los números de entrada
        double[] numeros = {15.25, 16.08, 17.62, 18.47, 19.01, 19.31};

        // variable para contar el número de elementos procesados
        int i = 0;

        // ciclo while para calcular la operación con cada número
        while (i < numeros.length) {
            double resultado = ((numeros[i] * 100) / 2) + 100;

            System.out.println("El resultado de ((" + numeros[i] + " * 100) / 2) + 100 es: " + resultado);

            i++;
        }
    }
}
