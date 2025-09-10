package trabajopractico3;

public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // límite de combustible

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCombustible(int combustible) {
        if (combustible <= MAX_COMBUSTIBLE) {
            this.combustible = combustible;
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
    }

    public int getCombustible() {
        return combustible;
    }

    public void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado con éxito.");
            combustible -= 10; // el despegue consume 10 unidades
        } else {
            System.out.println(nombre + " no puede despegar, no tiene combustible.");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
        } else {
            combustible += cantidad;
        }
        System.out.println(nombre + " recargó combustible. Nivel actual: " + combustible);
    }

    public void mostrarEstado() {
        System.out.println("Estado de " + nombre + ":");
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}
