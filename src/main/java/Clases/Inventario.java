package Clases;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    
}


    
    
    
    
    
    

