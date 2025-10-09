package Boletin_Refuerzo;

import utils.MiEntradaSalida;

public class Ejercicio3 {

    /**
     * Crea un programa que convierta un número decimal a binario.
     */

    public static void main(String[] args) {

        int numero = MiEntradaSalida.leerEntero("Introduce un numero");

        System.out.println("el numero " + numero + " en binario es " + Integer.toBinaryString(numero));
    }
}
