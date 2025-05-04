package ObjetosColoreados;

import java.util.Random;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2); // 0: Cuadrado, 1: Circulo
            String color = (rand.nextBoolean()) ? "Rojo" : "Azul";

            if (tipo == 0) {
                double lado = 1 + rand.nextDouble() * 9; // Entre 1 y 10
                figuras[i] = new Cuadrado(lado, color);
            } else {
                double radio = 1 + rand.nextDouble() * 9;
                figuras[i] = new Circulo(radio, color);
            }
        }

        for (Figura f : figuras) {
            System.out.println(f);
            System.out.printf("Área: %.2f, Perímetro: %.2f%n", f.area(), f.perimetro());
            if (f instanceof Coloreado) {
                System.out.println(((Coloreado) f).comoColorear());
            }
            System.out.println("-----");
        }
    }
}

