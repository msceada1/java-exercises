package Mis_Ejercicios;

import java.util.Scanner;

//Pedir un numero y mostrar la tabla de multiplicar del dos hasta el numero introducido

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la tabla de multiplicar del 2");

        System.out.println("¿hasta que numero quieres que se muestre la tabla del 2?");
        int numero = scanner.nextInt();

        scanner.close();

        for (int i = 0 ; i <= numero ; i++){
            System.out.println(2 * i);
        }
    }
}
