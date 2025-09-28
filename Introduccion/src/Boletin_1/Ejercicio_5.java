package Boletin_1;

import utils.MiEntradaSalida;

public class Ejercicio_5 {

    /*
    Realizar un programa que solicite un número e informe de si es o no primo.
    Un número es primo si entre sus divisores sólo está él mismo y el número 1.
     */

    public static void main(String[] args) {

        //variables
        int numero = MiEntradaSalida.solicitarEnteroPositivo("introduce un numero entero positivo");
        boolean primo = true;

        //procesamiento
        if (numero == 0) {
            System.out.println("0 no es valido");
        } else if (numero == 1) {
            System.out.println("1 no es primo por definicion");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
            System.out.println("primo = " + primo);
        }
    }
}
