package trabajopractico8;

import java.util.Scanner;

public class ConvertirCadenaNumero {

    public static void convertir() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);

            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: formato no válido.");
        }
    }
}
