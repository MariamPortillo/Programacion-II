package ObjetosColoreados;

public class Cuadrado extends Figura implements Coloreado {
    private double lado;

    public Cuadrado(double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    public String toString() {
        return "Cuadrado - Lado: " + lado + ", " + super.toString();
    }
}
