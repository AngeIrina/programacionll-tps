package trabajopractico4;

public class Empleado {

    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // Constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor 2: recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // asigna id automático incrementando contador
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // salario por defecto
    }

    // Métodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentaje) { // con porcentaje
        if (porcentaje > 0) {
            this.salario += this.salario * porcentaje / 100;
        }
    }

    public void actualizarSalario(int cantidad) { // con monto fijo
        if (cantidad > 0) {
            this.salario += cantidad;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado {"
                + "ID=" + id
                + ", Nombre='" + nombre + '\''
                + ", Puesto='" + puesto + '\''
                + ", Salario=" + salario
                + '}';
    }
    

    // Método estático mostrarTotalEmpleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }
}
