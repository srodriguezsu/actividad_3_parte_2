package FigurasGeometricas;

public class TrianguloRectangulo {
    private double base, altura, hipotenusa;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public double getArea() {
        return (base * altura / 2);
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public double getPerimetro() {
        return (base + altura + hipotenusa);
    }

    public void determinarTipoTriangulo() {
        if (base != altura && altura != hipotenusa) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isosceles");
        }

    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return(this.base);
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return(this.altura);
    }
}