package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};

        System.out.println("el array es " + Arrays.toString(array1));

        System.out.println("la suma de las posiciones es " + sumaPosiciones(array1));
    }

    private static int sumaPosiciones(int[] array) {

        int resultado = 0;

        for (int i = 0; i < array.length; i += 2) {
                resultado += array[i];
        }

        return resultado;
    }
}
