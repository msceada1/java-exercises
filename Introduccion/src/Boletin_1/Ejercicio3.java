package Boletin_1;

import utils.MiEntradaSalida;

public class Ejercicio3 {
    /*
    Realizar un programa que solicite un número entero y determine el número
    de cifras que tiene dicho número.
    Ejemplo:
    Introduce un número: 124
    El número 124 tiene 3 cifras
     */

    public static void main(String[] args) {

        //definicion de variables
        int num = MiEntradaSalida.leerEntero("Introduce un numero entero");
        int contadorCifras = 1; //inicializo contador en 1 para sumar la ultima cifra que no se incrementa en el while.

        //procesamiento
        while (num / 10 != 0) {
            num = num / 10;
            contadorCifras++;
        }
        System.out.println("contadorCifras = " + contadorCifras + " cifras");
    }
}
