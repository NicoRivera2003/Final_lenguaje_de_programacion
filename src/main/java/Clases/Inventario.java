package Clases;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    
    private List<Producto> productos = new ArrayList<>();


    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public Producto buscarProducto(String id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
    
    public void actualizarProducto(Producto producto) {
        productos.stream().filter(p -> p.getId().equals(producto.getId())).findFirst().ifPresent(p -> {
            p.setCantidad(producto.getCantidad());
        });
    }
    
    public void mostrarProductos() {
        productos.forEach(System.out::println);
    }
    
     public List<Producto> getProductos() {
        return productos;
    }
    
}


    
    
    
    
    
    

