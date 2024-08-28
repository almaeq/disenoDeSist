package org.example;

import java.util.ArrayList;

public class Proyecto {
    private String nombreProyecto;
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Tarea getTareas(int i) {
        return tareas.get(i);
    }

    public void setTareas(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public void  mostrarTareas(){
        System.out.println("Tareas del proyecto " + nombreProyecto + ": ");
        for (Tarea tarea : tareas){
            tarea.imprimirDetalles();
        }
    }
}
