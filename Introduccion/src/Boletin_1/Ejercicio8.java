package Boletin_1;

import java.util.Scanner;

public class Ejercicio8 {

    /*
    Realizar un programa que calcule las soluciones de una ecuación de
    segundo grado. Deben pedirse los tres coeficientes A, B, C e informar de si
    la ecuación tiene dos soluciones, una solución, o ninguna solución.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el coeficiente A");
        double coeficienteA = scanner.nextDouble();

        System.out.println("introduce el coeficiente B");
        double coeficienteB = scanner.nextDouble();

        System.out.println("introduce el coeficiente C");
        double coeficienteC = scanner.nextDouble();

        scanner.close();

        double intoRaiz = Math.pow((coeficienteB), 2) - 4 * coeficienteA * coeficienteC;

        double solucion1 = (-coeficienteB + Math.sqrt(intoRaiz)) / (2 * coeficienteA);
        double solucion2 = (-coeficienteB - Math.sqrt(intoRaiz)) / (2 * coeficienteA);
        double solucion3 = -coeficienteC / coeficienteB;

        if (coeficienteA == 0 && coeficienteB == 0) {
            System.out.println("error de division por 0");
        } else if (coeficienteA == 0) {
            System.out.println("la ecuacion tiene una solución : " + solucion3);
        } else if (coeficienteC == 0) {
            System.out.println("Cualquier numero dividido entre 0 será infinito");
        } else if (intoRaiz < 0) {
            System.out.println("la ecuacion no tiene solucion");
        } else if (solucion1 == solucion2) {
            System.out.println("la ecuacion tiene una solucion : " + solucion1);
        } else {
            System.out.println("la ecuacion tiene dos soluciones : " + solucion1 + " y " + solucion2);
        }
    }
}
