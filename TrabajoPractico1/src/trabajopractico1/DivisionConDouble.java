/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;
import java.util.Locale;

public class DivisionConDouble {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       input.useLocale(Locale.US); // fuerza el uso del punto decimal

        System.out.print("Ingresa el primer número decimal: ");
        double num1 = input.nextDouble();

        System.out.print("Ingresa el segundo número decimal: ");
        double num2 = input.nextDouble();

        double resultado = num1 / num2; // división con decimales
        System.out.println("Resultado de la división: " + resultado);
    }
    
}
