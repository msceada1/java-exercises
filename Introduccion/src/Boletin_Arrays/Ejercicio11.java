package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio11 {

    /*
    Crea un método que acepte 2 arrays, y devuelva un nuevo array con los elementos
    que ambos arrays tienen en común.
     */

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 3, 2, 1, 7, 7, 4, 5, 7, 4, 14};
        int[] array2 = {4, 5, 2, 10, 12, 6, 7, 2, 5, 6, 12, 16};

        System.out.println(Arrays.toString(devuelveElementosComunes(array1, array2)));


    }

    /**
     * Metodo que devuelve un array con los elementos combinados
     *
     * @param array1 el array con el que se trabaja
     * @param array2 el segundo array con el que se trabaja.
     * @return el array con los elementos comunes.
     */
    private static int[] devuelveElementosComunes(int[] array1, int[] array2) {

        int[] arrayComun = new int[15];
        int contadorComunes = 0;

        for (int i = 0; i < array1.length; i++) {
            boolean comun = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    comun = true;
                    contadorComunes++;
                }
            }
            if (comun) {
                arrayComun[i] = array1[i];
            }
        }

        return arrayComun;
    }


}
