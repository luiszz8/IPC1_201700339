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
public class NodoEscritorio {
    public Pasajero pas;
    public NodoEscritorio sig; 
    public NodoEscritorio ant;
    public ListaPasajeros lista;
    public ListaDocumentos docu;
    public int contador=0;

    public void setContador(int contador) {
        this.contador = contador;
    }

    public NodoEscritorio(NodoEscritorio sig, NodoEscritorio ant) {
        this.pas = null;
        this.sig = sig;
        this.ant = ant;
        this.lista=new ListaPasajeros();
        this.docu=new ListaDocumentos();
    }

    public NodoEscritorio()  {
        this.pas = null;
        this.ant=null;
        this.pas=null;
        this.lista=new ListaPasajeros();
        this.docu=new ListaDocumentos();
    }

    public ListaDocumentos getDocu() {
        return docu;
    }

    public ListaPasajeros getLista() {
        return lista;
    }

    public Pasajero getPas() {
        return pas;
    }

    public void setPas(Pasajero pas) {
        this.pas = pas;
    }

    public NodoEscritorio getSig() {
        return sig;
    }

    public void setSig(NodoEscritorio sig) {
        this.sig = sig;
    }

    public NodoEscritorio getAnt() {
        return ant;
    } 

    public void setAnt(NodoEscritorio ant) {
        this.ant = ant;
    }
    public String getDatos() {
        String datos="";
        int id=pas.getIdPasajero();
        String idAv=String.valueOf(id);
        int pasq=pas.getMaletas();
        String pasAv=String.valueOf(pasq);
        int des=pas.getDocumetos();
        String desAv=String.valueOf(des);
        
        datos="Pasajero"+idAv+"\n Maletas:"+pasAv+"\n Documentos:"+desAv+"\n Turno de registro:"+pas.getTurnoRegistro()+"\n";
        return datos;
    }
    public void setRegis(int a){
        if (a<0) {
            a=0;
        }
        pas.setTurnoRegistro(a);
    }
    public int getRegis(){
        int a;
        a=pas.getTurnoRegistro();
        return a;
    }
}
