
package trabajopractico2;

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Bucle for para pedir 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = input.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}

