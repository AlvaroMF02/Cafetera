package alvaro;

/**
 *
 * @author alvaro
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }
    //miau

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "## Persona ##" + "\nNombre: " + nombre + "\nEdad: " + edad;
    }

    //HACER CAFE
    public void hacerCafe(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
    }

    //BEBER CAFE
    public void beberCafe(Cafetera c, int cantidad) {
        c.servirTaza(cantidad);
    }

}
