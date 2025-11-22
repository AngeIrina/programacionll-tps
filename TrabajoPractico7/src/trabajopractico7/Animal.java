
package trabajopractico7;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico...");
    }

    public void describirAnimal() {
        System.out.println("Soy un animal llamado " + nombre);
    }
}
