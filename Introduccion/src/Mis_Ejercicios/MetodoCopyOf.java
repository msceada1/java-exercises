package Mis_Ejercicios;

import java.util.Arrays;

public class MetodoCopyOf {

    private static void copiaConArrayCopyOf() {

        int[] arrayOriginal = {10, 20, 0, 40, 50, 0, 70, 0, 90, 100};

        // 1. Array temporal, del mismo tamaño, para el proceso de filtrado.
        int[] arrayTemporal = new int[arrayOriginal.length];
        int indiceTemporal = 0;

        // 2. Filtrado: Mover solo los NO-ceros al array temporal
        for (int i = 0; i < arrayOriginal.length; i++) {
            // Se usa arrayOriginal[i] para acceder al elemento por su índice.
            if (arrayOriginal[i] != 0) {
                // arrayOriginal[i] es el "elemento" válido.
                arrayTemporal[indiceTemporal] = arrayOriginal[i];
                indiceTemporal++;
            }
        }

        // 3. Usar Arrays.copyOf() para copiar SOLO los elementos válidos (hasta 'indiceTemporal')
        // y crear el array final con el tamaño exacto.
        int[] arrayFinalSinCeros = Arrays.copyOf(arrayTemporal, indiceTemporal);

        System.out.println("Array Original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array Final: " + Arrays.toString(arrayFinalSinCeros));
        // Array Final: [10, 20, 40, 50, 70, 90, 100]
    }


    private static void copiaSinCerosClasico() {
        int[] arrayOriginal = {10, 20, 30, 40, 50, 60, 70, 0, 0, 0};

        // PASO 1: Contar cuántos elementos válidos tenemos (no ceros)
        int elementosValidos = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            // Si el valor en la posición 'i' no es 0
            if (arrayOriginal[i] != 0) {
                elementosValidos++; // Aumenta el contador
            }
        }

        // PASO 2: Crear y copiar al nuevo array
        int[] arrayCopiado = new int[elementosValidos];
        int indiceNuevo = 0;

        for (int i = 0; i < arrayOriginal.length; i++) {

            // Accede al elemento del array original por su índice 'i'
            if (arrayOriginal[i] != 0) {

                // Copia el valor (arrayOriginal[i]) a la posición actual (indiceNuevo)
                // del array de destino (arrayCopiado).
                arrayCopiado[indiceNuevo] = arrayOriginal[i];

                // Avanza el índice para la próxima copia.
                indiceNuevo++;
            }
        }

        System.out.println("Array Copiado (tamaño " + arrayCopiado.length + "): " + Arrays.toString(arrayCopiado));
        // Array Copiado (tamaño 7): [10, 20, 30, 40, 50, 60, 70]
    }

    public static void main(String[] args) {
        copiaConArrayCopyOf();
        copiaSinCerosClasico();
    }
}
