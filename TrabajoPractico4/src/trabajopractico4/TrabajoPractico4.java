package trabajopractico4;

public class TrabajoPractico4 {

    public static void main(String[] args) {
        // Crear empleados con ambos constructores
        Empleado emp1 = new Empleado(1, "Ana López", "Gerente", 100000);
        Empleado emp2 = new Empleado("Carlos Pérez", "Analista"); // id automático y salario por defecto
        Empleado emp3 = new Empleado("María Gómez", "Desarrolladora"); // id automático

        // Aplicar métodos actualizarSalario()
        emp1.actualizarSalario(10.0);  // Aumenta 10% a Ana
        emp2.actualizarSalario(5000);  // Aumenta $5000 a Carlos
        emp3.actualizarSalario(15.0);  // Aumenta 15% a María

        // Imprimir información con toString()
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}


