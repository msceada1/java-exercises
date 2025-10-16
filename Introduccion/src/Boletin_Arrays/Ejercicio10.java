package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 4, 5, 3, 6, 6, 7, 8, 8, 9, 11, 11, 11};
        System.out.println(Arrays.toString(eliminaDuplicados(array)));
    }

    /**
     * Metodo para eliminar los elementos duplicados de un array. Creamos un array copia igual que el original.
     * Se utiliza doble for para recorrer los array y una variable boolean que indica si el elemento dentro del array
     * es repetido. Si el elemento no es repetido, se introduce en un array que se devuelve.
     *
     * @param array El array que se analiza
     * @return el array sin elementos duplicados.
     */
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
}
