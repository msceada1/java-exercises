package Boletin_Refuerzo;

import utils.MiEntradaSalida;

public class Ejercicio2 {

    /*
    Crea un programa que convierta un número binario a decimal.
     */
    public static void main(String[] args) {

        String numeroBinario = MiEntradaSalida.leerCadena("Introduce un numero Binario");

        System.out.println("el numero binario " + numeroBinario + " en decimal es " + Integer.parseInt(numeroBinario, 2));
    }
}
