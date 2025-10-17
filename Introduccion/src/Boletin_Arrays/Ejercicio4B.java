package Boletin_Arrays;

import utils.MiEntradaSalida;

public class Ejercicio4B {

    final static int CANTIDAD_NUMEROS = 6000;

    public static void main(String[] args) {
        int[] digitos = new int[10];
        double media;
        double suma = 0;
        int digito;
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            int numGenerado = MiEntradaSalida.generaAleatorioEntre(0, 100, true);
            suma += numGenerado;
            digitos[numGenerado % 10]++;
        }
        media = suma / CANTIDAD_NUMEROS;
        System.out.println("La media es " + media);
        System.out.println();

        int mayor = Integer.MIN_VALUE;
        int mayorIndice = 0;
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] > mayor) {
                mayor = digitos[i];
                mayorIndice = i;
            }
        }
        System.out.println("El digito que mas se repite es el " + mayorIndice);
        System.out.println();
        for (int i = 0; i < digitos.length; i++) {
            System.out.printf("El nº %d Se ha repetido %d veces. Esto equivale a un %.2f%%%n", i, digitos[i], ((digitos[i] / (double) CANTIDAD_NUMEROS) * 100));
            System.out.println();
        }
    }
}
