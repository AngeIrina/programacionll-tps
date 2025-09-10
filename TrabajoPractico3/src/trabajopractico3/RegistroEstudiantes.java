package trabajopractico3;

public class RegistroEstudiantes {

    public static void main(String[] args) {
        // Instanciar un estudiante
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre = "Angela";
        estudiante1.apellido = "Ramos";
        estudiante1.curso = "Programación II";
        estudiante1.calificacion = 7;
        
        // Mostrar información inicial
        estudiante1.mostrarInfo();

        // Aumentar calificación
        estudiante1.subirCalificacion(8);

        // Disminuir calificación
        estudiante1.bajarCalificacion(2);

        // Mostrar información final
        estudiante1.mostrarInfo(); 
    } 
}

