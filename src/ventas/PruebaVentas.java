package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Blusa", 30.00);
        var producto2 = new Producto("Zapatos", 50.00);
        var producto3 = new Producto("Camisa", 70.00);
        var producto4 = new Producto("Pantalon", 40.25);
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        var orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
    }
}
