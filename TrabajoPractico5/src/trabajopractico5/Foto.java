package trabajopractico5;

public class Foto {

    private String imagen;
    private String formato;

//Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    public void mostrar(){
        System.out.println("Foto: " + imagen + " (" + formato + ")");
    }
}
