package org.example;

public class Tarea {
    private String nombre;
    private String descripcion;

    public Tarea() {
    }

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void  imprimirDetalles(){
        System.out.println("Tarea: " + nombre + "- Descripción: " + descripcion);
    }
}
