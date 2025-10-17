package Boletin_Arrays;

import utils.MiEntradaSalida;

public class Ejercicio7 {

    /*
    Crea un método contieneElemento, que acepte un array de enteros y un entero a
    buscar, que realice la misma operación que el ejercicio anterior, y devuelva un valor
    booleano que indique si el array contiene el elemento o no.
     */

    public static void main(String[] args) {

        int tamanio = MiEntradaSalida.leerEnteroPositivo("Dime el tamaño del array");
        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            int numero = MiEntradaSalida.leerEntero("Introduce el valor en la posicion " + (i + 1));
            array[i] = numero;
        }

        int elementoABuscar = MiEntradaSalida.leerEntero("Que valor quieres saber si se encuentra dentro del array?");

        System.out.println(contieneElemento(array, elementoABuscar));
    }

    /**
     * @param array           el array que el usuario introduce
     * @param elementoBuscado el elemento que el usuario desea encontrar
     * @return true si esta el elemento buscado, false si no esta
     */
    private static boolean contieneElemento(int[] array, int elementoBuscado) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementoBuscado) {
                return true;
            }
        }

        return false;
    }

}
