package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/* Definir el tema a trabajar (SUPERMERCADO)

Usando los conceptos necesarios y óptimos de programación funcional como interfaces, 
expresiones lambda, Stream y funciones preexistentes, construir una aplicación que permita:

1. Registrar ventas (código, id, fecha).
2. Simular un inventario del que se descuentan productos comprados.
3. Consultar información de los registros.
4. Mostrar el valor total de la compra.
5. Consulta de información general (cantidad) y específica sobre un producto (Nombre, id, precio y descripción).
6. Cargar nuevos productos.  
7. Actualizar productos existentes.
8. Mostrar el promedio de ventas por semana, mes y año.
9. Mostrar el producto más vendido con nombre y precio.
10.Mostrar el producto menos vendido con nombre y precio.
11.Mostrar los productos sin stock, cantidad y nombre.

Recuerde que, al utilizar la programación funcional, cada elemento solicitado debe consistir en funciones, 
además recuerde que la programación funcional involucra el uso de recursión para tareas repetitivas evitando
en su totalidad el uso de ciclos.
*/
public class Inventario {
    static ArrayList<Producto> productos = new ArrayList();   /*Array para almacenar los productos*/
    static ArrayList<Venta> ventas = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al inventario");
        agregarProductosIniciales(); /*Función para simular el inventario actual*/
        int opcion;
        do {
            System.out.println(" ");
            System.out.println("Opciones: ");
            System.out.println("1. Realizar venta\n2. Mostrar ventas\n3. Total de la compra \n4. Consultar informacion de productos"
                    + "\n5. Cargar nuevo producto \n6. Mostrar inventario");
            System.out.print("Ingrese la opcion que desea: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1 -> {
                        mostrarProducto();
                        realizarVenta();
                        break;
                }
                case 2 -> {
                        mostrarVentas();
                        break;
                }
                case 3 -> {
                        mostrarValorCompra();
                        break;
                }
                case 4 -> {
                        informacionProductos();
                        break;
                }
                case 5 -> {
                        registrarProducto();
                        break;
                }
                case 6 -> {
                        mostrarProducto();                    
                        break;
                }
                case 7 -> {
                        opcion=5;
                        break;
                }
                default -> {
                    
                }     
            }    
        }while(opcion!=5);
        
    }
    
    /*Función para productos iniciales*/
    public static void agregarProductosIniciales() {
        Producto p1 = new Producto();
        p1.setId("p001");
        p1.setNombre("leche");
        p1.setPrecio(3500);
        p1.setCantidad(15);
        
        Producto p2 = new Producto();
        p2.setId("p002");
        p2.setNombre("mantequilla");
        p2.setPrecio(8000);
        p2.setCantidad(19);
        
        Producto p3 = new Producto();
        p3.setId("p002");
        p3.setNombre("atun");
        p3.setPrecio(5000);
        p3.setCantidad(20);
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        
    }
    
    /*Función para realizar una venta y obtener la fecha*/
    private static void realizarVenta() {
        System.out.print("Ingrese el ID del producto que desea vender: ");
        String idProducto = entrada.next().toLowerCase();
        
        Producto productoSeleccionado = null; /*Asigno un objeto nulo a la variable productoSeleccionado*/
        for (Producto producto : productos) {
            if(producto.getId().equals(idProducto)) {
                productoSeleccionado = producto;
                break; /*Detengo la busqueda*/
            }
        }
        
        if(productoSeleccionado == null) {
            System.out.println("Producto no encontrado");
            return; /*Si no encuentra el ID para el flujo del método*/
        }
        
        System.out.print("Ingrese la cantidad a vender: ");
        int cantidadDeVenta = entrada.nextInt();
        
        /*Compara si la cantidad que tiene el producto es mayor*/
        if (cantidadDeVenta > productoSeleccionado.getCantidad()) {
            System.out.println("No hay suficiente stock disponible.");
        } else if (cantidadDeVenta <= 0) {
            System.out.println("La cantidad de venta debe ser mayor que 0.");
        } else {  /*Si la cantidad cumple con lo que requiere la venta se crea la venta*/
            productoSeleccionado.setCantidad(productoSeleccionado.getCantidad() - cantidadDeVenta);
            
            Venta nuevaVenta = new Venta();
            nuevaVenta.setIdProducto(productoSeleccionado.getId());
            nuevaVenta.setCantidad(cantidadDeVenta);
            nuevaVenta.setFecha(new Date());
            
            ventas.add(nuevaVenta);
            System.out.println("Venta realizada con exito!!!");
        }
    }
    
    public static void mostrarVentas() {
        if(ventas.isEmpty()) {
            System.out.println("No se han registrado ventas ");
        } else {
            System.out.println("Ventas registradas: ");
            for(Venta venta:ventas) {
                System.out.println(venta);
            }
        }
    }
    
    /*Función para registrar productos por el usuario*/
    private static void registrarProducto() {
        int contador;
        String id;
        String nombre;
        int cantidad;
        double precio;
        Producto aux; /*Variable de tipo producto para almacenar productos en el array*/
        
        /*Cantidad de productos que el usuario quiera almacenar*/
        do {
            System.out.println("Ingrese la cantidad de productos ");
            contador = entrada.nextInt();
        }while(contador<=0);
        
        entrada.nextLine();
        
        for(int i=0;i<contador;i++) {
            System.out.println("Ingresar producto"+(i+1));
            System.out.println(" ");
            System.out.print("ID: ");
            id = entrada.nextLine();
            
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            
            System.out.print("Precio unitario: ");
            precio = entrada.nextDouble();
            
            System.out.print("Cantidad de stock: ");
            cantidad = entrada.nextInt();
            entrada.nextLine();
            System.out.println(" ");
            
            aux = new Producto();
            /*Cada que se formatea el ciclo seteamos un nuevo producto*/
            aux.setId(id);
            aux.setNombre(nombre);
            aux.setPrecio(precio);
            aux.setCantidad(cantidad);
            
            productos.add(aux);   
        } 
    }
    
    private static void mostrarProducto() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario");
        } else {
            System.out.println("Productos en el inventario");
            for(int i=0;i<productos.size();i++) {
                System.out.println(productos.get(i));
            }
        }
    }
    
    private static void mostrarValorCompra() {
        if(ventas.isEmpty()) {
            System.out.println("No se han registrado ventas aun...");
            return;
        }
        
        double totalCompra = 0;
        
        for(Venta venta : ventas) {
            Producto producto = productos.stream() /*Llamo a stream desde el array producto*/
                    .filter(p -> p.getId().equals(venta.getIdProducto()))
                    .findFirst()
                    .orElse(null);
            
            if(producto != null) {
                totalCompra += producto.getPrecio() * venta.getCantidad() ;
            }
        }
        
        System.out.println("El valor total de la compra es: $" + totalCompra+"\nGracias por su compra!!!");
    }
    
    public static void informacionProductos() { 
        int opc;
        do {
            String nombreProducto1, nombreProducto2;
            System.out.println("Opciones: ");
            System.out.println("1. Informacion general \n2. Informacion especifica de un producto \n3. Menu principal");
            opc = entrada.nextInt();
            
            
            switch (opc) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del producto que desea consultar:");
                    nombreProducto1 = entrada.next().toLowerCase();
                
                    Producto productoEncontrado = productos.stream()
                            .filter(p -> p.getNombre().equals(nombreProducto1))
                            .findFirst()
                            .orElse(null);
                
                    if (productoEncontrado == null) {
                        System.out.println("Producto no encontrado...");
                    } else {
                        System.out.println("INFORMACION GENERAL DEL PRODUCTO '"+productoEncontrado.getNombre()+"'");
                        System.out.println("Nombre: "+productoEncontrado.getNombre());
                        System.out.println("Cantidad: "+productoEncontrado.getCantidad());
                    }
                }
                
                case 2 -> {
                    System.out.println("Ingrese el nombre del producto que desea consultar:");
                    nombreProducto2 = entrada.next().toLowerCase();
                    Producto productoEncontrado = productos.stream()
                            .filter(p -> p.getNombre().equals(nombreProducto2))
                            .findFirst()
                            .orElse(null);
                    if (productoEncontrado == null) {
                        System.out.println("Producto no encontrado...");
                    } else {
                        System.out.println("INFORMACION ESPECIFICA DEL PRODUCTO '"+productoEncontrado.getNombre()+"'");
                        System.out.println("Nombre: "+productoEncontrado.getNombre());
                        System.out.println("ID: "+productoEncontrado.getId());
                        System.out.println("Precio: "+productoEncontrado.getPrecio());
                        System.out.println("Descripcion: ");
                    }
                }
                    
                case 3 -> opc = 3;
                default -> System.out.println("Ingrese una opcion valida");
            } 
        } while(opc != 3);
        
    }
    
}
