package org.example;

public class Cliente {
    private String nombre;
    private  String apellido;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void realizarPedido(double monto){
        System.out.println(nombre + apellido + " está realizando un pedido por $" + monto);
        Pedido pedido = new Pedido(monto);
        pedido.procesarPedido();
    }
}
