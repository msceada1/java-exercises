package Mis_Ejercicios;

import utils.MiEntradaSalida;

public class Ejercicio2 {

    public static void main(String[] args) {

        //declaracion de variables
        int numero = MiEntradaSalida.leerEntero("Introduzca un numero, negativo para terminar");
        int numeroMayor = numero, numeroMenor = numero;
        int contadorPositivos = 0, contadoPares = 0, contadorImpares = 0;
        int suma = numero;
        int ultimoPositivo = 0;
        boolean primo = false;

        //procesamiento
        while (numero >= 0) {
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
            if (numero % 2 == 0) {
                contadoPares++;
            } else contadorImpares++;
            contadorPositivos++;
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("el numero " + numero + " es multiplo de 3 y 5");
            } else if (numero % 5 == 0) {
                System.out.println("el numero " + numero + " es multiplo de 5");
            }
            if (numero % 3 == 0) {
                System.out.println("el numero " + numero + " es multiplo de 3");
            }
            ultimoPositivo = numero;
            numero = MiEntradaSalida.leerEntero("Introduzca un numero, negativo para terminar");
            if (numero > 0) {
                suma += numero;
            }
        }

        //resumen
        System.out.println("numeroMayor = " + numeroMayor);
        System.out.println("numeroMenor = " + numeroMenor);
        System.out.println("contadorPositivos = " + contadorPositivos);
        System.out.println("contadoPares = " + contadoPares);
        System.out.println("contadorImpares = " + contadorImpares);
        System.out.println("suma = " + suma);
        System.out.println("media = " + (double) suma / contadorPositivos);
        System.out.println("ultimoPositivo = " + ultimoPositivo);

        if (ultimoPositivo == 0) {
            System.out.println("el numero " + ultimoPositivo + " no es primo por definicion");
        } else if (ultimoPositivo == 1) {
            System.out.println("el numero " + ultimoPositivo + " no es primo por definicion");
        } else {
            for (int i = 2; i <= ultimoPositivo / 2; i++) {
                if (ultimoPositivo % i != 0) {
                    primo = true;
                }
            }
            System.out.println("primo = " + primo);
        }
    }
}
