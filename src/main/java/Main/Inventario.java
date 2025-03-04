package Main;

import java.util.ArrayList;
import java.util.Scanner;

/* Definir el tema a trabajar (SUPERMERCADO)

Usando los conceptos necesarios y óptimos de programación funcional como interfaces, 
expresiones lambda, Stream y funciones preexistentes, construir una aplicación que permita:

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

Recuerde que, al utilizar la programación funcional, cada elemento solicitado debe consistir en funciones, 
además recuerde que la programación funcional involucra el uso de recursión para tareas repetitivas evitando
en su totalidad el uso de ciclos.
*/
public class Inventario {
    static ArrayList<Producto> productos = new ArrayList();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        registrarProducto();
        mostrarProducto();
    }
    
    private static void registrarProducto() {
        int contador;
        String id;
        String nombre;
        int cantidad;
        double precio;
        Producto aux; /*Variable de tipo producto para almacenar productos en el array*/
        
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
       for(int i=0;i<productos.size();i++) {
           System.out.println(productos.get(i));
       }
    }
    
}
