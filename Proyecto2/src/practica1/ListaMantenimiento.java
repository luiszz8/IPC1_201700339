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
    private int numNodos=0;
    public static int nodos=0;
    
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
             nodos++;
        }else{
            if (nodos<numNodos) {
                fin=fin.siguiente=new NodoMantenimiento(dato);
                nodos++;
            }
        }
    }
    public void insertarAlFinalCola(Avion dato){
        if (estaVacia()) { 
             ini=fin=new NodoMantenimiento(dato);
        }else{
            
                fin=fin.siguiente=new NodoMantenimiento(dato);
            
        }
    }

    public int getNumNodos() {
        return numNodos;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
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
                    nodos--;
                }else{
                    NodoMantenimiento actual=ini;
                    while(actual.siguiente!=fin)
                        actual=actual.siguiente;
                    fin=actual;
                    actual.siguiente=null;
                    nodos--;
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
    public String imprimirrG() {
        NodoMantenimiento actual=ini;
        int avio=0;
        int avion=1;
        String Adatos="digraph V {\n";
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            
        }
        
        while(actual!=null){
            
            Adatos=Adatos+"nodo"+avio+"[label=\""+actual.getDatos()+"\"];\n";
            if (actual.siguiente!=null) {
                Adatos=Adatos+"nodo"+avio+"->nodo"+avion+"\n";
                
                avion++;
                avio++;
            }
            actual=actual.siguiente;
        }
        if(estaVacia()){
            Adatos="digraph V {\n";
        }
        Adatos=Adatos+"}";
        
        return Adatos;
    }
    public void reducirTurnoM(){
        if (!estaVacia()) {
            NodoMantenimiento actual=ini;
            while(actual!=null){
                actual.setMante(actual.getMante()-1);
                actual=actual.siguiente;
            
            }
        }
    }
    public boolean EliminarAviones(ListaMantenimiento d){
        boolean existe=false;
        if (!estaVacia()) {
            System.out.println("aqui");
            while(yaDesabordo() && d.listaLlena()){
                System.out.println("auit");
            NodoMantenimiento actual=ini;
            Avion aux,aux1;
            
            aux=(Avion)actual.mant;

                    //------------------------------------Proceso de eliminar----------------------------
                    
                    
                    if (ini==fin && ( aux.getTurnoDesabordaje()==0 && aux.isEstado()==true)) {
                        d.insertarAlFinal(aux);
                        System.out.println("primero");
                        ini=null; 
                        fin=null;
                        nodos--;
                        
                        
                    }else if (actual==ini && ( aux.getTurnoDesabordaje()==0 && aux.isEstado()==true)) {//si anterior es null entonces es el primero
                        ini=ini.getSiguiente();
                        d.insertarAlFinal(aux);
                        System.out.println("primero d");
                        nodos--;

                    }else {
                        NodoMantenimiento anterior,temporal;
                        anterior=ini;
                        temporal=ini.siguiente;
//                        aux1=(Avion)temporal.mant;
                        while(temporal!=null && (temporal.mant.getTurnoDesabordaje()!=0 && temporal.mant.isEstado()!=true)){
                            anterior=anterior.siguiente;
                            temporal=temporal.siguiente;
                        }
                        d.insertarAlFinal(temporal.mant);
                        if (temporal!=null) {
                        anterior.siguiente=temporal.siguiente;
                        if (temporal==fin) {
                            fin=anterior;
                        }
                        }
                        System.out.println("alguno");
                        nodos--;
                    }
                    existe=true;
                    
        }
        }
                //-----------------------------------------------------------------------------------
        return(existe);       
    }
    public void eliminar(Avion elemento){
        if (!estaVacia()) {
            if (ini==fin && elemento==ini.mant) {
                ini=fin=null;
            }else if (elemento==ini.mant) {
                 ini=ini.siguiente;
            }else{
                NodoMantenimiento anterior,temporal;
                anterior=ini;
                temporal=ini.siguiente;
                while(temporal!=null && temporal.mant!=elemento){
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                }
                if (temporal!=null) {
                    anterior.siguiente=temporal.siguiente;
                    if (temporal==fin) {
                        fin=anterior;
                    }
                }
            }
            
        }
    }
    public boolean yaDesabordo(){
        NodoMantenimiento actual=ini;
        boolean desa=false;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            desa=false;
        }
        
        while(actual!=null){
            if (actual.mant.getTurnoDesabordaje()==0) {
                desa=true;
            }
            
            actual=actual.siguiente;
        }
        return desa;
    }
    public boolean yaMantenimiento(){
        NodoMantenimiento actual=ini;
        boolean desa=false;
        if (actual==null) {
            System.out.println("La "+nombre+" esta vacia");
            desa=false;
        }
        
        while(actual!=null){
            if (actual.mant.getTurnoMantenimiento()==0) {
                desa=true;
            }
            
            actual=actual.siguiente;
        }
        return desa;
    }
    public boolean listaLlena(){
        boolean lleno=false;
        NodoMantenimiento actual=ini;
        int  contador=0;
        while(actual!=null){
            contador++;
            
            actual=actual.siguiente;
        }
        if (contador>=numNodos) {
            lleno= false;
        }else{
            lleno=true;
        }
        return lleno;
    }
    public boolean EliminarAviones(){
        boolean existe=false;
        if (!estaVacia()) {
            System.out.println("aqui");
            while(yaMantenimiento()){
                System.out.println("auit");
            NodoMantenimiento actual=ini;
            Avion aux,aux1;
            
            aux=(Avion)actual.mant;

                    //------------------------------------Proceso de eliminar----------------------------
                    
                    
                    if (ini==fin && ( aux.getTurnoMantenimiento()==0 && aux.isEstado()==true)) {
                        
                        System.out.println("primero");
                        ini=null; 
                        fin=null;
                        
                        
                    }else if (actual==ini && ( aux.getTurnoMantenimiento()==0 && aux.isEstado()==true)) {//si anterior es null entonces es el primero
                        ini=ini.getSiguiente();
                        
                        System.out.println("primero d");

                    }else {
                        NodoMantenimiento anterior,temporal;
                        anterior=ini;
                        temporal=ini.siguiente;
//                        aux1=(Avion)temporal.mant;
                        while(temporal!=null && (temporal.mant.getTurnoMantenimiento()!=0 && temporal.mant.isEstado()!=true)){
                            anterior=anterior.siguiente;
                            temporal=temporal.siguiente;
                        }
                        
                        if (temporal!=null) {
                        anterior.siguiente=temporal.siguiente;
                        if (temporal==fin) {
                            fin=anterior;
                        }
                        }
                        System.out.println("alguno");
                    }
                    existe=true;
        }
        }
                //-----------------------------------------------------------------------------------
        return(existe);       
    }
}
