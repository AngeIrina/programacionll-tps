package trabajopractico3;

public class GestionGallinas {

    public static void main(String[] args) {
        
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 2); // id=1, edad=2 años
        Gallina gallina2 = new Gallina(2, 1); 

        // Simulación de acciones
        gallina1.envejecer();  
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();

        gallina2.ponerHuevo();
        gallina2.envejecer();

        // Mostrar estados finales
        System.out.println("\nEstado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
    
}
