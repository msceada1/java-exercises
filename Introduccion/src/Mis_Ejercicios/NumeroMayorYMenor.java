package Mis_Ejercicios;

import java.util.Scanner;

//Mayor de dos números: Pide dos números y muestra cuál es mayor (o si son iguales).

public class NumeroMayorYMenor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el segundo numero");
        double num2 = scanner.nextDouble();

        scanner.close();

        if (num1 > num2) {
            System.out.println("EL numero " + num1 + " es el numero mayor");
        } else if (num2 > num1) {
            System.out.println("EL numero " + num2 + " es el numero mayor");
        } else {
            System.out.println("los numero son iguales");
        }
    }


}
