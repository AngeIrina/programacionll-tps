package trabajopractico3;

public class SimulacionNaveEspacial {

    public static void main(String[] args) {
        
        // Crear nave
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Aurelia");
        nave.setCombustible(50);

        // Intentar avanzar sin recargar
        nave.despegar();
        nave.avanzar(60); // no debería poder avanzar

        // Recargar combustible y avanzar correctamente
        nave.recargarCombustible(40); 
        nave.avanzar(60); // ahora debería poder avanzar

        // Mostrar estado final
        nave.mostrarEstado();
    }  
}
