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
public class NodoAvion {
    public Avion avi;
    public NodoAvion sig; 
    public NodoAvion ant; 

    public NodoAvion(Avion avi, NodoAvion sig, NodoAvion ant) {
        this.avi = avi;
        this.sig = sig;
        this.ant = ant;
    }

    public NodoAvion(Avion avi) {
        this.avi = avi;
        this.ant=null;
        this.sig=null;
    }

    public Object getAvi() {
        return avi;
    }

    public NodoAvion getSig() {
        return sig;
    }

    public NodoAvion getAnt() {
        return ant;
    }

    public void setAvi(Avion avi) {
        this.avi = avi;
    }

    public void setSig(NodoAvion sig) {
        this.sig = sig;
    }

    public void setAnt(NodoAvion ant) {
        this.ant = ant;
    }
    public String getDatos() {
        String datos="";
        int id=avi.getIdAvion();
        String idAv=String.valueOf(id);
        int pas=avi.getCantPasajeros();
        String pasAv=String.valueOf(pas);
        int des=avi.getTurnoDesabordaje();
        String desAv=String.valueOf(des);
        int man=avi.getTurnoMantenimiento();
        String manAv=String.valueOf(man);
        datos="Avion"+idAv+"\n Tipo:"+avi.getTipo()+"\n Pasajeros:"+pasAv+"\n Desabordaje:"+desAv+"\n Mantenimiento:"+manAv+"\n";
        return datos;
    }
    public void setDesbor(int a){
        if (a<0) {
            a=0;
        }
        avi.setTurnoDesabordaje(a);
    }
    public int getDesbor(){
        int a;
        a=avi.getTurnoDesabordaje();
        return a;
     }
    public void setMante(int a){
        if (a<0) {
            a=0;
        }
        avi.setTurnoMantenimiento(a);
    }
    public int getMante(){
        int a;
        a=avi.getTurnoMantenimiento();
        return a;
    } 
}
