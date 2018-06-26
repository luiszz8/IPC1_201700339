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
public class ListaEquipaje {
    private NodoEquipaje primero;
    Object x;
    private NodoEquipaje ultimo;

    public ListaEquipaje() {
        primero=null;
        ultimo=null;
    }
    public boolean estaVacia(){
        return null==ultimo;
    }
    public void insertarAlFrente(Maleta dato){
        NodoEquipaje nuevo=new NodoEquipaje(dato);
        if (estaVacia()) {
            primero=nuevo;
            primero.sig=primero;
            primero.ant=ultimo;
            ultimo=nuevo;
        }else{
            ultimo.sig=nuevo;
            nuevo.sig=primero;
            ultimo=nuevo;
            primero.ant=ultimo;
        }
    }
    public void Eliminar2(){
        if (estaVacia()) {
            
        }else{
            primero=primero.sig;
            primero.ant=null;
            ultimo.sig=primero;
        }
        if (primero==ultimo) {
            primero=ultimo=null;
        }
    }
    public String imprimir(){
        NodoEquipaje actual=primero;
        String Adatos="";
        do {
            Adatos=Adatos+actual.getDatos();
            actual=actual.sig;
        } while (actual!=primero);
        return Adatos;
    }
    public boolean eliminar(Maleta dato){
        NodoEquipaje actual=ultimo;
        boolean encontrar=false;
        while(actual.sig!=ultimo && !encontrar){
            encontrar=(actual.sig.getEqui()==dato);
            if (!encontrar) {
                actual=actual.sig;
            }
        }
        encontrar=(actual.sig.getEqui()==dato);
        if (encontrar) {
            NodoEquipaje auxiliar=actual.sig;
            if (ultimo==ultimo.sig) {
                ultimo=null;
            }else{
                if (auxiliar==ultimo) {
                    ultimo=actual;
                }
                actual.sig=auxiliar.sig;
            }
            auxiliar=null;
        }
        return encontrar==true;
    }
//    public  void buscar(Object dato){
//        NodoEquipaje actual=ultimo;
//        boolean encontrado=false;
//        
//        do {
//            if (actual.equi==dato) {
//                encontrado=true;
//                x=actual.getEqui();
//            }
//            actual=actual.ant;
//        } while (actual!=ultimo);
//        if (encontrado==true) {
//            System.out.println("Nodo encontrado");
//            System.out.println(x);
//        }else{
//            System.out.println("Nodo no encontrado");
//        }
//    }
}
  