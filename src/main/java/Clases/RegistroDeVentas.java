package Clases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class RegistroDeVentas {
    private List<Venta> ventas = new ArrayList<>();
    
    public void registrarVenta(Venta venta) {
        ventas.add(venta);
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
