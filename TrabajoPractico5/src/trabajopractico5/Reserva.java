package trabajopractico5;

public class Reserva {
    private String fecha;
    private String hora;
    private ClienteReserva cliente; // unidireccional
    private Mesa mesa;       // agregación

    public Reserva(String fecha, String hora, ClienteReserva cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
}
