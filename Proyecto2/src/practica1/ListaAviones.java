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
    public String imprimirG(){
        NodoAvion actual=ini;
        int avio=0;
        int avion=1;
        String Adatos="digraph G {\n";
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            
        }
        
        while(actual!=null){
            Adatos=Adatos+"nodo"+avio+"[label=\""+actual.getDatos()+"\"];\n";
            if (actual.sig!=null) {
                Adatos=Adatos+"nodo"+avio+"->nodo"+avion+"\n";
                Adatos=Adatos+"nodo"+avion+"->nodo"+avio+"\n";
                avion++;
                avio++;
            }
            actual=actual.sig;
            
        }
        if(estaVacia()){
            Adatos="digraph G {\n";
        }
        Adatos=Adatos+"}";
        return Adatos;
    }
    public boolean yaDesabordo(){
        NodoAvion actual=ini;
        boolean desa=false;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            desa=false;
        }
        
        while(actual!=null){
            if (actual.avi.getTurnoDesabordaje()==0) {
                desa=true;
            }
            
            actual=actual.sig;
            
        }
        return desa;
    }
    public void reducirTurnoD(){
        if (!estaVacia()) {
                NodoAvion actual=ini;
            while(actual!=null){
                actual.setDesbor(actual.getDesbor()-1);
                actual=actual.sig;

            }
        }
    }
    public void reducirTurnoM(){
        NodoAvion actual=ini;
        while(actual!=null){
            actual.setMante(actual.getMante()-1);
            actual=actual.sig;
            
        }
    }
    public boolean EliminarAvion(ListaMantenimiento d){

        NodoAvion actual=ini;
        Avion aux;
        boolean existe=false;
        while(actual!=null){
            aux=(Avion)actual.avi;
            if (aux.getTurnoDesabordaje()==0 && aux.isEstado()==false) {
                //------------------------------------Proceso de eliminar----------------------------
                aux.setEstado(true);
                d.insertarAlFinalCola(aux);
                if (ini==fin) {
                    ini=null; 
                    fin=null;
                    System.out.println("ultimo");
                }else
                if (actual==ini) {//si anterior es null entonces es el primero
                    ini=actual.getSig();
                    actual.getSig().setAnt(null);
                    actual.setSig(null);
                    System.out.println("inicioelim");

                }else if(actual==fin){
                    fin=actual.getAnt();
                    actual.getAnt().setSig(null);
                    actual.setAnt(null);
                    System.out.println("finalelij");
                }else{
                    actual.getAnt().setSig(actual.getSig());
                    actual.getSig().setAnt(actual.getAnt());
                    actual.setAnt(null);
                    actual.setSig(null);                    
             
                }
                existe=true;
                
                //-----------------------------------------------------------------------------------
                
            }
            if (ini!=fin) {
                actual=actual.getSig();                
            }else{
                actual=null;
            }

        }
        return(existe);       

    }
    
    
    
    
}
