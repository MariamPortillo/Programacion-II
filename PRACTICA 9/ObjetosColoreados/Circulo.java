package ObjetosColoreados;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        return "Círculo - Radio: " + radio + ", " + super.toString();
    }
}
