package org.example;
//Crea y usa una Factura
public class Pedido {
    private double monto;

    public Pedido() {
    }

    public Pedido(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void procesarPedido(){
        Factura factura = new Factura(monto);
        factura.imprimir();
    }
}
