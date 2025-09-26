
package trabajopractico5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
