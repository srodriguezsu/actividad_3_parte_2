package FigurasGeometricas;

public class Cuadrado {
    /* Atributos: lado en cm - Calcular: area, perimetro */
    private double lado, area, perimetro;

    /* Metodos para calcular */

    private void calcularPerimetro(){
        this.perimetro = 4 * lado ;
    }

    private void calcularArea(){
        this.area = Math.pow(lado,2);
    }

    /* Constructor y setter para el lado */
    public Cuadrado(double lado){
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    public void setLado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    /* getters */

    public double getLado() {
        return lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

}
