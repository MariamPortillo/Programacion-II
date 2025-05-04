package TeatroMunicipal;

public abstract class Boleto {
    protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    public abstract void calcularPrecio();

    public String obtenerInfo() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}

