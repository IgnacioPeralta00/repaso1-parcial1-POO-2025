package com.abc;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private int cantidadProductos = 0;
    private double total = 0;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidadProductos() {
        return this.cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void agregarProducto(Producto producto) {
        this.getProductos().add(producto);
        System.out.println("'" + producto.getNombre() + "' agregado al carrito");
        this.setCantidadProductos(this.getCantidadProductos() + 1);
    }

    // Eliminar producto por su ID
    public void eliminarProducto(int ID) {
        boolean eliminado = false;
        for (int i = 0; i < this.getProductos().size(); i++) {
            if (this.getProductos().get(i).getId() == ID) {
                String nombreProducto = this.getProductos().get(i).getNombre();
                this.getProductos().remove(i);
                System.out.println("'" + nombreProducto + "' eliminado al carrito");
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("No se puede eliminar el producto");
        }
    }

    public void calcularTotal() {
        double total = 0;
        for (Producto producto : this.getProductos()) {
            total += producto.getPrecio();
        }
        this.setTotal(total);
    }

    public void mostrarCarrito() {
        List<Producto> productosLista = this.getProductos();
        System.out.println("-------------------------");
        for (Producto producto : productosLista) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("ID: " + producto.getId());
            System.out.println("-------------------------");
        }
        System.out.println("Total de productos: " + this.getCantidadProductos());
        System.out.println("Total a pagar: $" + this.getTotal());
    }
}
