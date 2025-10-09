package Boletin_3;

import utils.MiEntradaSalida;

public class Ejercicio9 {

    /*
    Realizar un programa que lea un número entero positivo y averigüe si es
    perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
    excepto él mismo. Diseñar el programa de forma que si algún dato es
    incorrecto vuelva a solicitarse.
     */

    public static void main(String[] args) {

        boolean perfecto = false;
        int suma = 0;
        int numero = MiEntradaSalida.leerEnteroPositivo("Introduce un numero positivo");

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (suma == numero) {
            perfecto = true;
        }
        System.out.println("perfecto = " + perfecto);
    }
}
