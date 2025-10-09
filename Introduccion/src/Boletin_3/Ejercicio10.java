package Boletin_3;

import utils.MiEntradaSalida;

public class Ejercicio10 {

    /*
    Realizar un programa que solicite un número entero positivo o cero y
    calcule su factorial. Diseñar el programa de forma que si algún dato es
    incorrecto vuelva a solicitarse.
     */

    public static void main(String[] args) {


        int numero = MiEntradaSalida.leerEnteroPositivo("Introduce un numero mayor o igual a 0");
        int acumulador = 1;

        if (numero == 0) {
            System.out.println("el factorial de 0 es 1 por definicion matematica");
        } else {
            for (int i = numero; i > 1; i--) {
                acumulador *= i;
            }
            System.out.println("resultado = " + acumulador);
        }

    }
}
