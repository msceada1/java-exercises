package Boletin_3;

public class Ejercicio1 {

    public static void main(String[] args) {

        int contadorMultiplos7 = 0, contadorMultiplos13 = 0, contadorMultiplos7Y13 = 0;

        for (int i = 1; i <= 100; i++) {
            if (7 % i == 0) {
                contadorMultiplos7++;
            }
            if (13 % i == 0) {
                contadorMultiplos13++;
            }
            if (7 % i == 0 && 13 % i == 0) {
                contadorMultiplos7Y13++;
            }

        }
        System.out.println("contadorMultiplos7 = " + contadorMultiplos7);

        System.out.println("contadorMultiplos13 = " + contadorMultiplos13);

        System.out.println("contadorMultiplos7Y13 = " + contadorMultiplos7Y13);
    }
}
