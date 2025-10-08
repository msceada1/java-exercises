package Boletin_3;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Realizar un programa que lea un número estrictamente positivo N y
    muestre la suma de los N primeros números. Diseña el programa de forma
    que si N es incorrecto vuelva a solicitarse.
     */

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = scanner.nextInt();
        int comprobar = 2

        while (comprobar <= num / 2 && num % comprobar != 0) {
            comprobar++;
        }
        if (num % comprobar == 0){
        sout ln ("el primer divisor de:  " + numero " es " + comprobar)
        } else {
        sout ln ("el numero %d es primo", numero)
        }

         */

        Scanner scanner = new Scanner(System.in);
        int numero;
        int num1 = 0;

        do {
            System.out.println("introduce un numero positivo");
            numero = scanner.nextInt();
        } while (numero < 0);

        for (int i = 0; i <= numero; i++) {
            num1 += i;
        }
        System.out.println("numero = " + num1);
        scanner.close();


    }
}
