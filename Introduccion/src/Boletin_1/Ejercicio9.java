package Boletin_1;

public class Ejercicio9 {

    //Realizar un programa que muestre todas las tablas de multiplicar (del 1 al 10)

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println();
            System.out.println("tabla de " + i);

            for (int j = 0; j <= 10; j++) {
                System.out.println(j + " * " + i + " = " + j * i);
            }
        }
    }
}
