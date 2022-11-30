package alvaro;

/**
 *
 * @author alvaro
 */
public class Prueba {
    
    public static void main(String[] args) {
        // PRUEBAS CAFETERA
        Cafetera caf1 = new Cafetera(500, 0);
    
        caf1.llenarCafetera();
        System.out.println("LLENAR CAFETERA");
        System.out.println("Cantidad actual de la cafetera: " + caf1.getCantidadActual());
        
        caf1.vaciarCafetera();
        System.out.println("\nVACIAR CAFETERA");
        System.out.println("Cantidad actual de la cafetera: " + caf1.getCantidadActual());
        
        caf1.agregarCafe(120);
        System.out.println("\nLLENAR CAFETERA AL GUSTO");
        System.out.println("Cantidad actual de la cafetera: " + caf1.getCantidadActual());
        
        //######################################################################
        
        //PRUEBAS PERSONA
        
        Persona alvaro = new Persona("Álvaro", 20);
        
        alvaro.beberCafe(caf1, 23);
        System.out.println("\nDespues de servirse una taza");
        System.out.println("Cantidad actual de la cafetera: " + caf1.getCantidadActual());        
        //miau
        
    }
}
