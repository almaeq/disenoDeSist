package org.example;

public class Podcast extends Medio implements Reproducible {

    public Podcast() {
    }

    public Podcast(String titulo, String artista) {
        super(titulo, artista);
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo el podcast " + getTitulo() + " de " + getArtista());
    }
}
