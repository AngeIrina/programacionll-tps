
package trabajopractico5;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;         // agregación
    private Conductor conductor; // bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
    }
}
