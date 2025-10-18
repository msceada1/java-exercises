package Mis_Ejercicios;

public class RepasoEjercicio4Arrays {

    static final int CANTIDAD_ALEATORIOS = 6000;

    /**
     * El metodo media suma todos los valores que hay dentro de las posiciones del array y divide entre la cantidad
     * de numeros aleatorios que se genera.
     *
     * @param array el array de numeros aleatorios
     * @return la media de todos los valores del array
     */
    private static double media(int[] array) {

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return (double) suma / CANTIDAD_ALEATORIOS;
    }

    /**
     * El metodo digito final permite saber cual es el digito en el que mas numeros terminan, las veces que se repiten
     * los digitos finales
     *
     * @param array el array de numeros aleatorios
     */
    private static void digitoFinal(int[] array) {

        int[] contadores = new int[10]; //creo un array de contadores que sirve para mas adelante

        for (int i = 0; i < array.length; i++) {
            int ultimoDigito = array[i] % 10;
            contadores[ultimoDigito]++; // a contadores le paso el ultimo digito como referencia y hago que se incremente la posicion del contador en base al ultimo digito extraido
        }

        int numeroMayor = contadores[0];
        int posicionMayor = 0;

        /*
        comparo el valor de las posiciones. lo voy cambiando en base a cual es mayor. y para imprimir el digito en el que mas numeros terminan,
        le igualo la i
         */
        for (int i = 0; i < contadores.length; i++) {
            if (numeroMayor < contadores[i]) {
                numeroMayor = contadores[i];
                posicionMayor = i;
            }
        }

        System.out.println("el digito en el que mas numeros terminan es " + posicionMayor);

        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] == 0) {
                System.out.println("con el digito " + contadores[i] + " no termina ningun numero");
            }
        }

        int sumaContadores = 0;

        for (int i = 0; i < contadores.length; i++) {
            sumaContadores += contadores[i];
        }


        for (int i = 0; i < contadores.length; i++) {
            double porcentaje = (double) sumaContadores / contadores[i];
            System.out.printf("el numero %d se ha repetido %d veces, lo que equivale a un %.02f%%%n del total\n ", i, contadores[i], porcentaje);
        }
    }

    public static void main(String[] args) {

        int[] arrayAleatorios = new int[CANTIDAD_ALEATORIOS];

        for (int i = 0; i < arrayAleatorios.length; i++) {
            arrayAleatorios[i] = (int) (Math.random() * 101);
        }

        System.out.printf("la media de los valores del array es %.02f\n", media(arrayAleatorios));

        digitoFinal(arrayAleatorios);
    }
}
