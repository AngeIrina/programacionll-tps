
package trabajopractico6.caso3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // --- Métodos de relación bidireccional ---
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }

        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
        }

        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    // --- Métodos auxiliares ---
    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  (ninguno)");
        } else {
            for (Curso c : cursos) {
                System.out.println("  - " + c.getCodigo() + " | " + c.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }

    // Getters
    public String getId() {
        return id;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
