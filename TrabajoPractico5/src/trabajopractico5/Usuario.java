package trabajopractico5;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}
