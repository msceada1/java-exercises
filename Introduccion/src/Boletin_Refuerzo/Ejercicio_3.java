package Boletin_Refuerzo;

import utils.MiEntradaSalida;

public class Ejercicio_3 {

    /**
     * Crea un programa que convierta un número decimal a binario.
     */

    public static void main(String[] args) {

        int numero = MiEntradaSalida.solicitarEntero("Introduce un numero");

        System.out.println("el numero " + numero + " en binario es " + Integer.toBinaryString(numero));
    }
}
