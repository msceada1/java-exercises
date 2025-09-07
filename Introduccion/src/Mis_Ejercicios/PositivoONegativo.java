package Mis_Ejercicios;

//Positivo, negativo o cero: Pide un número entero e indica si es positivo, negativo o cero.

import java.util.Scanner;

public class PositivoONegativo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un numero");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("el numero es negativo");
        }else System.out.println("el numero es 0");

    }
}
