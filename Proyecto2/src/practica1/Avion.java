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
public class Avion {
    public static int numAvion=1;
    private String tipo;
    private int cantPasajeros;
    private int turnoDesabordaje;
    private int turnoMantenimiento;
    private int idAvion;
    private boolean estado=false;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado; 
    }

    public Avion(String tipo, int cantPasajeros, int turnoDesabordaje, int turnoMantenimiento) {
        this.tipo = tipo;
        this.cantPasajeros = cantPasajeros;
        this.turnoDesabordaje = turnoDesabordaje;
        this.turnoMantenimiento = turnoMantenimiento;
        this.idAvion=numAvion;
        numAvion++;
    }
 
    public String getTipo() {
        return tipo;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getTurnoDesabordaje() {
        return turnoDesabordaje;
    }

    public void setTurnoDesabordaje(int turnoDesabordaje) {
        this.turnoDesabordaje = turnoDesabordaje;
    }

    public int getTurnoMantenimiento() {
        return turnoMantenimiento;
    }

    public void setTurnoMantenimiento(int turnoMantenimiento) {
        this.turnoMantenimiento = turnoMantenimiento;
    }
}
