package trabajopractico5;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociación bidireccional
    
    // Constructor
    public Titular(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;

    }
 
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String nombreCompleto() {
        return nombre + " (DNI: " + dni + ")";
    }

    public void mostrarPasaporte() {
        if (pasaporte != null) {
            pasaporte.mostrarInfo();
        } else {
            System.out.println(nombre + " no tiene pasaporte.");
        }
    }  
}
