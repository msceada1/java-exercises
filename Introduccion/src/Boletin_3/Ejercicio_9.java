package Boletin_3;

import java.util.Scanner;

public class Ejercicio_9 {

    /*
    Realizar un programa que lea un número entero positivo y averigüe si es
    perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
    excepto él mismo. Diseñar el programa de forma que si algún dato es
    incorrecto vuelva a solicitarse.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean perfecto = false;
        int numero;
        int suma = 0;

        do {
            System.out.println("introduce un numero positivo");
            numero = scanner.nextInt();
        } while (numero < 0);

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (suma == numero){
            perfecto = true;
        }
        System.out.println("perfecto = " + perfecto);
    }
}
