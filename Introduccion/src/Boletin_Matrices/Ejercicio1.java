package Boletin_Matrices;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[][] matriz = {{1, -2, 3, 4, 5, 6, -1}, {0, 9, 8, 6, 2, 1}};

        if (compruebaNegativo(matriz)) {
            System.out.println("la matriz tiene un elemento negativo");
        } else {
            System.out.println("la matriz no tiene un elemento negativo");
        }
    }

    private static boolean compruebaNegativo(int matriz[][]) {

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    encontrado = true;
                } else {
                    encontrado = false;
                }
            }
        }

        return encontrado;
    }
}
