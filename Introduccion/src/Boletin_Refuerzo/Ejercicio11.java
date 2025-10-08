package Boletin_Refuerzo;

/**
 * Crea un método que calcule la suma de los elementos de un array y la imprima por
 * pantalla.
 */

public class Ejercicio11 {

    /**
     * @param array array que espera una longitud por parametros
     * @return Devuelve la suma de ls elementos del array
     */
    public static int sumaArray(int[] array) {
        int longitud = array.length;
        int arraySumado = 0;

        for (int i = 0; i < longitud; i++) {
            arraySumado += array[i];
        }
        return arraySumado;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        int resultadoSuma = sumaArray(myArray);

        System.out.println("el resultado de la suma de los arrays es : " + resultadoSuma);
    }
}
