package alvaro;

/**
 *
 * @author alvaro
 */
public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    //CONSTRUCTORES
    public Cafetera() {
        this.cantidadActual = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        }else{
            this.cantidadActual = cantidadActual;
        }
        
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
    //LLENAR LA CAFETERA
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    
    //SERVIR TAZA
    public double servirTaza (double cantidadAServir){
        double cantidadTaza = 0.0;
        
        if (cantidadAServir < this.cantidadActual) {
            
            cantidadTaza = this.cantidadActual;
            this.cantidadActual -= cantidadTaza;
            
        }else{
            
            cantidadTaza = cantidadAServir;
            this.cantidadActual -= cantidadTaza;
        }
        
        //miau
        return cantidadTaza;
    }
    
    //VACIAR LA CAFETERA
    public void vaciarCafetera(){
        this.cantidadActual = 0.0;
    } 
    
    
    //METER MAS CAFE
    public void agregarCafe(double cantidadAgregar){
        
        if ((cantidadAgregar + this.cantidadActual) > this.capacidadMaxima) {
            
            this.cantidadActual = this.capacidadMaxima;
            
        }else{
            
            this.cantidadActual = cantidadAgregar;
        }
    }
    
    
}
