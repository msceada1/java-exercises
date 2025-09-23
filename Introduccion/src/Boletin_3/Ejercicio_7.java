package Boletin_3;

import java.util.Scanner;

public class Ejercicio_7 {

    /*
    Realizar un programa que solicite una cantidad de números que van a
    pedirse por teclado. Una vez que solicite todos ellos debe informar de cual
    es la media de los números. Diseñar el programa de forma que si la
    cantidad es incorrecta vuelva a solicitarse.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce 5 numeros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        double media = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("media = " + media);
    }
}
