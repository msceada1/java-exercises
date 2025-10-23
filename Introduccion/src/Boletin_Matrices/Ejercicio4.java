package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio4 {
    /*
    Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
    misma, leídos por filas, empezando por los últimos índices:
    1 3 5 --> La salida es: 7 2 0 5 3 1
    0 2 7
     */

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        MiEntradaSalida.imprimirMatriz(matriz);
        System.out.println();

        imprimeMatrizLinealInversa(matriz);
    }

    /**
     * Metodo que imprime por pantalla una matriz de forma lineal, mpezando desde la ultima posicion de la matriz,
     * hasta la primera (orden inverso). Se da el valor matriz.lenght - 1 para empezar en la ultima posicion, la condicion
     * de parada es que sea mayor igual que 0, y vamos decrementando para recorrer la matriz de forma inversa.
     *
     * @param matriz la matriz con la que se trabaja
     */
    private static void imprimeMatrizLinealInversa(int[][] matriz) {

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) { //matriz[i].length para que me recorra hasta el lenght de las filas [i]
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
