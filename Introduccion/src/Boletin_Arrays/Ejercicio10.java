package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 4, 5, 3, 6, 6, 7, 8, 8, 9, 11, 11, 11};
        System.out.println(Arrays.toString(eliminaDuplicados(array)));
    }

    private static int[] eliminaDuplicados(int[] array) {

        int[] arraySinDuplicados = new int[array.length];
        int[] arrayCopia = array;
        int cuentaDuplicados = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < arrayCopia.length; j++) {
                if (array[i] != arrayCopia[j]) {
                    arraySinDuplicados[i] = array[i];
                }
            }
        }

        return arraySinDuplicados;
    }
}
