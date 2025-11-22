/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;

import java.util.Scanner;

public class ValidacionNota {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;
        
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("️Nota inválida. Intente nuevamente.");
            }
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
    }
    
}
