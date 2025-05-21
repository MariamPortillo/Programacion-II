package Examen2;

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

    public Artista getA1() {
        return a1;
    }

    public Artista getA2() {
        return a2;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public boolean tieneArtista(String nombre) {
        return a1.getNombre().equalsIgnoreCase(nombre) || a2.getNombre().equalsIgnoreCase(nombre);
    }

    public void incrementarPrecioAnuncio(double x) {
        if (anuncio != null) {
            anuncio.incrementarPrecio(x);
        }
    }

    public void mostrar() {
        System.out.println("Título: " + titulo + ", Material: " + material);
        a1.mostrar();
        a2.mostrar();
        anuncio.mostrar();
    }
}
