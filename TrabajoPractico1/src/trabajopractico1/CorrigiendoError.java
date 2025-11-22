/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;

public class CorrigiendoError {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        // String nombre = scanner.nextInt(); // ERROR
        String nombre = scanner.nextLine(); // CORREGIDO
        System.out.println("Hola, " + nombre);
    }
    
}
