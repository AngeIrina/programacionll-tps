package trabajopractico3;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(int puntos) {
        calificacion =+ puntos;
        System.out.println("La calificación de " + nombre + " ahora es: " + calificacion);
    }
    
    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
        System.out.println("La calificación de " + nombre + " ahora es: " + calificacion);
    }
}


