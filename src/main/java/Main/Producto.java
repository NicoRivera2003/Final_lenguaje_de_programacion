package Main;
public class Producto {
   private String id;
   private String nombre;
   private double precio;
   private int cantidad;
   private String descripcion;
   private int ventasTotales;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void incrementarVentasTotales(int cantidadVendida) {
        this.ventasTotales += cantidadVendida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
   @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad+", Descripcion: "+descripcion;
    }
}
