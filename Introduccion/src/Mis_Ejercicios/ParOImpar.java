package Mis_Ejercicios;

import java.util.Scanner;

//Número par o impar: Pide un número al usuario y muestra si es par o impar.

public class ParOImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = scanner.nextInt();

        scanner.close();

        String parOImpar = num % 2 == 0 ? "El numero " + num + " es par" : "El numero " + num + " es impar";
        System.out.println(parOImpar);
    }
}
