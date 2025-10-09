package Boletin_Refuerzo;

import utils.MiEntradaSalida;

public class Ejercicio6 {

    /**
     * Crea un programa que convierta un número de grados Celsius a Fahrenheit
     */

    public static void main(String[] args) {

        //definicion de variables
        double gradosCelsius = MiEntradaSalida.leerDoublePositivo("Introduce los grados");

        double gradosFarenheit = (gradosCelsius * ((double) 9 / 5)) + 32;
        System.out.println("gradosFarenheit = " + gradosFarenheit);
    }
}
