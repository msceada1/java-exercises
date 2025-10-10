package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[] array = {-1, -2, 4, 5, -6, 3, -9};

        System.out.println("el array es : " + Arrays.toString(array));

        System.out.println("hay " + cuentaNegativos(array) + " numeros negativos en el array : " + Arrays.toString(array));
    }

    /**
     * @param array el array para comprobar
     * @return contador de numeros negativos que tiene el array
     */
    private static int cuentaNegativos(int[] array) {

        int contadorNegativo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contadorNegativo++;
            }
        }
        return contadorNegativo;
    }
}
