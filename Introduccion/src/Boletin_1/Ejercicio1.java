package Boletin_1;

import utils.MiEntradaSalida;

public class Ejercicio1 {

    /**
     * Realizar un programa que solicite 3 números cualesquiera y los muestre por
     * pantalla ordenados de menor a mayor.
     */

    public static void main(String[] args) {

        //introduccion de datos
        int num1 = MiEntradaSalida.leerEntero("Introduce el numero 1");
        int num2 = MiEntradaSalida.leerEntero("Introduce el numero 2");
        int num3 = MiEntradaSalida.leerEntero("Introduce el numero 3");

        //procesamiento
        if (num1 < num2 && num2 < num3) {
            System.out.println(num1 + " < " + num2 + " < " + num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.println(num1 + " < " + num3 + " < " + num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.println(num2 + " < " + num1 + " < " + num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.println(num2 + " < " + num3 + " < " + num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.println(num3 + " < " + num1 + " < " + num2);
        } else {
            System.out.println(num3 + " < " + num2 + " < " + num1);
        }
    }
}
