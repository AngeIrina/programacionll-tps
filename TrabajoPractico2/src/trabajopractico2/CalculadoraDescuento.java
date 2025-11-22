
package trabajopractico2;

import java.util.Scanner;

public class CalculadoraDescuento {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Ingresa el precio: ");
        double precio = input.nextDouble();
        
        System.out.println("Ingresa la categoría del producto (A, B o C): ");
        char categoria = input.next().charAt(0);
        
        double descuento = calcularDescuento(categoria);
        
        if (descuento == 0) {
            System.out.println("Categoría no válida.");
        } else {
            double montoDescuento = precio * descuento;
            double precioFinal = precio - montoDescuento;

            System.out.println("Precio original: $" + precio);
            System.out.println("Descuento aplicado: $" + montoDescuento);
            System.out.println("Precio final: $" + precioFinal);
        }
    }
      public static double calcularDescuento(char categoria) {
        categoria = Character.toUpperCase(categoria);

        switch (categoria) {
            case 'A':
                return 0.10;
            case 'B':
                return 0.15;
            case 'C':
                return 0.20;
            default:
                return 0; 
        }
    }
}

