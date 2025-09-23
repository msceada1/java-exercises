package Boletin_3;

import java.util.Scanner;

public class Ejercicio_3 {

    /*
    Realizar un programa que solicite una cantidad de números que van a
    introducirse por teclado. Después, para cada uno de ellos que indique si el
    número es par o impar. Si la cantidad de números introducida es 0 o
    negativa volverá a solicitarse el dato.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        do {
            System.out.println("Introduce 5 numeros");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();
            num4 = scanner.nextInt();
            num5 = scanner.nextInt();
        } while (num1 <= 0 || num2 <= 0 || num3 <= 0 || num4 <= 0 || num5 <= 0);

        if (num1 % 2 == 0) {
            System.out.println("el numero " + num1 + " es par");
        } else {
            System.out.println("el numero " + num1 + " es impar");
        }

        if (num2 % 2 == 0) {
            System.out.println("el numero " + num2 + " es par");
        } else {
            System.out.println("el numero " + num2 + " es impar");
        }

        if (num3 % 2 == 0) {
            System.out.println("el numero " + num3 + " es par");
        } else {
            System.out.println("el numero " + num3 + " es impar");
        }

        if (num4 % 2 == 0) {
            System.out.println("el numero " + num4 + " es par");
        } else {
            System.out.println("el numero " + num4 + " es impar");
        }

        if (num5 % 2 == 0) {
            System.out.println("el numero " + num5 + " es par");
        } else {
            System.out.println("el numero " + num5 + " es impar");
        }
        scanner.close();
    }
}
