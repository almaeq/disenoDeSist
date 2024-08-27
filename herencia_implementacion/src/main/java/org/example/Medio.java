package org.example;

public abstract class Medio {
    private String titulo;
    private String artista;

    public Medio() {
    }

    public Medio(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void mostrarInfo(){
        System.out.println("Título: " + titulo + ", Artista: " + artista);
    }
}
