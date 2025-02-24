public class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void dibujaLinea() {
        System.out.println("Dibujando línea de " + p1 + " a " + p2);
    }

    @Override
    public String toString() {
        return "p1= " + p1 + ", p2= " + p2 ;
    }
}