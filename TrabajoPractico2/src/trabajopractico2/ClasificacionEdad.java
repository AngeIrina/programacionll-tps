
package trabajopractico2;

import java.util.Scanner;

public class ClasificacionEdad {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Ingresa tu edad: ");
        int edad = input.nextInt();
        
        String etapa;

        if (edad < 12) {
            etapa = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapa = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        }
        
        System.out.println("Eres un " + etapa);

    }
    
}
