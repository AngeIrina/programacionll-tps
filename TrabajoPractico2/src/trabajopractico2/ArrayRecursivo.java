
package trabajopractico2;

public class ArrayRecursivo {

    public static void main(String[] args) {
        // a. Declarar e inicializar un array con precios
        double[] precios = {100.0, 200.0, 300.0, 400.0, 500.0};

        // b. Mostrar los precios originales usando recursividad
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        // c. Modificar el precio de un producto específico (ej: posición 2)
        precios[1] = 250.0;

        // d. Mostrar los precios modificados usando recursividad
        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
    // Función recursiva para mostrar un array
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Producto " + (indice + 1) + ": $" + array[indice]);
            imprimirArrayRecursivo(array, indice + 1); // llamada recursiva
        }
    }
}
