/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;

public class DatosUsuario {
    
    public static void main(String[] args) {
      Scanner datos = new Scanner(System.in);
      String nombre;
      int edad;
      
        System.out.print("Escribí tu nombre: ");
        nombre = datos.nextLine();
        
        System.out.print("Ingresá tu edad: ");
        edad = datos.nextInt();
        
        System.out.println("Tu nombre es: " + nombre + " y tienes " + edad + " años.");
    }
} 
