package Clases;
public class Producto {
    private String id;
    private String Nombre;
    private double precio;
    private int cantidad;

    public Producto(String id, String Nombre, double precio, int cantidad) {
        this.id = id;
        this.Nombre = Nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
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

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "ID:"+this.id+"\nNombre:"+this.Nombre+"\nPrecio: $"+this.precio+"\nCantidad:"+this.cantidad+"\n";
    }
}
