package Boletin_3;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        String password;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce una contraseña de mínimo 8 caracteres");
            password = scanner.next();

            if (password.length() < 8) {
                System.out.println("Contraseña invalida. Mínimo 8 caracteres.");
            }
        } while (password.length() < 8);

        System.out.println("Su contaseña es " + password);

        scanner.close();
    }
}
