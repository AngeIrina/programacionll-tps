
package trabajopractico5;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;       // unidireccional
    private Profesional profesional; // unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
}
