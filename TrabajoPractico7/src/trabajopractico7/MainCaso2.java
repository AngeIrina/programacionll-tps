
package trabajopractico7;


public class MainCaso2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);

        for (Figura f : figuras) {
            System.out.println(f.nombre + " - Área: " + f.calcularArea());
        }
    }
}
