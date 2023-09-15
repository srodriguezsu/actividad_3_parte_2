package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class Rectangulo {
    /*Atributos: base y altura en cm */

    private double base, altura, area, perimetro;

    /* lista para guardar rectangulos creados */

    public static List<Rectangulo> rectangulosList = new ArrayList<>();

    /* Metodos que establecen el valor del perimetro y del area */

    private void calcularPerimetro(){
        this.perimetro = (2*base) + (2*altura);
    }

    private void calcularArea(){
        this.area = base * altura;
    }

    /* Constructor y setters que cambian base y altura*/

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
        rectangulosList.add(this);
    }

    public void setBase(double base){
        this.base = base;
        calcularArea();
        calcularPerimetro();
    }

    public void setAltura(double altura){
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    /* getters */
    public double getBase(){
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    @Override
    public String toString() {
        return("Rectangulo de " + base + "X" + altura);
    }
}
