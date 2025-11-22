
package trabajopractico6.caso2;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);

        if (encontrado != null) {
            libros.remove(encontrado);
            return true;
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> filtrados = new ArrayList<>();

        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                filtrados.add(l);
            }
        }
        return filtrados;
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles:");
        ArrayList<String> autoresListados = new ArrayList<>();

        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();

            if (!autoresListados.contains(nombreAutor)) {
                System.out.println("- " + l.getAutor());
                autoresListados.add(nombreAutor);
            }
        }
    }
}
