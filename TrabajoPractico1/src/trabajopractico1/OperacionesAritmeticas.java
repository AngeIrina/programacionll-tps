/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
       Scanner numEntero = new Scanner(System.in);
       int num1, num2;
       
        System.out.print("Ingresá el primer número entero: ");
        num1 = numEntero.nextInt();
        
        System.out.print("Ingresá el segundo número entero: ");
        num2 = numEntero.nextInt();
        
        System.out.println("Resultados de las Operaciones:");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
      
    }
    
}
