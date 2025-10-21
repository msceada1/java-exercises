package Mis_Ejercicios;

import java.util.Arrays;

public class RepasoEjercicio10Arrays {

    public static void main(String[] args) {

        int[] array = {2, 5, 5, 2, 2, 7, 9, 10, 3, 2, 3, 7, 12, 15, 10, 23};

        System.out.println(Arrays.toString(eliminaDuplicados(array)));
    }

    /**
     * Elimina los elementos duplicados de un array de enteros.
     *
     * <p>El método recorre el array de entrada y construye un nuevo array
     * que solo contiene la primera aparición de cada elemento. La implementación
     * maneja el caso especial del valor cero ({@code 0}) si se usa para inicializar
     * el array de resultados, asegurando que solo se cuenta una vez si está presente
     * en el array original.</p>
     *
     * @param array El array de enteros del cual se desean eliminar los duplicados.
     * @return Un nuevo array de enteros que contiene los elementos únicos del array original,
     * en el orden de su primera aparición. El tamaño del array retornado será menor o igual
     * al tamaño del array de entrada.
     */
    private static int[] eliminaDuplicados(int[] array) {

        int[] arraySinDuplicados = new int[array.length];
        int posArraySinDuplicados = 0;

        boolean heTratadoElCero = false;
        /*
        Bandera booleana para manejar el caso especial del número cero (0).
        <p>Es necesaria porque un array de enteros en Java se inicializa con ceros.
        Si el array original contiene el 0, este se añadiría una sola vez
        mediante la lógica especial al inicio del bucle, y esta bandera
        asegura que los ceros restantes sean tratados por el método {@code contieneElemento}
        para evitar que el valor de inicialización (0) sea malinterpretado como
        un duplicado.</p>
         */


        for (int i = 0; i < arraySinDuplicados.length; i++) {
            if (array[i] == 0 && !heTratadoElCero) {
                posArraySinDuplicados++;
                heTratadoElCero = true;
                continue;
            }

            if (!contieneElemento(arraySinDuplicados, array[i])) {
                arraySinDuplicados[posArraySinDuplicados++] = array[i];
            }
        }

        return Arrays.copyOf(arraySinDuplicados, posArraySinDuplicados);
    }

    /**
     * Comprueba si un array de enteros contiene un elemento específico.
     *
     * @param array    El array de enteros a buscar.
     * @param elemento El valor entero que se desea encontrar en el array.
     * @return {@code true} si el {@code elemento} está presente en el {@code array},
     * {@code false} en caso contrario.
     */
    private static boolean contieneElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }

        return false;
    }
}
