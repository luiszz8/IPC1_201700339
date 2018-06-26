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
public class ListaAviones {
    private String nombre;
    private NodoAvion ini,fin;

    public ListaAviones(String nombre) {
        this.nombre = nombre;
        ini=fin=null;
    }

    public ListaAviones() {
        this("lista aviones");
    }
    
    
    public boolean estaVacia(){
        return null==ini;
    }
    public void insertarAlFinal(Avion dato){
        if (estaVacia()) { 
             ini=fin=new NodoAvion(dato);
        }else{
            fin=new NodoAvion(dato,null,fin);
            fin.ant.sig=fin;
        }
    }
    public void insertarAlFrente(Avion dato){
        if (estaVacia()) {
            ini=fin=new NodoAvion(dato);
            
        }else{
            ini=new NodoAvion(dato,ini,null);
            ini.sig.ant=ini;
        }
    }
    public void imprimirInicioFin(){
        NodoAvion actual=ini;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return;
        }
        System.out.println("Contenido:");
        while(actual!=null){
            System.out.println(""+actual.getAvi());
            actual=actual.sig;
            
        } 
    }
    public void imprimirFinInicio(){
        NodoAvion actual=fin;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return;
        }
        System.out.println("Contenido:");
        while(actual!=null){
            System.out.println(""+actual.getAvi());
            actual=actual.ant;
            
        }
    }
    public Object removerAlFrente() throws ExceptionListaVacia{
            if (estaVacia()) 
            throw new ExceptionListaVacia(nombre);
            Object dato = ini.getAvi();
                    
            
                if (ini==fin) {
                    ini=fin=null;
                }else{
                    ini=ini.sig;
                    ini.ant=null;
                }
            return dato;
            
    }
    public Object removerAlFinal() throws ExceptionListaVacia{
            if (estaVacia()) 
            throw new ExceptionListaVacia(nombre);
            Object dato = fin.getAvi();
            if (ini==fin) {
                    ini=fin=null;
                }else{
                    fin=fin.ant;
                    fin.sig=null;
            }
            return dato;
    }
    public String imprimir(){
        NodoAvion actual=ini;
        String Adatos="";
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return null;
        }
        
        while(actual!=null){
            actual.getDatos();
            Adatos=Adatos+actual.getDatos();
            actual=actual.sig;
            
        }
        return Adatos;
    }
    public void reducirTurnoD(){
        NodoAvion actual=ini;
        while(actual!=null){
            actual.setDesbor(actual.getDesbor()-1);
            actual=actual.sig;
            
        }
    }
    public void reducirTurnoM(){
        NodoAvion actual=ini;
        while(actual!=null){
            actual.setMante(actual.getMante()-1);
            actual=actual.sig;
            
        }
    }
    
    
    
    
}
