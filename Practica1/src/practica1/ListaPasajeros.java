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
    public Object removerAlFrente() throws ExceptionListaVacia{
            if (estaVacia()) 
            throw new ExceptionListaVacia(nombre);
            Object dato = ini.getPasajero();
                    
            
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
}
 