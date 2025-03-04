package Main;

import java.util.Date;

public class Venta {
    private String idProducto;
    private int cantidad;
    private Date fecha;

    public String getIdProducto() {
        return idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "Producto ID: " + idProducto + ", Cantidad: " + cantidad + ", Fecha: " + fecha;
    }
}
