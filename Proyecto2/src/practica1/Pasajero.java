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
public class Pasajero {
    
    public static int numPasajero=1;
    private int maletas;
    private int documetos;
    private int idPasajero;
    private int turnoRegistro;

    public Pasajero(int maletas, int documetos,int turnoRegistro ) {
        this.maletas = maletas;
        this.documetos = documetos;
        this.idPasajero=numPasajero;
        this.turnoRegistro=turnoRegistro;
        numPasajero++;
    }

    public static int getNumPasajero() {
        return numPasajero;
    }

    public static void setNumPasajero(int numPasajero) {
        Pasajero.numPasajero = numPasajero;
    }

    public int getTurnoRegistro() {
        return turnoRegistro;
    }

    public void setTurnoRegistro(int turnoRegistro) {
        this.turnoRegistro = turnoRegistro;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public int getDocumetos() {
        return documetos;
    }

    public void setDocumetos(int documetos) {
        this.documetos = documetos;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }
}
