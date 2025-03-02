package Menu;

import java.util.Scanner;
import Clases.Inventario;
import Clases.RegistroDeVentas;

public class Menu {
    
    private Scanner entrada = new Scanner(System.in);
    private Inventario inventario = new Inventario();
    private RegistroDeVentas registroDeVentas = new RegistroDeVentas();

    public Menu(Inventario inventario, RegistroDeVentas registroDeVentas) {
        this.inventario = inventario;
        this.registroDeVentas = registroDeVentas;
    }
    
    public void mostrarMenu() {
        System.out.println("Bienvenido al registro de ventas");
        System.out.println(" ");
        System.out.println("Opciones: ");
        System.out.println("1. Registrar venta \n2. Inventario \n3. Ventas \n4. Calcular total de venta \n5. Informacion productos"
                + "\n6. Cargar nuevo producto \n7. Actualizar producto"); 
        System.out.println(" ");
        System.out.print("Ingrese la opcion que desea: ");
    }
    
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1: 
                System.out.println("REGISTRAR VENTA");
                inventario.mostrarProductos();
                break;
            case 2:
                
            case 3:
                
            case 4:
                
            case 5:
                
            case 6:
                
            case 7:
                
            case 8:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no valida, ingrese nuevamente");;
        }
    }
    
    
    
    
   
        
}
