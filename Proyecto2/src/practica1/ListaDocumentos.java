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
public class ListaDocumentos {
     private String nombre;
    private NodoDocumento ini,fin;

    public ListaDocumentos() {
        
        ini=fin=null;
    }
    public boolean estaVacia(){
        return null==ini;
    }
    public void insertarAlFrente(int dato){
        if (estaVacia()) {
            ini=fin=new NodoDocumento(dato);
            
        }else{
            ini=new NodoDocumento(dato,ini);
        }
    }
    public void insertarAlFinal(int dato){
        if (estaVacia()) { 
             ini=fin=new NodoDocumento(dato);
        }else{
            fin=fin.siguiente=new NodoDocumento(dato);
        }
    }
    public String imprimir(){
        NodoDocumento actual=ini;
        String a="";
        if (actual==null) {
            System.out.println("La esta vacia");
        }
        while(actual!=null){
            a=a+"Documetos "+actual.getDato()+"\n";
            actual=actual.siguiente;
        }
        return a;
    }
        public Object removerAlFrente() throws ExceptionListaVacia{
            if (estaVacia()) 
            throw new ExceptionListaVacia(nombre);
            Object dato = ini.getDato();
                    
            
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
            Object dato = fin.getDato();
            if (ini==fin) {
                    ini=fin=null;
                }else{
                    NodoDocumento actual=ini;
                    while(actual.siguiente!=fin)
                        actual=actual.siguiente;
                    fin=actual;
                    actual.siguiente=null;
            }
            return dato;
        }
}
