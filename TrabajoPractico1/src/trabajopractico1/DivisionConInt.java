/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;

public class DivisionConInt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = input.nextInt();

        int resultado = num1 / num2; // división entera
        System.out.println("Resultado de la división: " + resultado);
    }
    
}
