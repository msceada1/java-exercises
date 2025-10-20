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

    private static boolean posicionComun(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean contieneElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }

        return false;
    }

    private static int[] arrayComun(int[] array1, int[] array2) {

        int contador = 0;
        int[] arrayFusion = new int[contador];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (posicionComun(array1, array2)) {
                    arrayFusion[contador++] = array1[i];
                }
            }
        }

        return Arrays.copyOf(arrayFusion, contador);
    }
}
