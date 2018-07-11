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
public class NodoMantenimiento {
    public Avion mant;
    public NodoMantenimiento siguiente;

    public NodoMantenimiento(Avion mant, NodoMantenimiento siguiente) {
        this.mant = mant;
        this.siguiente = siguiente;
    }
    
    public NodoMantenimiento(Avion mant) {
        this.mant = mant;
        this.siguiente=null;
    }

    public Avion getMant() {
        return mant;
    }

    public NodoMantenimiento getSiguiente() {
        return siguiente;
    }

    public void setMant(Avion mant) {
        this.mant = mant;
    }

    public void setSiguiente(NodoMantenimiento siguiente) {
        this.siguiente = siguiente;
    }
    public String getDatos() {
        String datos="";
        int id=mant.getIdAvion();
        String idAv=String.valueOf(id);
        int pas=mant.getCantPasajeros();
        String pasAv=String.valueOf(pas);
        int des=mant.getTurnoDesabordaje();
        String desAv=String.valueOf(des);
        int man=mant.getTurnoMantenimiento();
        String manAv=String.valueOf(man);
        datos="Estacion:\n"+"Avion"+idAv+"\n Tipo:"+mant.getTipo()+"\n Pasajeros:"+pasAv+"\n Desabordaje:"+desAv+"\n Mantenimiento:"+manAv+"\n";
        return datos;
    }
    public String getDatosa() {
        String datos="";
        int id=mant.getIdAvion();
        String idAv=String.valueOf(id);
        int pas=mant.getCantPasajeros();
        String pasAv=String.valueOf(pas);
        int des=mant.getTurnoDesabordaje();
        String desAv=String.valueOf(des);
        int man=mant.getTurnoMantenimiento();
        String manAv=String.valueOf(man);
        datos="Avion"+idAv+"\n Tipo:"+mant.getTipo()+"\n Pasajeros:"+pasAv+"\n Desabordaje:"+desAv+"\n Mantenimiento:"+manAv+"\n";
        return datos;
    }
    public void setMante(int a){
        if (a<0) {
            a=0;
        }
        mant.setTurnoMantenimiento(a);
    }
    public int getMante(){
        int a;
        a=mant.getTurnoMantenimiento();
        return a;
    }
    public int getDesb(){
        int a;
        a=mant.getTurnoDesabordaje();
        return a;
    }
}
