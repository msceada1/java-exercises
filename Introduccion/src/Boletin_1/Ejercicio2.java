package Boletin_1;

import utils.MiEntradaSalida;

public class Ejercicio2 {
    /*
    Realizar un programa que solicite dos números, base y exponente, enteros
    positivos (incluido el 0), y que calcule la potencia (base elevado a
    exponente) a través de productos. Si los datos son incorrectos deberán
    volverse a solicitar.
     */

    public static void main(String[] args) {

        //definicion de variables
        int base = MiEntradaSalida.leerEntero("Introduce la base");
        int exponente = MiEntradaSalida.leerEntero("Introduce el exponente");
        int acumulador = 1;

        //procesamiento
        if (exponente == 0 && base == 0) {
            System.out.println("0 elevado a 0 no es calculable");
        } else if (base == 0) {
            System.out.println("resultado = 0");
        } else if (exponente == 0) {
            System.out.println("cualquier numero elevado a 0 da como resultado 1");
        } else {
            for (int i = 0; i < Math.abs(exponente); i++) {
                acumulador *= base;
            }

            if (exponente < 0) {
                acumulador = -acumulador;
            }
            System.out.println("resultado = " + acumulador);
        }
    }
}
