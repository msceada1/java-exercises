package Boletin_Arrays;

import utils.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio8 {

    /*
     Crea un método que devuelva la posición que ocupa un valor dentro de un array, o
    -1 si el array no contiene ese valor.
     */

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            int numRandom = (int) (Math.random() * 10);
            array[i] = numRandom;
        }

        System.out.println("El array es " + Arrays.toString(array));

        int numeroBuscado = MiEntradaSalida.leerEntero("Que numero quieres saber si se encuentra dentro del array?");

        System.out.println(devuelvePosicion(array, numeroBuscado));
    }

    /**
     * @param array         el array que se analiza
     * @param numeroBuscado el valor que el usuario desea saber si se encuentra dentro del array
     * @return la posicion del array si se encuentra numeroBuscado o -1 si no se encuentra
     */
    private static int devuelvePosicion(int[] array, int numeroBuscado) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                return i;
            }
        }
        return -1;
    }
}
