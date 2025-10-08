package Boletin_1;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Se desea realizar un programa que implemente un juego que consiste en
    acertar un número secreto. El ordenador deberá generar aleatoriamente un
    número secreto entre 1 y 100 y el jugador tratará de acertarlo.
    Cada vez que el jugador introduzca un número, se comprobará si es el
    número secreto, en cuyo caso termina el juego. Si no lo es, se informará
    que el número introducido es mayor o menor que el número secreto. El
    programa termina cuando acierta el número (gana) o cuando agota el
    número de intentos ( en nuestro caso 5) sin acertar el número , en cuyo
    caso pierde.
    Si es número no estuviese en el rango de 1-100, debe mostrar un mensaje
    “El numero debe estar entre 1 y 100” y también debe contarse como un
    fallo.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //declaracion variables
        int numRandom = (int) (Math.random() * 101);
        int vidas = 5;
        int numeroIntroducido;

        //procesamiento
        System.out.println("Introduce un numero de 0 a 100");
        numeroIntroducido = scanner.nextInt();

        while (numeroIntroducido < 0 || numeroIntroducido > 100 || numeroIntroducido != numRandom) {
            if (numeroIntroducido < 0 || numeroIntroducido > 100) {
                System.out.println("el numero debe estar entre 0 y 100 " + " te quedan " + vidas + " vidas");
                numeroIntroducido = scanner.nextInt();
                vidas--;
            } else {
                System.out.println(" has fallado vuelve a intentarlo, " + " te quedan " + vidas + " vidas");
                numeroIntroducido = scanner.nextInt();
                vidas--;
            }
            if (vidas == 0) {
                break;
            }
        }
        if (vidas == 0) {
            System.out.println("perdiste");
        } else {
            System.out.println("ganaste");
        }

        scanner.close();

        /*

        int numero = 11;
        int numero2 = 6;
        int resultado = generaAleatrio(numero, numero2);
        System.out.println("resultado = " + resultado);

        */
    }

    /*
    public static int generaAleatrio(int numMax, int numMin) {

        int numAleatorio = (int) (Math.random() * (numMax - numMin) + numMin);

        return numAleatorio;
    }
    */

}
