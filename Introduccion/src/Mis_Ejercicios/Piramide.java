package Mis_Ejercicios;

public class Piramide {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println(" ");

            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 1 + i; k++) {
                System.out.print("* ");

                //este comentario debe aprecer en casa
            }
        }
    }
}
