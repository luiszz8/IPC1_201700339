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
public class ListaMantenimiento {
    private String nombre;
    private NodoMantenimiento ini,fin;
    
    public ListaMantenimiento(String nombre) {
        this.nombre = nombre;
        ini=fin=null;
    }
    
    public ListaMantenimiento() {
        this("lista");
    }
    
    public boolean estaVacia(){
        return null==ini;
    }
    public void insertarAlFrente(Avion dato){
        if (estaVacia()) {
            ini=fin=new NodoMantenimiento(dato);
            
        }else{
            ini=new NodoMantenimiento(dato,ini);
        }
    }
    public void insertarAlFinal(Avion dato){
        if (estaVacia()) { 
             ini=fin=new NodoMantenimiento(dato);
        }else{
            fin=fin.siguiente=new NodoMantenimiento(dato);
        }
    }
    public void imprimir(){
        NodoMantenimiento actual=ini;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return;
        }
        System.out.println("Contenido:");
        while(actual!=null){
            System.out.println(""+actual.getMant());
            actual=actual.siguiente;
            
        }
    }
    public Object removerAlFrente() throws ExceptionListaVacia{
            if (estaVacia()) 
            throw new ExceptionListaVacia(nombre);
            Object dato = ini.getMant();
                    
            
                if (ini==fin) {
                    ini=fin=null;
                }else{
                    ini=ini.siguiente;
                }
            return dato;
            
    }
    
    public Object removerAlFinal() throws ExceptionListaVacia{
            if (estaVacia()) 
            throw new ExceptionListaVacia(nombre);
            Object dato = fin.getMant();
            if (ini==fin) {
                    ini=fin=null;
                }else{
                    NodoMantenimiento actual=ini;
                    while(actual.siguiente!=fin)
                        actual=actual.siguiente;
                    fin=actual;
                    actual.siguiente=null;
            }
            return dato;
    }
    public Avion remover() throws ExceptionListaVacia{
            if (estaVacia()) 
            throw new ExceptionListaVacia(nombre);
            Avion dato = ini.getMant();
            if (ini==fin) {
                    ini=fin=null;
                }else{
                    NodoMantenimiento actual=ini;
                    while(actual.siguiente!=fin){
                        if (actual.getDesb()==0 && actual.getMante()==0) {
                            removerAlFrente();
                        }
                        if (actual.siguiente!=null) {
                            if (actual.siguiente.getDesb()==0 && actual.siguiente.getMante()==0) {
                            actual.siguiente=actual.siguiente.siguiente;
                            
                            }
                        }
                        actual=actual.siguiente;
                    }
            }
            return dato;
    }
    public String imprimirr(int a) {
        NodoMantenimiento actual=ini;
        String Adatos="";
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return Adatos;
        }
        
        while(actual!=null && a>0){
            actual.getDatos();
            Adatos=Adatos+actual.getDatos();
            actual.setMante(actual.getMante()-1);
            actual=actual.siguiente;
            a--;
        }
        return Adatos;
    }
    public String imprimirr() {
        NodoMantenimiento actual=ini;
        String Adatos="";
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            return Adatos;
        }
        
        while(actual!=null){
            actual.getDatosa();
            Adatos=Adatos+actual.getDatosa();
            actual=actual.siguiente;
            
        }
        return Adatos;
    }
    public void reducirTurnoM(){
        NodoMantenimiento actual=ini;
        while(actual!=null){
            actual.setMante(actual.getMante()-1);
            actual=actual.siguiente;
            
        }
    }
}
