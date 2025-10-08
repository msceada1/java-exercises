package Boletin_3;

import java.util.Scanner;

public class Ejercicio6 {

    /*
    Realizar un programa que lea dos números enteros cualesquiera numeroA
    y numeroB, y calcule el producto los números mediante sumas, es decir,
    sin usar el operador *.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un numero");
        int num1 = scanner.nextInt();

        System.out.println("introduce otro numero");
        int num2 = scanner.nextInt();

        int producto = num1 * num2;
        int suma = 0;

        for (int i = 0; i < Math.abs(num2); i++) {
            suma += num1;
        }

        if (num2 < 0) producto = -producto;

        System.out.println("producto = " + producto);
        System.out.println("suma = " + suma);

        scanner.close();

    }
}
