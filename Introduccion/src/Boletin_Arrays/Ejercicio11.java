package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio11 {

    /*
    Crea un método que acepte 2 arrays, y devuelva un nuevo array con los elementos
    que ambos arrays tienen en común.
     */

    public static void main(String[] args) {

        int[] array1 = {1, 2, 1, 3, 3, 5, 6, 2, 9, 5, 6};
        int[] array2 = {4, 2, 5, 9, 1, 4, 6, 2, 10, 4, 7};

        System.out.println(Arrays.toString(arrayComun(array1, array2)));
    }

    /**
     * Verifica si un arreglo contiene un elemento específico.
     *
     * <p>Este método recorre el arreglo dado y comprueba si alguno de sus
     * elementos coincide con el valor especificado. Si lo encuentra, devuelve {@code true};
     * de lo contrario, devuelve {@code false}.</p>
     *
     * @param array    el arreglo en el que se buscará el elemento
     * @param elemento el valor que se desea verificar si está presente en el arreglo
     * @return {@code true} si el elemento está presente en el arreglo,
     * {@code false} en caso contrario
     */
    private static boolean contieneElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }

        return false;
    }

    /**
     * Obtiene un nuevo arreglo que contiene los elementos comunes entre dos arreglos.
     *
     * <p>El método busca los valores que aparecen en ambos arreglos sin repetir elementos.
     * La longitud del arreglo resultante será igual al número de elementos en común.</p>
     *
     * @param array1 el primer arreglo de enteros
     * @param array2 el segundo arreglo de enteros
     * @return un nuevo arreglo que contiene los elementos comunes a ambos arreglos,
     * sin duplicados
     */
    private static int[] arrayComun(int[] array1, int[] array2) {

        int min = Math.min(array1.length, array2.length);
        int contador = 0;
        int[] arrayFusion = new int[min];

        for (int i = 0; i < array1.length; i++) {
            if (contieneElemento(array2, array1[i]) && !contieneElemento(arrayFusion, array1[i])) {
                arrayFusion[contador++] = array1[i];
            }
        }


        return Arrays.copyOf(arrayFusion, contador);
    }


}
