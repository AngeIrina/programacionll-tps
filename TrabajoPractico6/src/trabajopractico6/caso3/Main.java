
package trabajopractico6.caso3;


public class Main {
    public static void main(String[] args) {

        Universidad u = new Universidad("UTN");

        // 1. Crear profesores
        Profesor p1 = new Profesor("P1", "Laura Gómez", "Matemática");
        Profesor p2 = new Profesor("P2", "Jorge Molina", "Programación");
        Profesor p3 = new Profesor("P3", "Ana Torres", "Bases de Datos");

        // 2. Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Cálculo");
        Curso c3 = new Curso("C103", "Programación I");
        Curso c4 = new Curso("C104", "Programación II");
        Curso c5 = new Curso("C105", "SQL Avanzado");

        // 3. Agregar a la universidad
        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p3);

        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        // 4. Asignar profesores
        u.asignarProfesorACurso("C101", "P1");
        u.asignarProfesorACurso("C102", "P1");

        u.asignarProfesorACurso("C103", "P2");
        u.asignarProfesorACurso("C104", "P2");

        u.asignarProfesorACurso("C105", "P3");

        // 5. Listar todo
        System.out.println("\n--- Cursos ---");
        u.listarCursos();

        System.out.println("\n--- Profesores ---");
        u.listarProfesores();

        // 6. Cambiar profesor de un curso
        System.out.println("\nCambiando profesor de Programación II...");
        u.asignarProfesorACurso("C104", "P3");

        System.out.println("\nProfesores después del cambio:");
        u.listarProfesores();

        // 7. Eliminar curso
        System.out.println("\nEliminando curso C102...");
        u.eliminarCurso("C102");

        u.listarProfesores();

        // 8. Eliminar profesor
        System.out.println("\nEliminando profesor P2...");
        u.eliminarProfesor("P2");

        u.listarProfesores();

        // 9. Reporte final
        System.out.println("\n--- Reporte: Cantidad de cursos por profesor ---");
        for (Profesor p : u.getProfesores()) {
    System.out.println(p.getId() + ": " + p.getCursos().size());
}

    }
}
