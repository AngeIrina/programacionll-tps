package trabajopractico3;

public class RegistroMascotas {

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        
        mascota1.nombre = "Drago";
        mascota1.especie = "Doberman";
        mascota1.edad = 10;
        
        // Mostrar información 
        mascota1.mostrarInfo();
        
        // Simular paso del tiempo (1 año mas)
        mascota1.cumplirAnios(); 
        
        // Mostrar información final
        mascota1.mostrarInfo();
    }
    
}
