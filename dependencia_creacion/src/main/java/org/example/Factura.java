package org.example;

public class Factura {
    private double monto;

    public Factura() {
    }

    public Factura(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public  void imprimir(){
        System.out.println("Factura por el monto de: $" + monto);
    }
}
