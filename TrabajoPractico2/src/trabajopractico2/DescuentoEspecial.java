
package trabajopractico2;

import java.util.Scanner;

public class DescuentoEspecial {
    
    static double DESCUENTO = 0.10; 
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial( double precio ) {
        double descuentoAplicado = precio * DESCUENTO; 
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}

