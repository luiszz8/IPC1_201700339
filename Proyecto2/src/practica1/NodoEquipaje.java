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
public class NodoEquipaje {
    public Maleta equi;
    public NodoEquipaje sig; 
    public NodoEquipaje ant; 

    public void setEqui(Maleta equi) {
        this.equi = equi;
    }

    public void setSig(NodoEquipaje sig) {
        this.sig = sig;
    }

    public void setAnt(NodoEquipaje ant) {
        this.ant = ant;
    }

    public Object getEqui() {
        return equi;
    }

    public NodoEquipaje getSig() {
        return sig;
    }

    public NodoEquipaje getAnt() {
        return ant;
    }

    public NodoEquipaje(Maleta equi) {
        this.equi = equi;
        sig=this;
        
    }
    public String getDatos() {
        String datos="";
        int id=equi.getIdMaleta();
        String idAv=String.valueOf(id);
        
        datos="Maleta"+idAv+"\n";
        return datos;
    }
}
