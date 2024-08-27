package org.example;

public class Main {
    public static void main(String[] args) {
    Cancion cancion = new Cancion("Beat it", "Michael Jackson");
    Podcast podcast = new Podcast("10' para cambiar al mundo", "Mateo Salvatto");

    //Mostrar info de los medios
    cancion.mostrarInfo();
    podcast.mostrarInfo();

    //Reproducir la canción y podcast
     cancion.reproducir();
     podcast.reproducir();
    }
}