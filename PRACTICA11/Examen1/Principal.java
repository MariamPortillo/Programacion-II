package Examen1;

public class Principal {
    public static void main(String[] args) {
        
        Artista art1 = new Artista("Carlos", "123456", 10);
        Artista art2 = new Artista("Lucía", "654321", 5);
        Artista art3 = new Artista("Marta", "998877", 8);
        Artista art4 = new Artista("Diego", "112233", 15);

        Anuncio anuncio1 = new Anuncio(1, 1000.0);

        Pintura pinturaConAnuncio = new Pintura("Naturaleza Viva", "Óleo", art1, art2, anuncio1, "Paisaje");
        Pintura pinturaSinAnuncio = new Pintura("Retrato Antiguo", "Acrílico", art3, art4, null, "Retrato");

        System.out.println("--- Pinturas iniciales ---");
        pinturaConAnuncio.mostrar();
        System.out.println();
        pinturaSinAnuncio.mostrar();

        
        Artista exp1 = pinturaConAnuncio.getArtistaMasExperimentado();
        Artista exp2 = pinturaSinAnuncio.getArtistaMasExperimentado();

        System.out.println("\nArtista más experimentado (Pintura 1): " + exp1.getNombre());
        System.out.println("Artista más experimentado (Pintura 2): " + exp2.getNombre());

        Anuncio anuncio2 = new Anuncio(2, 800.0);
        pinturaSinAnuncio.agregarAnuncio(anuncio2);

        double total = pinturaConAnuncio.getPrecioAnuncio() + pinturaSinAnuncio.getPrecioAnuncio();
        System.out.println("\nPrecio total de ambas pinturas: $" + total);
    }
}
