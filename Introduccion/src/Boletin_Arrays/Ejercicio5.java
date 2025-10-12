package Boletin_Arrays;

import utils.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio5 {

    /*
    Crea un método, que acepte un parámetro “tamaño” de tipo entero, que genere un
    array de “tamaño” posiciones de números aleatorios de 0 a 1000 y lo muestre por
    pantalla.
     */

    public static void main(String[] args) {

        int tamanio = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce el tamaño del array");

        System.out.println(Arrays.toString(generaAleatorios(tamanio)));
    }

    /**
     * @param tamanio el tamaño que el usuario desea
     * @return un array con numeros aleatorios.
     */
    private static int[] generaAleatorios(int tamanio) {

        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            int numRandom = (int) (Math.random() * 1001);
            array[i] = numRandom;
        }

        return array;
    }
}
