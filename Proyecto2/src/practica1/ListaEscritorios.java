/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Luis
 */
public class ListaEscritorios {
    private NodoEscritorio ini,fin;
    private int numNodosEscritorios=0;
    public static int nodosEscritorios=0;
    public static int cantCola=0;
    public ListaEscritorios() {
        ini=fin=null;
    }
      
    public boolean estaVacia(){
        return null==ini;
    }
    public void insertarAlFinal(){
        if (estaVacia()) { 
             ini=fin=new NodoEscritorio();
             nodosEscritorios++;
        }else{
            if (nodosEscritorios<numNodosEscritorios) {
                fin=fin.sig=new NodoEscritorio();
                nodosEscritorios++;
            }
        }
    }

    public int getNumNodosEscritorios() {
        return numNodosEscritorios;
    }

    public void setNumNodosEscritorios(int numNodosEscritorios) {
        this.numNodosEscritorios = numNodosEscritorios;
    }
    public void agregarPasajero(ListaPasajeros pasar,int c){
        NodoEscritorio actual=ini;
        Pasajero[] pasajerosT=new Pasajero[5];
        pasajerosT=pasar.darPasajeros();
        int auxP=0;
        if (actual==null) {
            System.out.println("La  esta vacia");
            
        }
        while(actual!=null && auxP<5 && fin.lista.contadorP!=6){
            if (!pasar.estaVacia()) {
                if (actual.lista.contadorP<7 && pasajerosT[auxP]!=null) {
                actual.lista.insertarAlFinalC(pasajerosT[auxP]);
          
                actual.setContador(actual.contador++);
                
                auxP++;
                }
            }
            if (c>2 && actual.lista.estaVacia()) {
                actual.setPas(null);
            }
                actual=actual.sig;
                if(actual==null){ 
                    actual=ini;
                    if (pasar.estaVacia()) {
                       actual=null; 
                    }
                }
                
        }
        
    }
    public String imprimirColas(){
        NodoEscritorio actual=ini;
        String Adatos=" ";
        int cola=1;
        if (actual==null) {
            System.out.println("La esta vacia");
            return null;
        }
        
        while(actual!=null){
            Adatos=Adatos+"Cola"+cola+ "\n";
            Adatos=Adatos+actual.lista.imprimirs();
            actual=actual.sig;
            cola++;
            
        }
        return Adatos;
    }
    public String imprimirPilas(){
        NodoEscritorio actual=ini;
        String Adatos="";
        int pila=1;
        if (actual==null) {
            System.out.println("La esta vacia");
            return null;
        }
        
        while(actual!=null){
            Adatos=Adatos+"Pila "+pila+" Documentos: \n";
            Adatos=Adatos+actual.docu.imprimir()+"\n";
            actual=actual.sig;
            pila++;
            
        }
        return Adatos;
    }
    public void atender(){
        
                NodoEscritorio actual=ini;
            if (actual==null) {
                System.out.println("La esta vacia");

            }

            while(actual!=null){
                if (actual.pas==null) {
                    
                            actual.setPas(actual.lista.removerAlFrente());
                            if (!actual.lista.estaVacia()) {
                            actual.docu.insertarAlFrente(actual.pas.getDocumetos());
                            actual.lista.contadorP--;
                            }
                        
                }
                if (actual.pas!=null) {
                    if (actual.getRegis()==0) {
                        if (!actual.lista.estaVacia()) {
                            actual.setPas(actual.lista.removerAlFrente());
                            actual.docu.insertarAlFrente(actual.getPas().getDocumetos());
                            actual.lista.contadorP--;
                        }
                            
                        
                    }
                }
                actual=actual.sig;


            }
        
    }
    public void reducirTurnoR(){
        if (!estaVacia()) {
            NodoEscritorio actual=ini;
            while(actual!=null){
                if (actual.getPas()!=null) {
                    actual.setRegis(actual.getRegis()-1);
                }
                actual=actual.sig;
            
            }
        }
    }
    public String imprimir(){
        NodoEscritorio actual=ini;
        String Adatos="";
        int escri=65;
        char va;
        if (actual==null) {
            System.out.println("La  esta vacia");
            return Adatos;
        }
        
        while(actual!=null){
            if (actual.pas!=null) {
                actual.getDatos();
             va=(char)escri;   
            Adatos=Adatos+"ESCRITORIO"+" "+va+"\n";
            Adatos=Adatos+actual.getDatos();
            
            }
            actual=actual.sig;
            escri++;
        }
        return Adatos;
    }
    public String imprimirS(){
        NodoEscritorio actual=ini;
        String Adatos="digraph Z {\n";
        int escri=65;
        char va;
        if (actual==null) {
            System.out.println("La  esta vacia");
            return Adatos;
        }
        int esc=0;
        int escr=1;
        while(actual!=null){
            if (actual.pas!=null) {
                actual.getDatos();
             va=(char)escri;   
            Adatos=Adatos+"ESCRITORIO"+" "+va+"\n";
            Adatos=Adatos+actual.getDatos();
             
            }
            if (actual.pas==null) {
                va=(char)escri;
                
                Adatos=Adatos+"nodo"+esc+"[label=\"ESCRITORIO "+va+" VACIO\"];\n";
                if (actual.sig!=null) {
                    Adatos=Adatos+"nodo"+esc+"->nodo"+escr+"\n";
                }
            }
            actual=actual.sig;
            escri++;
            esc++;
            escr++;
        }
        Adatos=Adatos+"}";
        return Adatos;
    }
    public String imprimirG(){
        NodoEscritorio actual=ini;
        String Adatos="digraph C {\n";
        int escri=65;
        char va;
        if (actual==null) {
            System.out.println("La  esta vacia");
            return Adatos;
        }
        int esc=0;
        int escr=1;
        int aux=0;
        while(actual!=null){
            if (actual.pas!=null) {
                
             va=(char)escri;   
            Adatos=Adatos+"nodo"+esc+"[label=\"ESCRITORIO "+va+"\n"+actual.getDatos()+"\"];\n";
                if (!actual.lista.estaVacia()) {
                    Adatos=Adatos+"nodo"+esc+"->nodo"+escr+"\n";
                }
            Adatos=Adatos+actual.lista.imprimirsGC(esc);
            aux=aux+(actual.lista.contar()+1);
                if (actual.sig!=null) {
                    Adatos=Adatos+"nodo"+esc+"->nodo"+aux+"\n";
                }
            
            
            }
            esc=esc+(actual.lista.contar())+1;
            actual=actual.sig;
            escri++;
            escr=esc+1;
        }
        Adatos=Adatos+"}";
        return Adatos;
    }
}
