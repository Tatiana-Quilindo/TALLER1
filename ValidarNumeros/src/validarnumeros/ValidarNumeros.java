package validarnumeros;

import java.util.Scanner;

public class ValidarNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        
        for (int i = 0; i < nums.length; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Ingrese un número par entre 74 y 189: ");
                nums[i] = input.nextInt();
                if (nums[i] >= 74 && nums[i] <= 189 && nums[i] % 2 == 0) {
                    valid = true;
                    if (nums[i] % 5 == 0) {
                        System.out.println("Número validado.");
                    } else {
                        System.out.println("El número es par pero no es múltiplo de 5.");
                    }
                } else {
                    System.out.println("El número no cumple los requisitos.");
                }
            }
        }
    }
}