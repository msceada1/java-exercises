package Boletin_Refuerzo;

import utils.MiEntradaSalida;

public class Ejercicio_1 {
    /*
    Crea un programa que recoja de teclado dos números y los sume
     */

    public static void main(String[] args) {

        //definicion de variables
        int numero_1 = MiEntradaSalida.solicitarEntero("Introduce un numero");
        int numero_2 = MiEntradaSalida.solicitarEntero("Introduce otro numero");
        int resultado = numero_1 + numero_2;

        System.out.println("resultado = " + resultado);
    }
}
