package Clases;

import java.time.LocalDateTime;

public class Venta {
    private String codigoDeVenta;
    private LocalDateTime fecha;
    private Producto producto;
    private int cantidad;

    public Venta(String codigoDeVenta, LocalDateTime fecha, Producto producto, int cantidad) {
        this.codigoDeVenta = codigoDeVenta;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
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
