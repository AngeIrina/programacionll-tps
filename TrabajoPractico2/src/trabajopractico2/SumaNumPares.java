
package trabajopractico2;

import java.util.Scanner;

public class SumaNumPares {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int numero;
        int sumaPares = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();

        // Ciclo while: se repite mientras el número no sea 0
        while (numero != 0) {
            if (numero % 2 == 0) { // si el número es par
                sumaPares += numero; // lo sumamos
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
    }
    
}
