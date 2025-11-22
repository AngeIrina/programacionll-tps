
package trabajopractico2;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       System.out.print("Ingresa el primer número entero: ");
        int num1 = input.nextInt();
        
       System.out.print("Ingresa el segundo número entero: ");
        int num2 = input.nextInt();      
        
       System.out.print("Ingresa el segundo número entero: ");
        int num3 = input.nextInt();
        
        int numMayor;

        if (num1 >= num2 && num1 >= num3) {
            numMayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            numMayor = num2;
        } else {
            numMayor = num3;
        }
        
        System.out.println("El número mayor es: " + numMayor);
    }
    
}
