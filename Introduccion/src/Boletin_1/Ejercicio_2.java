package Boletin_1;

import utils.MiEntradaSalida;

public class Ejercicio_2 {
    /*
    Realizar un programa que solicite dos números, base y exponente, enteros
    positivos (incluido el 0), y que calcule la potencia (base elevado a
    exponente) a través de productos. Si los datos son incorrectos deberán
    volverse a solicitar.
     */

    public static void main(String[] args) {

        //definicion de variables
        int base = MiEntradaSalida.solicitarEntero("Introduce la base, recuerda que debe ser entero positivo");
        int exponente = MiEntradaSalida.solicitarEntero("Introduce el exponente, recuerda que debe ser entero positivo");
        int resultado = 1;

        //procesamiento
        if (exponente == 0) {
            System.out.println("cualquier numero con exponente 0 es 1");
        } else if (base == 0) {
            System.out.println("resultado = 0");
        } else {
            for (int i = 0; i < Math.abs(exponente); i++) {
                resultado *= base;
            }

            if (exponente < 0) {
                resultado = -resultado;
            }
            System.out.println("resultado = " + resultado);
        }
    }
}
