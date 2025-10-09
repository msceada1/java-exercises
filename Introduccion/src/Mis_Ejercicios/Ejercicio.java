package Mis_Ejercicios;

import utils.MiEntradaSalida;

public class Ejercicio {

    public static void main(String[] args) {

        int numero = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce un numero mayor que cero");
        int acumulador = 0;
        int acumulaPares = 0;
        int acumulaImpares = 0;

        for (int i = 1; i <= numero; i++) {
            acumulador += i;
            System.out.printf(i + " + ");
            if (i % 2 == 0) {
                acumulaPares += i;
            } else {
                acumulaImpares += i;
            }
        }

        System.out.println("\n numero = " + numero);

        System.out.println("acumulador = " + acumulador);

        System.out.println("acumulaPares = " + acumulaPares);

        System.out.println("acumulaImpares = " + acumulaImpares);

        double media = (double) acumulador / numero;
        System.out.println("media = " + media);

        if (acumulador % 2 == 0) {
            System.out.println("la suma total es par");
        } else {
            System.out.println("La suma total es impar");
        }
    }
}
