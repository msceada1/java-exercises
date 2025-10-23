package Boletin_Matrices;

public class Ejercicio6 {

    /*
    Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
    misma, pero leídos por columna, empezando por los últimos índices:
    1 3 5 --> La salida es: 7 5 2 3 0 1
    0 2 7
     */

    public static void main(String[] args) {

        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        imptimeMatrizLinealPorColumnasInversa(matriz);
    }

    private static void imptimeMatrizLinealPorColumnasInversa(int[][] matriz) {

        for (int j = matriz[0].length - 1; j >= 0; j--) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
