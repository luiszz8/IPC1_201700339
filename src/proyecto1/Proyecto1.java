/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Luis
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       frmTablero tablero=new frmTablero();
       tablero.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //Se settea la posición inicial de la ventana en el centro de la pantalla
        tablero.setLocation(dim.width/2-tablero.getSize().width/2, dim.height/2-tablero.getSize().height/2);
        //Se muestra el tablero
        tablero.show();
    }
    
}
