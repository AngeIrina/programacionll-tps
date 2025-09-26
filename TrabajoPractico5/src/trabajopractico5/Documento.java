
package trabajopractico5;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // composición

    public Documento(String titulo, String contenido, String codigoHash, String fecha, UsuarioFirma usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // composición: Documento crea su FirmaDigital
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }
}
