
package trabajopractico2;

import java.util.Scanner;

public class CompraEnvio {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresá el PRECIO del producto: ");
        double precioProducto = input.nextDouble();
        
        input.nextLine(); // limpia el salto de línea pendiente
        
        System.out.println("¿Cuál es la ZONA del envío? (Nacional o Internacional) ");
        String zona = input.nextLine();
        
        System.out.println("¿Cuál es el PESO del paquete? (en KG) ");
        double peso = input.nextDouble();
        
        double total = calcularTotalCompra(precioProducto, peso, zona);
        
        System.out.println("El total de la compra es: $" + total);
        
    }
    
    public static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona inválida. Ingrese 'Nacional' o 'Internacional'.");
            return 0;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double peso, String zona){
      double costoEnvio = calcularCostoEnvio(peso, zona);
      return precioProducto + costoEnvio;
    }
}
