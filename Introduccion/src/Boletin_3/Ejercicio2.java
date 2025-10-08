package Boletin_3;

import java.util.Scanner;

public class Ejercicio2 {

    /*
    Realizar un programa que lea un número entero entre 0 y 10 y visualice su
    tabla de multiplicar.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("introduce un numer entre 0 y 10");
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 10);

        for (int i = 0; i < 11; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
        scanner.close();
    }
}
