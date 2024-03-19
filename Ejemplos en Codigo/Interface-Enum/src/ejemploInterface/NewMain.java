
package ejemploInterface;


public class NewMain {

    
    public static void main(String[] args) {
      
        Rectangulo r = new Rectangulo(10.0, 4.0);
        Circulo c = new Circulo(6.0,3.0);
        
        System.out.println("El area del circulo es: "+c.calcularArea());
        System.out.println("El area del rectangulo es: "+r.calcularArea());
        
        Figura f = new Figura();
        
       r.crearRectangulo();
    }
    
}
