package Boletin_Refuerzo;

import utils.MiEntradaSalida;

public class Ejercicio5 {

    public static void main(String[] args) {

        double gradosCeslsius = MiEntradaSalida.leerDoublePositivo("Introduce los grados");
        double gradosFarenheit = (gradosCeslsius - 32) * ((double) 5 / 9);

        System.out.println("gradosFarenheit = " + gradosFarenheit);
    }
}
