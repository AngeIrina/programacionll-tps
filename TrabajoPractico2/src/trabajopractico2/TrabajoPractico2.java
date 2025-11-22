
package trabajopractico2;

import java.util.Scanner;

public class TrabajoPractico2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("¿ES BISIESTO?\nIngresa el año: ");
        int anio = input.nextInt();
       
       String resultado = (esBisiesto(anio) == 1) 
                ? anio + " es bisiesto." 
                : anio + " no es bisiesto.";

        System.out.println(resultado);
    }
    
    static int esBisiesto(int anio) {
    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
        return 1; // Es bisiesto
    } else {
        return 0; // No es bisiesto
    }
}
}
