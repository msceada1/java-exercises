package Boletin_2;

import java.util.Scanner;

public class Ejercicio3 {

    //Declaracion de constantes valores enteros
    private static final int VALOR_M = 1000;
    private static final int VALOR_D = 500;
    private static final int VALOR_C = 100;
    private static final int VALOR_L = 50;
    private static final int VALOR_X = 10;
    private static final int VALOR_V = 5;
    private static final int VALOR_I = 1;

    //Declaracion constantes tipo string
    private static final String M = "M";
    private static final String D = "D";
    private static final String C = "C";
    private static final String L = "L";
    private static final String X = "X";
    private static final String V = "V";
    private static final String I = "I";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int suma = 0, resta = 0, valor = 0;
        String letra;

        System.out.println("cuantas letras desea introducir");
        int cantidadLetras = scanner.nextInt();

        for (int i = 0; i < cantidadLetras; i++) {
            System.out.printf("introduce la letra " + (i + 1) + " : ");
            letra = scanner.next();

            switch (letra) {
                case M -> valor = VALOR_M;
                case D -> valor = VALOR_D;
                case C -> valor = VALOR_C;
                case L -> valor = VALOR_L;
                case X -> valor = VALOR_X;
                case V -> valor = VALOR_V;
                case I -> valor = VALOR_I;
            }

            if (valor >= valor) {
                suma += valor;
            } else suma -= resta;
        }
        System.out.println("suma = " + suma);
    }
}
