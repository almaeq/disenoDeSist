package org.example;

public class Cancion extends Medio implements Reproducible{

    public Cancion() {
    }

    public Cancion(String titulo, String artista) {
        super(titulo, artista);
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo la canción " + getTitulo() + " de " + getArtista());
    }
}
