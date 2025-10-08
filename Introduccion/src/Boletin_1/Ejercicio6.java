package Boletin_1;

import java.util.Scanner;

public class Ejercicio6 {

    /*
    Realizar un programa que lea el número de alumnos que hay en una clase.
    A continuación debe leer la nota de cada uno de ellos en un examen y nos
    debe informar del número de suspensos y aprobados, así como los
    porcentajes.
     */

    private static final double ALUMNOS_CLASE = 5; //constante en double para que no haya fallos en porcentajes.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //variables declaradas
        double nota;
        int suspensos = 0;
        int aprobados = 0;

        //procesamiento
        for (int i = 0; i < ALUMNOS_CLASE; i++) {
            System.out.println("introduce la nota del alumno " + (i + 1) + " entre 0 y 10");
            nota = scanner.nextFloat();
            while (nota > 10 || nota < 0) {
                System.out.println("la nota del alumno " + i + " debe estar entre 0 y 10, por favor introduzca de nuevo");
                nota = scanner.nextFloat();
                scanner.close();
            }
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("aprobados = " + aprobados);

        System.out.println("suspensos = " + suspensos);

        double porcentajeAProbados = ((double) aprobados / ALUMNOS_CLASE) * 100;
        System.out.println("porcentajeAProbados = " + porcentajeAProbados + " %");

        double porcentajeSuspensos = ((double) suspensos / ALUMNOS_CLASE) * 100;
        System.out.println("porcentajeSuspensos = " + porcentajeSuspensos + " %");
    }
}
