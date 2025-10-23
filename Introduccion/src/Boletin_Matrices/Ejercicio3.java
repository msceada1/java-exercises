package Boletin_Matrices;

public class Ejercicio3 {
    /*
    Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
    misma, leídos por filas:
    1 3 5 --> La salida es: 1 3 5 0 2 7
    0 2 7
     */

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        imprimeMatrizLineal(matriz);
    }

    /**
     * Metodo que imprime una matriz de forma lineal
     *
     * @param matriz la matriz que se imprime
     */
    private static void imprimeMatrizLineal(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
