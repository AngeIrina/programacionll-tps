
package trabajopractico2;

public class ModificacionArrays {

    public static void main(String[] args) {
        
        // a. Declarar e inicializar un array con precios
        double[] precios = {13.5,10,22.75,30,18};
        
        // b. Mostrar los valores originales
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i+1) + ": $" + precios[i]);
        }
        
        // c. Modificar el precio de un producto específico
        precios[1] = 250.0; 
        
        // d. Mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i+1) + ": $" + precios[i]);
        }
    }
    
}
