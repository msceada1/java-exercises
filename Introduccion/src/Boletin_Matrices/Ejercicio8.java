package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio8 {

    /*
     Crea un metodo que reciba dos matrices, que deben ser de igual tamaño, y sume el
    contenido de las posiciones en una tercera matriz, que será la que devuelva:
    | 1 2| + | 4 1| = | 5 3|
    | 4 6| | 1 0| | 5 6|

     */

    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2}, {4, 6}};
        int[][] matriz2 = {{4, 1}, {1, 0}};

        if (!mismasDimensiones(matriz1, matriz2)) {
            System.out.println("la matriz no es simetrica");
        } else {
            MiEntradaSalida.imprimirMatriz(sumaMatrices(matriz1, matriz2));
        }
    }

    /**
     * Metodo que compara las dimensiones de dos matrices
     *
     * @param matriz1 la matriz  que se compara
     * @param matriz2 la segunda matriz que se compara
     * @return true si tienen las mismas dimensiones, false si no
     */
    private static boolean mismasDimensiones(int[][] matriz1, int[][] matriz2) {

        if (matriz1.length != matriz2.length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i] != matriz2[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Metodo que suma las posiciones de dos matrices
     *
     * @param matriz1 la matriz con la que se trbaja
     * @param matriz2 la segunda matriz con la que se trabaja
     * @return una matriz con la suma de las dos matrices introucidas por parametros
     */
    private static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {

        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[0].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizSuma;
    }
}
