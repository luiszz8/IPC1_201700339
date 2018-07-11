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
public class ListaPasajeros {
    private String nombre;
    private NodoPasajero ini,fin;
    public int contadorP=0;
    
    public ListaPasajeros(String nombre) {
        this.nombre = nombre;
        ini=fin=null;
    }
    
    public ListaPasajeros() {
        this("lista");
    }
    
    public boolean estaVacia(){
        return null==ini;
    }
    public void insertarAlFrente(Pasajero dato){
        if (estaVacia()) {
            ini=fin=new NodoPasajero(dato);
            
        }else{
            ini=new NodoPasajero(dato,ini);
        }
    }
    public void insertarAlFinal(Pasajero dato){
        if (estaVacia()) { 
             ini=fin=new NodoPasajero(dato);
        }else{
            fin=fin.siguiente=new NodoPasajero(dato);
        }
    }
    public void insertarAlFinalC(Pasajero dato){
        if (estaVacia()) { 
             ini=fin=new NodoPasajero(dato);
             contadorP++;
        }else{
            fin=fin.siguiente=new NodoPasajero(dato);
            contadorP++;
        }
    }
    public void imprimir(){
        NodoPasajero actual=ini;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return;
        }
        System.out.println("Contenido:");
        while(actual!=null){
            System.out.println(""+actual.getPasajero());
            actual=actual.siguiente;
            
        }
    }
    public Pasajero removerAlFrente(){
        Pasajero dato=null;    
        if (!estaVacia()){ 
            
            dato = ini.getPasajero();
                    
            
                if (ini==fin) {
                    ini=fin=null;
                }else{
                    ini=ini.siguiente;
                }
            
        }
        return dato;
    }
    
    public Object removerAlFinal() throws ExceptionListaVacia{
            if (estaVacia()) 
            throw new ExceptionListaVacia(nombre);
            Object dato = fin.getPasajero();
            if (ini==fin) {
                    ini=fin=null;
                }else{
                    NodoPasajero actual=ini;
                    while(actual.siguiente!=fin)
                        actual=actual.siguiente;
                    fin=actual;
                    actual.siguiente=null;
            }
            return dato;
    }
//    public Object removerNodo() throws ExceptionListaVacia{
//            if (estaVacia()) 
//            throw new ExceptionListaVacia(nombre);
//            Object dato = fin.getPasajero();
//            if (ini==fin) {
//                    ini=fin=null;
//                }else{
//                    NodoPasajero actual=ini;
//                    while(actual.siguiente!=fin)
//                        actual=actual.siguiente;
//                    fin=actual;
//                    actual.siguiente=null;
//            }
//            return dato;
//    }
    
    public String imprimirs(){
        NodoPasajero actual=ini;
        String Adatos="";
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return null;
        }
        
        while(actual!=null){
            actual.getDatos();
            Adatos=Adatos+actual.getDatos();
            actual=actual.siguiente;
            
        }
        return Adatos;
    }
    public String imprimirsG(){
        NodoPasajero actual=ini;
        int pasj=0;
        int pasje=1;
        String Adatos="digraph F {\n";
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            
        }
        
        while(actual!=null){
            Adatos=Adatos+"nodo"+pasj+"[label=\""+actual.getDatos()+"\"];\n";
            if (actual.siguiente!=null) {
                Adatos=Adatos+"nodo"+pasj+"->nodo"+pasje+"\n";
                
                pasj++;
                pasje++;
            }
            
            actual=actual.siguiente;
            
        }
        if(estaVacia()){
            Adatos="digraph G {\n";
        }
        Adatos=Adatos+"}";
        return Adatos;
    }
    public Pasajero[] darPasajeros(){
        NodoPasajero actual=ini;
        Pasajero[] pasajeros=new Pasajero[5];
        int aux=0;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return null;
        }
        
        while(actual!=null && aux<5){
            pasajeros[aux]=actual.pasajero;
            aux++;
            actual=actual.siguiente;
        }
        return pasajeros;
    }
    public String imprimirsGC(int nod){
        NodoPasajero actual=ini;
        int pasj=nod+1;
        int pasje=nod+2;
        String Adatos="";
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            
        }
        
        while(actual!=null){
            Adatos=Adatos+"nodo"+pasj+"[label=\""+actual.getDatos()+"\"];\n";
            if (actual.siguiente!=null) {
                Adatos=Adatos+"nodo"+pasj+"->nodo"+pasje+"\n";
                
                pasj++;
                pasje++;
            }
            
            actual=actual.siguiente;
            
        }
        
        
        return Adatos;
    }
    public int contar(){
        NodoPasajero actual=ini;
        int cont=0;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
             return cont=0;
        }
        
        while(actual!=null){
            cont++;
            actual=actual.siguiente;
        }
        return cont;
    }
}
 