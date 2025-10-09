package Boletin_2;

import utils.MiEntradaSalida;

public class Ejercicio2 {

    public static void main(String[] args) {

        int num = MiEntradaSalida.leerEnteroPositivo("Introduce un numero entero positivo");
        int reverso = 0;
        boolean capicua = false;
        int copia = num;

        while (num > 0) {
            int resto = num % 10;
            reverso = reverso * 10 + resto;
            num = num / 10;
        }

        if (reverso == copia) {
            capicua = true;
        }

        System.out.println("reverso = " + reverso);

        System.out.println("capicua = " + capicua);

    }
}
