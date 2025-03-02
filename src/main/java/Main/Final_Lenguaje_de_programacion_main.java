package Main;

import Clases.Inventario;
import Clases.Producto;
import Clases.Venta;
import java.util.Scanner;
import Menu.Menu;
import java.time.LocalDateTime;
import Clases.RegistroDeVentas;


/**
 * Definir el tema a trabajar (Supermercado)
 * 
 * construir una registradora de ventas:
 * 
   1. Registrar ventas (código, id, fecha).
   2. Simular un inventario del que se descuentan productos comprados.
   3. Consultar información de los registros.
   4. Mostrar el valor total de la compra.
   5. Consultar de información general (cantidad) y específica sobre un producto (Nombre, id, precio y descripción).
   6. Cargar nuevos productos.
   7. Actualizar productos existentes.
   8. Mostrar el promedio de ventas por semana, mes y año.
   9. Mostrar el producto más vendido con nombre y precio.
   10.Mostrar el producto menos vendido con nombre y precio.
   11.Mostrar los productos sin stock, cantidad y nombre.
 * 
 * Recuerde que, al utilizar la programación funcional, cada elemento solicitado debe consistir en funciones, 
 * además recuerde que la programación funcional involucra el uso de recursión para tareas repetitivas evitando en su totalidad el uso de ciclos.
 * 
*/
public class Final_Lenguaje_de_programacion_main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Inventario inventario = new Inventario();
        Producto producto1 = new Producto("001", "Leche", 3500, 10);
        Producto producto2 = new Producto("002", "Azucar", 2000, 15);
        Producto producto3 = new Producto("003", "Pan", 4000, 18);
        Producto producto4 = new Producto("004", "Huevo", 800, 40);
        Producto producto5 = new Producto("005", "Galleta Noel", 6500, 25);
        Producto producto6 = new Producto("006", "Harina", 3500, 12);
        Producto producto7 = new Producto("007", "Cafe", 9000, 20);
        Producto producto8 = new Producto("008", "Queso Colanta", 4500, 8);
        Producto producto9 = new Producto("009", "Mantequilla rama", 12000, 30);
        Producto producto10 = new Producto("0010", "Cebolla", 1200, 16);
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        inventario.agregarProducto(producto5);
        inventario.agregarProducto(producto6);
        inventario.agregarProducto(producto7);
        inventario.agregarProducto(producto8);
        inventario.agregarProducto(producto9);
        inventario.agregarProducto(producto10);
        
        //inventario.mostrarInventario();
        RegistroDeVentas registroDeVentas = new RegistroDeVentas();
        Menu menu = new Menu(inventario, registroDeVentas);
        int opcion;
        
        do {
            menu.mostrarMenu();
            opcion = entrada.nextInt();
            menu.procesarOpcion(opcion);
        } while (opcion != 8);
        
        
    }
}
