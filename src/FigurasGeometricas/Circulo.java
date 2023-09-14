package FigurasGeometricas;

public class Circulo {
    /*El círculo tiene como atributo su radio en centímetros.*/
    private double radio, area, perimetro;
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
}
