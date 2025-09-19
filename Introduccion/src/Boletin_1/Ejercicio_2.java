package Boletin_1;

import utils.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio_2 {

    /*
    Realizar un programa que solicite dos números, base y exponente, enteros
    positivos (incluido el 0), y que calcule la potencia (base elevado a
    exponente) a través de productos. Si los datos son incorrectos deberán
    volverse a solicitar.
     */

    public static void main(String[] args) {

        //se introducen los datos utilizando la clase MiEntradaSalida.

        int base = MiEntradaSalida.solicitarEnteroPositivo("Introduce la base, recuerda que debe ser entero positivo");
        int exponente = MiEntradaSalida.solicitarEnteroPositivo("Introduce el exponente, recuerda que debe ser entero positivo");
        int resultado = 1;
        //procesamiento

        if (exponente == 0) {
            System.out.println("cualquier numero con exponente 0 es 1");
        } else {

            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            System.out.println("resultado = " + resultado);
        }

    }
}
