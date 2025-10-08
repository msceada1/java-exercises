package Boletin_3;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    Realizar un programa que solicite una cantidad de números que van a
    introducirse por teclado. Después, para cada uno de ellos que indique si el
    número es par o impar. Si la cantidad de números introducida es 0 o
    negativa volverá a solicitarse el dato.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("cuantos numeros deseas introducir");
        int numerosAIntroducir = scanner.nextInt();
        int numero;

        for (int i = 0; i < numerosAIntroducir; i++) {
            do {
                System.out.println("introduce el numero " + (i + 1));
                numero = scanner.nextInt();
            } while (numero <= 0);

            if (numero % 2 == 0) {
                System.out.println("el numero " + numero + " es par");
            } else {
                System.out.println("el numero " + numero + " es impar");
            }
        }
    }
}
