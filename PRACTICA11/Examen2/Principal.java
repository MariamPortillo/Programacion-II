package Examen2;

public class Principal {
    public static void main(String[] args) {
      
        Artista art1 = new Artista("Marco", "1111", 7);
        Artista art2 = new Artista("Lucía", "2222", 9);
        Artista art3 = new Artista("René", "3333", 5);
        Artista art4 = new Artista("Sofía", "4444", 11);

        Anuncio anuncio1 = new Anuncio(1, 1500.0);
        Anuncio anuncio2 = new Anuncio(2, 1800.0);

        Pintura pintura1 = new Pintura("Luz y Sombra", "Óleo", art1, art2, anuncio1, "Realismo");
        Pintura pintura2 = new Pintura("Amanecer", "Acrílico", art3, art4, anuncio2, "Impresionismo");

        System.out.println("--- Pinturas creadas ---");
        pintura1.mostrar();
        System.out.println();
        pintura2.mostrar();

        
        int totalAños = art1.getAñosExperiencia() + art2.getAñosExperiencia() +
                        art3.getAñosExperiencia() + art4.getAñosExperiencia();
        double promedio = totalAños / 4.0;
        System.out.println("\nPromedio de años de experiencia: " + promedio);

        
        String nombreBuscado = "Sofía";
        double incremento = 200.0;

        if (pintura1.tieneArtista(nombreBuscado)) {
            pintura1.incrementarPrecioAnuncio(incremento);
        } else if (pintura2.tieneArtista(nombreBuscado)) {
            pintura2.incrementarPrecioAnuncio(incremento);
        }

        System.out.println("\n--- Pinturas después del incremento ---");
        pintura1.mostrar();
        System.out.println();
        pintura2.mostrar();
    }
}