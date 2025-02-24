public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,5);
        Punto p2 = new Punto(6, 8);
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 7);

        System.out.println(p1);
        System.out.println("COORDENADAS CARTESIANAS");
        System.out.println(p2.coord_cartesianas());
        System.out.println("COORDENADAS POLARES");
        System.out.println(p2.coord_polares());
        System.out.println("LINEA");
        System.out.println(linea);
        linea.dibujaLinea();
        System.out.println("CIRCULO");
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}