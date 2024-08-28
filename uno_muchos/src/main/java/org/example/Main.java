package org.example;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Desarrollo página web");
        Tarea tarea1 = new Tarea("Diseñar interfaz de usuario","Hay que elegir tipografía");
        Tarea tarea2 = new Tarea("Implementar autenticación","El usuario debe recibir un mail...");
        Tarea tarea3  = new Tarea("Pruebas de funcionalidad", "Hay que verificar que funciona todo");
        proyecto.setTareas(tarea1);
        proyecto.setTareas(tarea2);
        proyecto.setTareas(tarea3);
        proyecto.mostrarTareas();
    }
}