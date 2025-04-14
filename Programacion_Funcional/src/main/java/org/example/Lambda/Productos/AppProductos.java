package org.example.Lambda.Productos;

import java.util.ArrayList;
import java.util.List;

public class AppProductos {

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Smartphone", 150, "Electronica"));
        listaProductos.add(new Producto("Laptop", 900, "Electronica"));
        listaProductos.add(new Producto("Tablet", 200, "Electronica"));
        listaProductos.add(new Producto("Pan", 1, "Comida"));
        listaProductos.add(new Producto("Chorzio", 2.5, "Comida"));
        listaProductos.add(new Producto("Tomates", 2.3, "Comida"));


        FiltroProducto filtroProducto = (producto) -> producto.getCategoria().equals("Electronica") && producto.getPrecio() > 100;
        List<Producto> listaProductosElectronica = new ArrayList<>();

        for (Producto producto : listaProductos) {
            if (filtroProducto.filtrar(producto)) {
                listaProductosElectronica.add(producto);
            }
        }

        System.out.println("Productos filtrados (ELECTRONICA Y PRECIO > 100)");
        for (Producto producto : listaProductosElectronica) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() );
        }
    }

}
