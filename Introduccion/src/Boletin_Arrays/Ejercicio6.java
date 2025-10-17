package Boletin_Arrays;

import utils.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio6 {

    /*
    Crea un programa que compruebe si un array contiene un determinado valor. Para
    ello, puedes pedir por parámetros el tamaño del array, los elementos y luego el
    elemento a buscar, o puedes generar el array aleatorio y pedir únicamente el
    elemento a buscar
     */

    public static void main(String[] args) {

        int tamanio = MiEntradaSalida.leerEnteroPositivo("Introduce el tamaño del array");
        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            int numero = MiEntradaSalida.leerEntero("Introduce el numero en la posicion " + (i + 1));
            array[i] = numero;
        }

        System.out.println("el array es " + Arrays.toString(array));

        int elementoABuscar = MiEntradaSalida.leerEntero("Introduce el numero que deseas buscar");

        System.out.println(contieneValor(tamanio, array, elementoABuscar));

        //Para aleatorio

        System.out.println("-------------para el metodo aleatorio ------------------");

        int[] arrayAleatorio = new int[5];

        for (int i = 0; i < arrayAleatorio.length; i++) {
            int numRandom = (int) (Math.random() * 10);
            arrayAleatorio[i] = numRandom;
        }

        System.out.println("el array es " + Arrays.toString(arrayAleatorio));

        int numero2 = MiEntradaSalida.leerEntero("Introduce el numero a buscar");

        System.out.println(contieneValorAleatorio(arrayAleatorio, numero2));
    }

    /**
     * @param tamanioArray  las posiciones que tendra el array
     * @param elementos     los valores que hay dentro del array
     * @param numeroBuscado el numero que se busca en el array
     * @return si el elemento ha sido encontrado o no
     */
    private static boolean contieneValor(int tamanioArray, int[] elementos, int numeroBuscado) {

        int[] array = new int[tamanioArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = elementos[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (numeroBuscado == array[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array           el array que se analiza
     * @param elementoBuscado el elemento que se busca en el array
     * @return true si el elemento esta dentro del array o false si no esta
     */
    private static boolean contieneValorAleatorio(int[] array, int elementoBuscado) {

        for (int i = 0; i < array.length; i++) {
            if (elementoBuscado == array[i]) {
                return true;
            }
        }

        return false;
    }
}
