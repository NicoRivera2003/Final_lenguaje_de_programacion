package Clases;

import java.time.LocalDateTime;
import Clases.Producto;
import java.util.List;

public class Venta {
    private String codigoDeVenta;
    private LocalDateTime fecha;
    private Producto producto;
    private int cantidad;
    private List<Producto> productos; /*Lista para productos vendidos*/

    public Venta(String codigoDeVenta, LocalDateTime fecha, Producto producto, int cantidad, List<Producto> productos) {
        this.codigoDeVenta = codigoDeVenta;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.productos = productos;
    }

    public String getCodigoDeVenta() {
        return codigoDeVenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    @Override
    public String toString() {
        return "Venta\nCodigo de venta: "+this.codigoDeVenta+"\nfecha: "+this.fecha+"\n Producto: "+this.producto+"\n Cantidad: "+this.cantidad+"\n";
    }
}
