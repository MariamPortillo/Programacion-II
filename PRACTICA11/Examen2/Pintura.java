package Examen2;

class Pintura extends Obra {
    private String genero;

    public Pintura(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio, String genero) {
        super(titulo, material, a1, a2, anuncio);
        this.genero = genero;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Género: " + genero);
    }
}

