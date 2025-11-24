
package trabajopractico8;

public class TrabajoPractico8 {
public static void main(String[] args) {

        // === PARTE 1 ===
        Cliente c = new Cliente("Ángela");

        Pedido pedido = new Pedido(c);
        pedido.agregarProducto(new Producto("Collar de plata", 15000));
        pedido.agregarProducto(new Producto("Aros de oro", 20000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        pedido.cambiarEstado("EN PREPARACIÓN");

        TarjetaCredito tc = new TarjetaCredito();
        double totalConDescuento = tc.aplicarDescuento(pedido.calcularTotal());
        tc.procesarPago(totalConDescuento);

        // === PARTE 2 ===
        try {
            VerificarEdad.validarEdad(150);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
