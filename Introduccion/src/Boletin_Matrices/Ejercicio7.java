package Boletin_Matrices;

public class Ejercicio7 {

    /*
     Crea un metodo que reciba dos matrices, y compruebe si son exactamente iguales.
     */

    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] matriz2 = {{1, 2, 3, 4}, {1, 2, 3, 4}};

        if (!tieneMismasDimensiones(matriz1, matriz2) || !tieneMismosValores(matriz1, matriz2)) {
            System.out.println("las matrices no son iguales");
        } else {
            System.out.println("las matrices son iguales");
        }
    }

    /**
     * Metodo que permite saber si dos matrices tienen las mismas dimensiones
     *
     * @param matriz1 la matriz que se compara con las segunda
     * @param matriz2 la matriz que se compara con la primera
     * @return true si son iguales de dimension, false si no
     */
    private static boolean tieneMismasDimensiones(int[][] matriz1, int[][] matriz2) {

        if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
            return true;
        }

        return false;
    }

    /**
     * Metodo que compara los numeros de dos matrices
     *
     * @param matriz1 la matriz que se compara
     * @param matriz2 la segunda matriz que se compara
     * @return {@code true} si los elementos son iguales o {@code false} si no son igaules
     */
    private static boolean tieneMismosValores(int[][] matriz1, int[][] matriz2) {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
