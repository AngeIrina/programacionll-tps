
package trabajopractico6;

public class MainCaso1 {
    public static void main(String[] args) {

        Inventario inv = new Inventario();

        // 1. Crear productos
        Producto p1 = new Producto("A1", "Arroz", 800, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E1", "Auriculares", 2500, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R1", "Remera", 1500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H1", "Silla", 5000, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A2", "Galletitas", 900, 50, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        // 2. Listar
        System.out.println("=== LISTADO DE PRODUCTOS ===");
        inv.listarProductos();

        // 3. Buscar por ID
        System.out.println("\n=== BUSCAR ID R1 ===");
        Producto buscado = inv.buscarProductoPorId("R1");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n=== FILTRAR ALIMENTOS ===");
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS).forEach(Producto::mostrarInfo);

        // 5. Eliminar producto
        System.out.println("\n=== ELIMINAR E1 ===");
        inv.eliminarProducto("E1");
        inv.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n=== ACTUALIZAR STOCK A1 ===");
        inv.actualizarStock("A1", 40);

        // 7. Total stock
        System.out.println("\nTotal stock: " + inv.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        inv.obtenerProductoConMayorStock().mostrarInfo();

        // 9. Filtrar por precio
        System.out.println("\n=== Productos entre $1000 y $3000 ===");
        inv.filtrarProductosPorPrecio(1000, 3000).forEach(Producto::mostrarInfo);

        // 10. Categorías disponibles
        System.out.println("\n=== Categorías Disponibles ===");
        inv.mostrarCategoriasDisponibles();
    }
}

