package Mis_Ejercicios;

//Múltiplo de 3 y de 5: Pide un número e indica si es múltiplo de 3, de 5, de ambos o de ninguno.

import java.util.Scanner;

public class Multiplo3Y5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0){
            System.out.println("El numero introducido es múltiplo de 3 y 5");
        } else if (numero % 5 == 0) {
            System.out.println("el numero introducido es múltiplo de 5");
        } else if (numero % 3 == 0) {
            System.out.println("el numero introducido es multiplo de 3");
        }else System.out.println("el numero introducido no es multiplo ni de 3 ni de 5");
    }
}
