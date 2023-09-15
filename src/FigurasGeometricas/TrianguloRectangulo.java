package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class TrianguloRectangulo {

    /* Atributos: base y altura en cm - Calcular: area, perimetro, hipotenusa y determinar tipo */
    public enum TiposTriangulo { Isosceles, Escaleno }
    private double base, altura, area, perimetro, hipotenusa;
    private TiposTriangulo tipo;

    /* lista para guardar todos los triangulos creados */

    public static List<TrianguloRectangulo> triangulosList = new ArrayList<>();

    /* Metodo para calcular */

    private void determinarTipoTriangulo() {
        if (base != altura && altura != hipotenusa) {
            tipo = TiposTriangulo.Escaleno;
        } else {
            tipo = TiposTriangulo.Isosceles;
        }
    }

    private void calcularHipotenusa(){
        this.hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    private void calcularArea(){
        this.area = base * altura / 2;
    }
    private void calcularPerimetro(){
        this.perimetro = base + altura + hipotenusa;
    }

    /* Constructor y setters para base y altura */
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
        calcularHipotenusa();
        determinarTipoTriangulo();
        triangulosList.add(this);
        }
    public void setAltura(double altura){
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
        calcularHipotenusa();
        determinarTipoTriangulo();
    }public void setBase(double base){
        this.base = base;
        calcularArea();
        calcularPerimetro();
        calcularHipotenusa();
        determinarTipoTriangulo();
    }

    /* getters */

    public double getBase(){
        return(this.base);
    }

    public double getAltura(){
        return(this.altura);
    }

    public double getArea() {
        return area;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public String getTipo() {
        return String.valueOf(tipo);
    }

    @Override
    public String toString() {
        return("Triangulo-Rectangulo de " + base + "X" + altura);
    }
}