package TeatroMunicipal;

public class Galeria extends Platea {

    public Galeria(int numero, int diasAnticipacion) {
        super(numero, diasAnticipacion);
    }

    @Override
    public void calcularPrecio() {
        if (diasAnticipacion >= 10) {
            this.precio = 50.0 * 0.5;  
        } else {
            this.precio = 60.0 * 0.5;  
        }
    }
}
