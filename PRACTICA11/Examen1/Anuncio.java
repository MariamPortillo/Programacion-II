package Examen1;

class Anuncio {
    private int numero;
    private double precio;

    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrar() {
        System.out.println("Anuncio N°: " + numero + ", Precio: " + precio);
    }
}