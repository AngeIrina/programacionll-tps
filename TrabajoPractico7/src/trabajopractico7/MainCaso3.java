
package trabajopractico7;


import java.util.ArrayList;

public class MainCaso3 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 250000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 1500));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre);
            System.out.println("Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta Permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
            System.out.println("------");
        }
    }
}
