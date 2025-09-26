package trabajopractico5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // composición
    private Propietario propietario; // bidireccional

    public Computadora(String marca, String numeroSerie, Propietario propietario, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        // composición: la computadora crea su propia placa madre
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }
}
