package Boletin_Arrays;

import utils.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio13 {

    /*
     Crea un programa que implemente una estructura de pila de números enteros. Una
    estructura de pila es aquella que permite almacenar elementos de la manera “último
    en entrar, primero en salir (LIFO - Last in first out)”. Crea un método main, donde
    hagas llamadas a un método apilar para añadir elementos y otro método desapilar
    para eliminarlos. Muestra el array tras cada una de las operaciones. La pila tendrá
    como máximo 10 números enteros
     */

    static final int MAX_TAMANIO = 10; //tamaño maximo de la pila
    static int contador = 0; //variable que me permitira imprimir hasta el limite del ultimo numero
    static int[] pila = new int[MAX_TAMANIO]; // array que usare para operar.

    public static void main(String[] args) {

        char respuesta = MiEntradaSalida.leerCaracterSN("Desea apilar un numero (S / N)");

        while (respuesta == 'S') {
            int numero = MiEntradaSalida.leerEntero("Introduce el numero");
            System.out.println(Arrays.toString(apilar(numero)));
            respuesta = MiEntradaSalida.leerCaracterSN("Desea introducir otro numero (S / N)?");
        }

        char respuesta2 = MiEntradaSalida.leerCaracterSN("Desea desapilar la pila (S / N)?");

        while (respuesta2 == 'S') {
            System.out.println(Arrays.toString(desapilar()));
            respuesta2 = MiEntradaSalida.leerCaracterSN("Desea seguir desapilando (S / N)?");
        }
    }

    /**
     * Metodo que agrega un numero a la pila si hay hueco disponible utilizando la pila estatica (array) y el contador
     * estatico definido debajo de la clase.
     *
     * @param numero el numero que se desea apilar
     * @return una copia de la pila hasta el limite (que me lo indica el contador).
     */
    private static int[] apilar(int numero) {

        if (contador < pila.length) {
            pila[contador++] = numero; //guardo en la posicion del contador el numero introducido por parametros
        } else {
            System.out.println("La pila esta llena, no puedo apilar el numero");
        }

        return Arrays.copyOf(pila, contador);
    }

    /**
     * Metodo que desapila los numeros de la pila, va desapilando los numeros hasta que llega al limite
     * donde indica que la pila esta vacia y no desapila.
     * El contador va decrementandose y asi se desapila la pila.
     *
     * @return una copia de la pila hasta el limite, contador
     */
    private static int[] desapilar() {
        if (contador > 0) {
            pila[contador--] = 0;

            System.out.println("Elemento desapilado correctamente");
        } else {
            System.out.println("La pila esta vacia");
        }

        return Arrays.copyOf(pila, contador);
    }
}
