package Boletin_2;

import utils.MiEntradaSalida;

public class Ejercicio1 {

    /*
    Realizar un programa que, dado un número introducido por el usuario, calcule su
    número a la inversa. Es decir, dada la entrada: 123456, el programa debe devolver
    654321.
     */

    public static void main(String[] args) {

        int num = MiEntradaSalida.leerEnteroPositivo("Introduzca un numero entero positivo");
        int reverso = 0;

        while (num > 0) {
            int resto = num % 10;
            reverso = (reverso * 10) + resto;
            num /= 10;
        }

        System.out.println("reverso = " + reverso);

    }
}
