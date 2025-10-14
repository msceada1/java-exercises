package Boletin_Arrays;

import utils.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio3 {

    /*
     Crea un programa que pregunte cuántos elementos tendremos en un array de
    enteros. Posteriormente se preguntarán tantos números como haya indicado el
    usuario. Posteriormente, mostraremos por pantalla el mayor, el menor y la media. Si
    el número mayor o menor están repetidos, deberá indicarse cuántas veces se repite.
     */

    public static void main(String[] args) {

        int cantidad = MiEntradaSalida.leerEnteroPositivo("Cuantos numeros deseas introducir en el array?");
        int[] array = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            array[i] = MiEntradaSalida.leerEntero("Introduce el numero en la posicion " + (i + 1) + " :");
        }

        System.out.println("El array introducido es " + Arrays.toString(array));
        System.out.println(numeroMayor(array));
        System.out.println(numeroMenor(array));
        System.out.println("La media es " + media(array, cantidad));
    }

    /**
     * @param array array recibido por parametros para comprobar
     * @return el numero mayor que contiene el array y las veces que se repite
     */
    private static String numeroMayor(int[] array) {

        int numMayor = array[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > numMayor) {
                numMayor = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numMayor) {
                contador++;
            }
        }

        return "El numero mayor es " + numMayor + " y se repite " + contador + " veces";
    }

    /**
     * @param array el array recibido por parametros con el que se trabaja
     * @return el numero mas pequeño que contiene el array y las veces que se repite
     */
    private static String numeroMenor(int[] array) {

        int numMenor = array[0];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                numMenor = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (numMenor == array[i]) {
                contador++;
            }
        }

        return "El numero menor es " + numMenor + " y se repite " + contador + " veces";
    }

    /**
     * @param array    el array con el que se trabaja
     * @param cantidad la cantidad de elementos que el usuario introduce
     * @return la media de los elementos del array.
     */
    private static double media(int[] array, int cantidad) {

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        double media = (double) suma / cantidad;

        return media;
    }
}
