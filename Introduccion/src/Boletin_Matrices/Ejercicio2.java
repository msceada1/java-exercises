package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio2 {

    /*
    Crea un metodo que sume todas las posiciones de una matriz y devuelva dicho número
     */

    public static void main(String[] args) {

        int[][] matriz = {{2, 3, 4, 5, 7, 4, 2, 7}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};

        MiEntradaSalida.imprimirMatriz(matriz);

        System.out.println();

        System.out.println("la suma de las posiciones de la matriz es " + sumaPosicionesMatriz(matriz));
    }

    /**
     * Calcula y devuelve la suma total de todos los elementos contenidos
     * en una matriz bidimensional de números enteros ({@code int[][]}).
     * <p>
     * El metodo recorre cada fila y cada columna de la matriz, sumando
     * el valor de cada posición al total acumulado.
     *
     * @param matriz La matriz bidimensional de números enteros a sumar.
     *               Puede ser una matriz regular (rectangular) o irregular (ragged).
     * @return La suma de todos los valores enteros dentro de la matriz.
     * @since 1.0
     */
    private static int sumaPosicionesMatriz(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }
}
