package Mis_Ejercicios;

//Nota aprobada o suspendida: Pide una nota (0–10) e indica si es "aprobado" (≥5) o "suspenso".

import java.util.Scanner;

public class AprobadoOSuspenso {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una nota de 0 a 10");
        double nota = scanner.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("la nota debe estar entre 0 y 10");
            nota = scanner.nextDouble();
        }

        String resultado = nota >= 5 ? "Aprobado" : "Suspenso";
        System.out.println("resultado = " + resultado);
    }
}
