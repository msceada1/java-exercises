package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio1 {

    /*
    Crea un programa que sume todas las posiciones pares de un array de enteros.
     */

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};

        System.out.println("el array es " + Arrays.toString(array1));

        System.out.println("la suma de las posiciones es " + sumaPosiciones(array1));
    }

    /**
     * Metodo para suma todas ls posiciones que hay dentro de un array, recorriendo con un bucle for, utilizando
     * una variable resultado que va a guardar el valor del array en la posicion [i], y va a sumarse por cada iteracion
     * para las posiciones pares
     *
     * @param array el array con el que se suma las posiciones pares
     * @return la suma de las posiciones pares del array
     */
    private static int sumaPosiciones(int[] array) {

        int resultado = 0;

        for (int i = 0; i < array.length; i += 2) {
            resultado += array[i];
        }

        return resultado;
    }
}
