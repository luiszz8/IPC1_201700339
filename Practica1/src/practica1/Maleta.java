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
public class Maleta {
    public static int numMaleta=1;
    private int idMaleta;

    public Maleta() {
        idMaleta=numMaleta;
        numMaleta++;
    }

    public int getIdMaleta() {
        return idMaleta;
    }

    public void setIdMaleta(int idMaleta) {
        this.idMaleta = idMaleta;
    }
}
