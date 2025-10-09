package Boletin_1;

import utils.MiEntradaSalida;

public class Ejercicio7 {

    /*
    Realizar un programa que solicite dos números enteros mayores que 0, que
    calcule el máximo común divisor entre ellos mediante el algoritmo de
    Euclides y que muestre por pantalla el resultado.
     */

    public static void main(String[] args) {

        //declaracion variables
        int num1 = MiEntradaSalida.leerEnteroPositivo("Introduce un primer numero mayor que 0");
        int num2 = MiEntradaSalida.leerEnteroPositivo("Introduzca un segundo numero mayor que 0");
        int resto = num1 % num2;


        //procesamiento
        while (resto != 0) {
            num1 = num2;
            num2 = resto;
            resto = num1 % num2;
        }
        System.out.println("el m.c.d es : " + num2);
    }
}
