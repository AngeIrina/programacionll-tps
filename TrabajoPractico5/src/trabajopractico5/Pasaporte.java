package trabajopractico5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pasaporte {

    private String numero;
    private String fechaEmision;
    private Foto foto;        // composición
    private Titular titular;  // asociación bidireccional

    // Constructor
    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {

        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;

    }

    public boolean estaVencido() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaEmision, formatter);
        return fecha.isBefore(LocalDate.now().minusYears(10));
    }

    public void mostrarInfo() {
        System.out.println("Pasaporte: " + numero);
        System.out.println("Fecha emisión: " + fechaEmision);
        foto.mostrar(); // delegamos en Foto
        System.out.println("Titular: " + titular.nombreCompleto());
    }
}
