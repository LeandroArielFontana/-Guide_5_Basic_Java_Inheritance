package ejemploInterface;

import java.util.Scanner;

public class Rectangulo extends Figura implements CalculoForm{

    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Integer lados = super.crearFigura();
        
        System.out.println("Ingresar base");
        base = leer.nextDouble();
         System.out.println("Ingresar altura");
        altura = leer.nextDouble();
        
    }

    @Override
    public Double calcularArea() {
        Double area = this.base * altura;

        return area;
    }

    @Override
    public Double calcularPerimentro() {
        
        Double perimetro = (this.base + altura) * 2;

        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("estoy dibujando un rectangulo");    }

    @Override
    public void saludar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
