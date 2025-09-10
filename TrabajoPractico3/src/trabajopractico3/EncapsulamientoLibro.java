package trabajopractico3;

public class EncapsulamientoLibro {

    public static void main(String[] args) {
        
       Libro libro = new Libro();

        // Asignar valores usando setters
        libro.setTitulo("No quiero crecer");
        libro.setAutor("Pilar Sordo");

        // Intentar asignar un año inválido
        libro.setAnioPublicacion(3000); // debería mostrar mensaje de error

        // Asignar un año válido
        libro.setAnioPublicacion(2012);

        // Mostrar información final
        libro.mostrarInfo();
    }
}
    

