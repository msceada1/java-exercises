package Boletin_3;

import java.util.Scanner;

public class Ejercicio_10 {

    /*
    Realizar un programa que solicite un número entero positivo o cero y
    calcule su factorial. Diseñar el programa de forma que si algún dato es
    incorrecto vuelva a solicitarse.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int resultado = 1;

        do {
            System.out.println("introduce un numero postivo");
            numero = scanner.nextInt();
        } while (numero < 0);

        if (numero == 0) {
            System.out.println("el factorial de 0 es 1 por definicion matematica");
        } else {
            for (int i = numero; i > 0 ; i--) {
                resultado *= i;
            }
            System.out.println("resultado = " + resultado);
        }

        scanner.close();

    }
}
