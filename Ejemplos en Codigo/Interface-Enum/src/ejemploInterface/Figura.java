
package ejemploInterface;

import java.util.Scanner;


public class Figura implements NewInterface{
    
    protected Integer lados;
    
    public void dibujar(){
        
    }

    public Integer crearFigura(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los lados");
        lados = leer.nextInt();
        
        return lados;
    }
    
    @Override
    public void saludar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
