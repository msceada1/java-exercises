package Boletin_3;

import java.util.Scanner;

public class Ejercicio8 {

    /*
        Realizar un programa que solicite un conjunto de números. Después de
        introducir cada número se realizará la pregunta: "¿Desea introducir más
        números (S/N)". Si la respuesta es 'S' se solicitará otro número. Cuando no
        desee introducir más números debe informar cual es el menor de los
        números introducidos.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un numero");
        int numero = scanner.nextInt();
        int numeroMenor = numero;
        String respuesta;

        do {
            do {
                System.out.println("desea introducir mas numeros (S/N)?");
                respuesta = scanner.next();
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));

            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("introduce el siguiente numero");
                numero = scanner.nextInt();
            }

            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        } while (!respuesta.equalsIgnoreCase("N"));

        System.out.println("numeroMenor = " + numeroMenor);
    }
}