package Boletin_2;

import utils.MiEntradaSalida;

public class Ejercicio_1 {

    /*
    Realizar un programa que, dado un número introducido por el usuario, calcule su
    número a la inversa. Es decir, dada la entrada: 123456, el programa debe devolver
    654321.
     */

    public static void main(String[] args) {

        int numero = MiEntradaSalida.solicitarEnteroPositivo("introduce un numero");
        int reverso = 0;
        int resto;

        while (numero > 0) {
            resto = numero % 10;
            reverso = reverso * 10 + resto;
            numero = numero / 10;
        }

        System.out.println("reverso = " + reverso);
    }
}
