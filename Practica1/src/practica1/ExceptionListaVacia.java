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
class ExceptionListaVacia extends Exception {
    public ExceptionListaVacia(String nombre){
        super("La "+ nombre +" esta vacia");
    }
}
