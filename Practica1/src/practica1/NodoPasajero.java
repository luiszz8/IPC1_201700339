/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Luis
 */
public class NodoPasajero {
    public Pasajero pasajero;
    public NodoPasajero siguiente;

    public NodoPasajero(Pasajero pasajero, NodoPasajero siguiente) {
        this.pasajero = pasajero;
        this.siguiente = siguiente;
    }

    public NodoPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
        this.siguiente=null;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void setSiguiente(NodoPasajero siguiente) {
        this.siguiente = siguiente;
    }

    public Object getPasajero() {
        return pasajero;
    }

    public NodoPasajero getSiguiente() {
        return siguiente;
    }
    public String getDatos() {
        String datos="";
        int id=pasajero.getIdPasajero();
        String idAv=String.valueOf(id);
        int pas=pasajero.getMaletas();
        String pasAv=String.valueOf(pas);
        int des=pasajero.getDocumetos();
        String desAv=String.valueOf(des);
        
        datos="Pasajero"+idAv+"\n Maletas:"+pasAv+"\n Documentos:"+desAv+"\n";
        return datos;
    }
}
