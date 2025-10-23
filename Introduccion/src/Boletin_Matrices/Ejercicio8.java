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
        int[][] matriz2 = {{4, 1}, { 0}};

        if (!mismasDimensiones(matriz1, matriz2)) {
            System.out.println("la matriz no es simetrica");
        } else {
            MiEntradaSalida.imprimirMatriz(sumaMatrices(matriz1, matriz2));
        }
    }

    private static boolean mismasDimensiones(int[][] matriz1, int[][] matriz2) {

        if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
            return true;
        } else {
            return false;
        }
    }

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
