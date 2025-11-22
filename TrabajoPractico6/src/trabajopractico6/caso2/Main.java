
package trabajopractico6.caso2;


public class Main {

    public static void main(String[] args) {

        // 1. Crear Biblioteca
        Biblioteca bib = new Biblioteca("Biblioteca Central");

        // 2. Crear Autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombia");
        Autor a2 = new Autor("A2", "Julio Cortázar", "Argentina");
        Autor a3 = new Autor("A3", "Haruki Murakami", "Japón");

        // 3. Agregar libros (5 en total)
        bib.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, a1);
        bib.agregarLibro("ISBN002", "El Amor en los Tiempos del Cólera", 1985, a1);
        bib.agregarLibro("ISBN003", "Rayuela", 1963, a2);
        bib.agregarLibro("ISBN004", "Tokio Blues", 1987, a3);
        bib.agregarLibro("ISBN005", "Kafka en la Orilla", 2002, a3);

        // 4. Listar Libros
        System.out.println("\n=== LISTA DE LIBROS ===");
        bib.listarLibros();

        // 5. Buscar por ISBN
        System.out.println("\n=== BUSCAR ISBN003 ===");
        Libro buscado = bib.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();

        // 6. Filtrar por año
        System.out.println("\n=== LIBROS DEL AÑO 1987 ===");
        bib.filtrarLibrosPorAnio(1987).forEach(Libro::mostrarInfo);

        // 7. Eliminar libro
        System.out.println("\n=== ELIMINANDO ISBN002 ===");
        bib.eliminarLibro("ISBN002");
        bib.listarLibros();

        // 8. Cantidad total
        System.out.println("\nCantidad total de libros: " + bib.obtenerCantidadLibros());

        // 9. Mostrar autores disponibles
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        bib.mostrarAutoresDisponibles();
    }
}
