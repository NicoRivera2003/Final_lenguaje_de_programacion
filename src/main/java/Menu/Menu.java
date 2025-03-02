package Menu;

import java.util.Scanner;

public class Menu {
    
    private Scanner entrada;
    
    public void mostrarMenu() {
        
        System.out.println("Bienvenido al registro de ventas");
        System.out.println(" ");
        System.out.println("Opciones: ");
        System.out.println("1. Comprar \n2. Inventario \n3. Consultar informacion de producto \n4. Cargar nuevo producto \n5. Salir"); 
    }
    
    public int obtenerOpcion() {
        return entrada.nextInt();
    }
    
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
            
            case 2:
                
            case 3:
                
            case 4:
                
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            
            default:
                System.out.println("Opcion no valida, ingrese nuevamente");;
        }
    }
    
    
    
    
   
        
}
