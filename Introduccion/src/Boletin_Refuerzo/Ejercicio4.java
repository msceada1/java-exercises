package Boletin_Refuerzo;

public class Ejercicio4 {

    /**
     * Crea un método llamado "tirarDado", que admita un número que identifica el número de
     * caras que tiene dicho dado, y que emule una tirada de dicho dado, devolviendo un
     * entero aleatorio desde 1 hasta dicho número
     */

    /**
     * Metodo que simula la tirada de un dado
     *
     * @param carasDado Numero de caras que tiene el dado
     * @return Devuelve un entero aleatorio entre uno y el limite de las caras del dado.
     */

    public static int tirarDado(int carasDado) {
        int tirada = (int) (Math.random() * carasDado + 1);
        return tirada;
    }

    public static void main(String[] args) {
        int resultado = tirarDado(6);
        System.out.println("resultado = " + resultado);
    }
}
