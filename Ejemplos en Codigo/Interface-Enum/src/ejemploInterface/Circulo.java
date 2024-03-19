package ejemploInterface;

public class Circulo extends Figura implements CalculoForm {

    private Double radio;
    private Double diametro;

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public Double calcularArea() {
        Double area = PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public Double calcularPerimentro() {
        Double perimetro = PI * diametro;
        return perimetro;
    }

    @Override
    public void dibujar() {
    }

}
