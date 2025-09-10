package trabajopractico3;

public class Gallina {
    private int idGallina;
    private int edad;         
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // empieza sin huevos
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " 
                + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ahora tiene " 
                + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + 
                           " | Edad: " + edad + 
                           " | Huevos puestos: " + huevosPuestos);
    }
}

