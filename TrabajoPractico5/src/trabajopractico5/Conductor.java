
package trabajopractico5;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
