package Boletin_Arrays;

import utils.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio9 {

    public static void main(String[] args) {

        int[] array = {9, 1, 4, 2, 12, 6, 8};
        int opcion = MiEntradaSalida.leerEnteroEnRango("Opcion 1: Orden ascendente. Opcion 2: Orden descendente.", 1, 2);

        System.out.println(Arrays.toString(arrayOrdenado(array, opcion)));
    }

    /**
     * @param array  el array con el que se trabaja
     * @param opcion la orden que introduce el usuario
     * @return el array ordenado
     */
    private static int[] arrayOrdenado(int[] array, int opcion) {

        if (opcion == 1) {
            Arrays.sort(array);
        } else if (opcion == 2) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        return array;
    }

}
