package Clases;
public class Producto {
    private String id;
    private String Nombre;
    private double precio;
    private int cantidad;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    @Override
    public String toString() {
        return "ID:"+this.id+"\nNombre:"+this.Nombre+"\nPrecio:"+this.precio+"\nCantidad:"+this.cantidad;
    }
}
