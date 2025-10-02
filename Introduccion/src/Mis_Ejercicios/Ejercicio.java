package Mis_Ejercicios;

import utils.MiEntradaSalida;

public class Ejercicio {

    public static void main(String[] args) {

        int resultado;
        int resultado2;
        int suma = 0;
        int suma2 = 0;
        int numero = MiEntradaSalida.solicitarEnteroEnRango("introduce un numero entre 0 y 10", 1, 10);

        for (int i = 1; i <= 12; i++) {
            resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);

            suma += resultado;
        }
        System.out.println("suma = " + suma);

        int promedio = suma / 11;
        System.out.println("promedio = " + promedio);

        System.out.println("------------------------");

        for (int i = 12; i >= 1; i--) {
            resultado2 = numero * i;

            System.out.println(numero + " * " + i + " = " + resultado2);
            suma2 += resultado2;
        }

        System.out.println("suma2 = " + suma2);

        int promedio2 = suma2 / 11;
        System.out.println("promedio2 = " + promedio2);
    }
}
