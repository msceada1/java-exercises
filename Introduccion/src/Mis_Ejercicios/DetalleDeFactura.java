package Mis_Ejercicios;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //entrada de datos
        System.out.println("Ingrese el nombe de la factura");
        String nombreFactura = entrada.nextLine();

        System.out.println("Ingrese el precio del producto 1");
        double precioProducto1 = entrada.nextDouble();

        System.out.println("Ingrese el precio del producto 2");
        double precioProducto2 = entrada.nextDouble();

        entrada.close();
        
        //procesamiento
        double sumaPrecios = precioProducto1 + precioProducto2;
        double totalConImpuesto = (sumaPrecios * 1.19);
        double montoTotal = sumaPrecios + totalConImpuesto;
        String cadena = "La factura " + nombreFactura + " tiene un total bruto de " + sumaPrecios + " con un impuesto de " + totalConImpuesto + " y un monto despues del impuesto  de " + montoTotal;
        System.out.println(cadena);

    }
}
