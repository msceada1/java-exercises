package Boletin_Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

    }

    private static int[] eliminaDuplicados(int[] array) {

        int[] arraySinDuplicados = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[i + 1]) {
                    arraySinDuplicados[i] = array[i];
                }
            }
        }
        return arraySinDuplicados;
    }
}
