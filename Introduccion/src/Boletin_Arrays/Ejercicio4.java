package Boletin_Arrays;

public class Ejercicio4 {

    private static final int CANTIDAD_ALEATORIOS = 6000;

    public static void main(String[] args) {

        int[] array = new int[CANTIDAD_ALEATORIOS];

        for (int i = 0; i < array.length; i++) {
            int numAleatorio = (int) (Math.random() * 101);
            array[i] = numAleatorio;
        }

        System.out.println("la media de los numeros es " + media(array));

        digitoFinal(array);

    }

    /**
     * @param array el array con el que se trabaja
     * @return la media de los valores que hay en cada posicion
     */
    private static double media(int[] array) {

        int suma = 0;

        for (int i = 0; i < CANTIDAD_ALEATORIOS; i++) {
            suma += array[i];
        }

        double media = (double) suma / CANTIDAD_ALEATORIOS;

        return media;
    }

    /**
     * @param array el array con el que se trabaja
     */
    private static void digitoFinal(int[] array) {

        int[] contadores = new int[10];

        //preguntar el for al maestro.
        for (int i = 0; i < array.length; i++) {
            int digitoFinal = array[i] % 10;
            contadores[digitoFinal]++;
        }

        int digitoMasRepetido = contadores[0];

        for (int i = 0; i < contadores.length; i++) {
            if (digitoMasRepetido < contadores[i]) {
                digitoMasRepetido = contadores[i];
            }
        }

        System.out.println("El ultimo digito mas repetido en cada posicion es " + digitoMasRepetido);

        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] == 0) {
                System.out.println("el digito " + i + " no termina en ningun numero");
            }
        }

        for (int i = 0; i < contadores.length; i++) {
            System.out.println("con el numero " + i + " terminan " + contadores[i] + " numeros");
        }

        int sumaContadores = 0;

        for (int i = 0; i < contadores.length; i++) {
            sumaContadores += contadores[i];
        }

        for (int i = 0; i < contadores.length; i++) {
            double porcentaje = (double) sumaContadores / contadores[i];
            System.out.printf("el numero %d se repite %d veces  y equivale a un %.02f%%%n del total\n", i, contadores[i], porcentaje);
        }
    }

}
