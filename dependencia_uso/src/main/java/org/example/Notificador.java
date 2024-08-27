package org.example;

public class Notificador {
    private String destinatario;

    public Notificador() {
    }

    public Notificador(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public  void enviar(Mensaje mensaje){
        System.out.println("Enviando mensaje a " + destinatario + ": " + mensaje.getContenido());
    }
}
