package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class Cuadrado {
    /* Atributos: lado en cm - Calcular: area, perimetro */
    private double lado, area, perimetro;

    /* lista para guardar cuadrados creados */
    public static List<Cuadrado> cuadradosList= new ArrayList<>();

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
        cuadradosList.add(this);
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
    @Override
    public String toString() {
        return("Cuadrado de lado " + lado);
    }

}
