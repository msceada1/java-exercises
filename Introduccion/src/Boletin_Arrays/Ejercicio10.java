package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        int[] array = {0, 1, 1, 2, 0, 3, 4, 5, 3, 6, 6, 0, 7, 8, 8, 9, 11, 11, 11};

        System.out.println("el array es " + Arrays.toString(array));

        System.out.println("el array sin duplicados es " + Arrays.toString(eliminaDuplicados(array)));
    }

    /**
     * Elimina los elementos duplicados de un array de enteros.
     * <p>
     * Este método utiliza un enfoque de O(n^2), que es menos eficiente que usar un HashSet,
     * pero logra el objetivo sin utilizar estructuras de datos de la librería Collections de Java.
     * Mantiene el orden de la primera aparición de cada elemento.
     *
     * @param array El array de enteros del cual se eliminarán los duplicados.
     *              No debe ser {@code null}.
     * @return Un nuevo array de enteros que contiene solo los elementos únicos
     * del array de entrada, manteniendo su orden de primera aparición.
     */
    private static int[] eliminaDuplicados(int[] array) {
        int[] arraySinDuplicados = new int[array.length];

        int posArraySinDuplicados = 0;

        boolean heTratadoElCero = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && !heTratadoElCero) {
                posArraySinDuplicados++;
                heTratadoElCero = true;
                continue;
            }
            if (!contieneElemento(arraySinDuplicados, array[i])) {
                arraySinDuplicados[posArraySinDuplicados++] = array[i];
            }
        }

        arraySinDuplicados = Arrays.copyOf(arraySinDuplicados, posArraySinDuplicados);

        return arraySinDuplicados;
    }

    /**
     * Comprueba si un elemento entero está contenido dentro de un array de enteros.
     * Itera sobre el array y compara cada elemento con el valor buscado.
     *
     * @param array    El array de enteros a ser examinado. No debe ser {@code null}.
     * @param elemento El elemento entero a buscar dentro del array.
     * @return {@code true} si el elemento se encuentra en el array; {@code false} en caso contrario.
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
     * Metodo para eliminar los elementos duplicados de un array. Creamos un array copia igual que el original.
     * Se utiliza doble for para recorrer los array y una variable boolean que indica si el elemento dentro del array
     * es repetido. Si el elemento no es repetido, se introduce en un array que se devuelve.
     *
     * @param array El array que se analiza
     * @return el array sin elementos duplicados.
     */
    /* esta fue la solucion que se me ocurrio a mi
     private static int[] eliminaDuplicados(int[] array) {

        int[] arraySinDuplicados = new int[array.length];
        int[] arrayCopia = array;

        for (int i = 0; i < array.length - 1; i++) {
            boolean repetido = false;                       //la variable boolean me indica si el elemento es repetido
            for (int j = i + 1; j < arrayCopia.length; j++) {
                if (array[i] == arrayCopia[j]) {
                    repetido = true;
                }
            }
            if (!repetido) {                               //si no ha sido repetido, entonces la copio dentro del array
                arraySinDuplicados[i] = array[i];
            }
        }

        return arraySinDuplicados;
    }
     */

}
