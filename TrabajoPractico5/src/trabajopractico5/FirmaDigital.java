
package trabajopractico5;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioFirma usuario; // agregación

    public FirmaDigital(String codigoHash, String fecha, UsuarioFirma usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}
