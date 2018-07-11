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
public class NodoDocumento {
    public int dato;
    public NodoDocumento siguiente;

    public NodoDocumento(int dato, NodoDocumento siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoDocumento(int dato) {
        this.dato = dato;
        this.siguiente=null;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(NodoDocumento siguiente) {
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public NodoDocumento getSiguiente() {
        return siguiente;
    }
}
