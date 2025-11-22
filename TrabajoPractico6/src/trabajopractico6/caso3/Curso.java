
package trabajopractico6.caso3;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // --- Relación bidireccional ---
    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return; // ya está asignado
        }

        // si tenía profesor previo → sacarlo de su lista
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        this.profesor = p;

        // agregarme al nuevo profesor (si no es null)
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.println(
                codigo + " | " + nombre +
                " | Profesor: " + (profesor != null ? profesor.getId() : "Sin asignar")
        );
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
