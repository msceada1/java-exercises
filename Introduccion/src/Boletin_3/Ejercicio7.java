package Boletin_3;

import java.util.Scanner;

public class Ejercicio7 {

    /**
     * Realizar un programa que solicite una cantidad de números que van a
     * pedirse por teclado. Una vez que solicite todos ellos debe informar de cual
     * es la media de los números. Diseñar el programa de forma que si la
     * cantidad es incorrecta vuelva a solicitarse.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("cuantos numeros desea introducir?");
        int numerosAIntroducir = scanner.nextInt();
        double numero;
        double suma = 0;

        while (numerosAIntroducir <= 0) {
            System.out.println("introduce un numero mayor que cero");
            numerosAIntroducir = scanner.nextInt();
        }

        for (int i = 0; i < numerosAIntroducir; i++) {
            System.out.printf("Introduce el numero %d: ", (i + 1));
            numero = scanner.nextDouble();

            suma += numero;
        }

        double media = suma / numerosAIntroducir;

        System.out.println("media = " + media);

        scanner.close();
    }
}
