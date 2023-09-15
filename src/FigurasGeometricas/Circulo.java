package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class Circulo {
    /*El círculo tiene como atributo su radio en centímetros.*/
    private double radio, area, perimetro;
    /* lista para almacenar circulos creados */

    public static List<Circulo> circulosList = new ArrayList<>();

    /* Metodos que establecen el valor del perimetro y del area */
    private void calcularPerimetro(){
        this.perimetro = 2* Math.PI * radio;
    }
    private void calcularArea(){
        this.area = Math.PI * Math.pow(radio,2);
    }

    /* constructor y setter que permite cambiar el radio */
    public Circulo(double radio){
        this.radio = radio;
        calcularPerimetro();
        calcularArea();
        circulosList.add(this);
    }

    public void setRadio(double radio){
        this.radio = radio;
        calcularPerimetro();
        calcularArea();
    }

    /* getters para los datos */

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    /* para mostrar los valores */

    @Override
    public String toString() {
        return("Circulo de radio " + radio);
    }
}
