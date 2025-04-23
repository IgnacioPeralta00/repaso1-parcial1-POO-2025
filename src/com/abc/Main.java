package com.abc;

public class Main {
    public static void main(String[] args) {
        Carrito c1 = new Carrito();
        Producto p1 = new Producto("Manzana", 0.55, 319);
        Producto p2 = new Producto("Coca Cola", 2.55, 699);
        Producto p3 = new Producto("Pechuga de pollo", 4.00, 851);
        Producto p4 = new Producto("Regia six pack", 7.00, 141);
        c1.agregarProducto(p1);
        c1.agregarProducto(p2);
        c1.agregarProducto(p3);
        c1.agregarProducto(p4);
        c1.setTotal(c1.calcularTotal());
        c1.mostrarCarrito();
        c1.eliminarProducto(699);
        c1.setTotal(c1.calcularTotal());
        c1.mostrarCarrito();

    }
}
