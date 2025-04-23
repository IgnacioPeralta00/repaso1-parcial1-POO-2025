package com.abc;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private int cantidadProductos;
    private double total;

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

}
