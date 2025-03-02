package Clases;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class RegistroDeVentas {
    private List<Venta> ventas = new ArrayList<>();
    
    public void registrarVenta(String codigoDeVenta, LocalDateTime fecha, Producto producto, int cantidad, List<Producto> productos) {
        Venta nuevaVenta = new Venta(codigoDeVenta, fecha, producto, cantidad, productos);
        ventas.add(nuevaVenta);
    }
    
    public void mostrarVentas() {
        ventas.forEach(System.out::println);
    }
    
    public double calcularTotalDeVenta(String codigoDeVenta) {
        return ventas.stream().filter(v -> v.getCodigoDeVenta().equals(codigoDeVenta)).mapToDouble(v -> v.getProducto().getPrecio() * v.getCantidad()).sum();
    }
    
    public List<Venta> getVentas() {
        return ventas;
    }
}
