package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio1 {

    /*
    Crea un metodo que compruebe si en una matriz hay algún valor negativo, y devuelva un
    valor booleano
     */

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4, 5, 6, 1}, {0, 9, 8, 6, 2, 1}};

        MiEntradaSalida.imprimirMatriz(matriz);

        if (compruebaNegativo(matriz)) {
            System.out.println("la matriz tiene un elemento negativo");
        } else {
            System.out.println("la matriz no tiene un elemento negativo");
        }
    }

    /**
     * Comprueba si existe al menos un número negativo en la matriz bidimensional proporcionada.
     * <p>
     * El recorrido de la matriz se detiene inmediatamente al encontrar el primer valor negativo,
     * optimizando el rendimiento.
     *
     * @param matriz La matriz bidimensional de números enteros ({@code int[][]}) a examinar.
     * @return {@code true} si se encuentra al menos un elemento con un valor menor que cero (< 0);
     * {@code false} en caso contrario (si todos los elementos son cero o positivos).
     * @since 1.0
     */
    private static boolean compruebaNegativo(int matriz[][]) {

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    encontrado = true;
                    break;
                }
            }
        }

        return encontrado;
    }
}
