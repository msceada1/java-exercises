package Boletin_3;

import java.util.Scanner;

public class Ejercicio5 {

    /*
     Realizar un programa que solicite números hasta que se introduzca un
     número negativo. Cuando termine informará de cuantos números positivos
     se han introducido. En este programa el número 0 se considera positivo.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;

        System.out.println("introduce numeros, negativo para terminar el programa");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            numero = scanner.nextInt();
            contadorPositivos++;
        }
        System.out.println("contadorPositivos = " + contadorPositivos);

        /*

        do {
            System.out.println("introduce una lista de numeros. negativo para terminar");
            numero = scanner.nextInt();
            if (numero > 0) {
                contadorPositivos++;
            }
        } while (numero >= 0);

        System.out.println("contadorPositivos = " + contadorPositivos);
        scanner.close();
        */
    }
}
