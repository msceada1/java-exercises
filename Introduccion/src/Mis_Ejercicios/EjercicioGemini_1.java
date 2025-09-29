package Mis_Ejercicios;

import java.util.Scanner;

public class EjercicioGemini_1 {

    /*
    Realice un programa que solicite dos números: la base y el exponente.
    Ambos deben ser números enteros (positivos, negativos o cero).
    El programa deberá calcular la potencia (base exponente) utilizando exclusivamente
    multiplicaciones para la magnitud del cálculo, divisiones (solo si son estrictamente necesarias) y sumas/restas.
    Está prohibido usar la función nativa de potencia (pow()) o el operador de exponenciación (** o similar).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce la base");
        int base = scanner.nextInt();

        System.out.println("introduce el exponente");
        int exponente = scanner.nextInt();

        int resultado = 1;

        if (base == 0 && exponente == 0) {
            System.out.println("Error matematico");
        } else if (exponente == 0) {
            System.out.println("Cualquier numero con exponente 0 será 1");
        } else if (base == 0) {
            System.out.println("resultado = 0");
        } else if (exponente == 1) {
            System.out.println("resultado = " + base);
        } else {
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            System.out.println("resultado = " + resultado);
        }
    }
}
