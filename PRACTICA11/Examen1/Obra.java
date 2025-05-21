package Examen1;

class Obra {
    protected String titulo;
    protected String material;
    protected Artista a1, a2;
    protected Anuncio anuncio;

    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.anuncio = anuncio;
    }

    public Artista getArtistaMasExperimentado() {
        return a1.getAñosExperiencia() >= a2.getAñosExperiencia() ? a1 : a2;
    }

    public void agregarAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public double getPrecioAnuncio() {
        if (anuncio != null) {
            return anuncio.getPrecio();
        }
        return 0;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo + ", Material: " + material);
        a1.mostrar();
        a2.mostrar();
        if (anuncio != null) {
            anuncio.mostrar();
        } else {
            System.out.println("Sin anuncio");
        }
    }
}