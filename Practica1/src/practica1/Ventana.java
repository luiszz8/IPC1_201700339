/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class Ventana extends javax.swing.JFrame {
     public int variaAviones;
     public int auxiliarAv=0;
     public int variaPasajeros;
     public int auxiliarPa=0;
     public int variaMaletas;
     public int auxiliarMa=0;
     public int variaEstaciones;
     public int auxiliarEs=1;
     public int auxTipo;
     public String aTipo;
     public int auxPasajeros;
     public int auxDesabordaje;
     public int auxMantenimiento;
     public int auxMaletas;
     public int auxDocumentos;
     public int iteracionesMantenimineto=0;
     public int[] contadorMaletas=new int[300];
     public int contaPaMa=0;
     public int cicloMaletas;
     public int sumandoMaletas=4;
     public int eliminadorMaletas=0;
     public int Turno=2;
     ListaAviones listaA=new ListaAviones();
     ListaPasajeros listaP=new ListaPasajeros();
     ListaEquipaje listaE=new ListaEquipaje();
     ListaMantenimiento listaM=new ListaMantenimiento();
     ListaMantenimiento listaC=new ListaMantenimiento();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cantidadAviones = new javax.swing.JTextField();
        cantidadEstaciones = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        empezar = new javax.swing.JButton();
        pasarT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad Aviones");

        jLabel2.setText("Cantidad Estaciones");

        area.setBackground(new java.awt.Color(0, 0, 0));
        area.setColumns(20);
        area.setForeground(new java.awt.Color(255, 255, 255));
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );

        empezar.setText("Empezar");
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });

        pasarT.setText("Pasar Turno");
        pasarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(empezar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidadAviones, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(cantidadEstaciones)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pasarT)))
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cantidadAviones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cantidadEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empezar)
                            .addComponent(pasarT)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        variaAviones=Integer.parseInt(cantidadAviones.getText());
        variaEstaciones=Integer.parseInt(cantidadEstaciones.getText());
        
        while(auxiliarAv<1){
            auxiliarAv++;
            auxTipo=generaNumAleatorio(1,3);
            if (auxTipo==1) {
                aTipo="Pequeño";
                auxPasajeros=generaNumAleatorio(5,10);
                auxDesabordaje=1;
                auxMantenimiento=generaNumAleatorio(1,3);
            }
            if (auxTipo  ==2) {
                aTipo="Mediano";
                auxPasajeros=generaNumAleatorio(15,25);
                auxDesabordaje=2;
                auxMantenimiento=generaNumAleatorio(2,4);
            }
            if (auxTipo==3) {
                aTipo="Grande";
                auxPasajeros=generaNumAleatorio(30,40);
                auxDesabordaje=3;
                auxMantenimiento=generaNumAleatorio(3,6);
            }
            variaPasajeros=variaPasajeros+auxPasajeros;
            Avion avion=new Avion(aTipo,auxPasajeros,auxDesabordaje,auxMantenimiento);
            listaA.insertarAlFinal(avion);
            listaM.insertarAlFinal(avion);
            listaC.insertarAlFinal(avion);
        }
        
        while(auxiliarPa<variaPasajeros){
            auxiliarPa++;
            auxMaletas=generaNumAleatorio(1,4);
            auxDocumentos=generaNumAleatorio(1,10);
            variaMaletas=variaMaletas+auxMaletas;
            contadorMaletas[contaPaMa]=variaMaletas;
            contaPaMa++;
            Pasajero pasajero=new Pasajero(auxMaletas,auxDocumentos);
            listaP.insertarAlFinal(pasajero);
        }
        while(auxiliarMa<variaMaletas){
            auxiliarMa++;
            Maleta maleta=new Maleta();
            listaE.insertarAlFrente(maleta);
        }
        String esta="";
        while(auxiliarEs<=variaEstaciones){
            esta=esta+"Estacion"+auxiliarEs+"\n Estado: Libre \n";
            auxiliarEs++;
        }
        area.setText("++++++++++++ TURNO 1 ++++++++++++ \n"+
                "++++++++++++ AVIONES ++++++++++++ \n"+
                ""+listaA.imprimir()+"++++++++++++ PASAJEROS ++++++++++++ \n"+""+listaP.imprimirs()
                +"++++++++++++ MALETAS ++++++++++++ \n"+listaE.imprimir()
                +"++++++++++++ ESTACIONES ++++++++++++ \n"+esta+"++++++++++ FIN TURNO 1 ++++++++++");
        listaA.reducirTurnoD();
    }//GEN-LAST:event_empezarActionPerformed
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    private void pasarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarTActionPerformed
        if(auxiliarAv<variaAviones){
            auxiliarAv++;
            auxTipo=generaNumAleatorio(1,3);
            if (auxTipo==1) {
                aTipo="Pequeño";
                auxPasajeros=generaNumAleatorio(5,10);
                auxDesabordaje=1;
                auxMantenimiento=generaNumAleatorio(1,3);
            }
            if (auxTipo==2) {
                aTipo="Mediano";
                auxPasajeros=generaNumAleatorio(15,25);
                auxDesabordaje=2;
                auxMantenimiento=generaNumAleatorio(2,4);
            }
            if (auxTipo==3) {
                aTipo="Grande";
                auxPasajeros=generaNumAleatorio(30,40);
                auxDesabordaje=3;
                auxMantenimiento=generaNumAleatorio(3,6);
            }
            Avion avion=new Avion(aTipo,auxPasajeros,auxDesabordaje,auxMantenimiento);
            listaA.insertarAlFinal(avion);
            listaM.insertarAlFinal(avion);
            listaC.insertarAlFinal(avion);
        
        auxiliarPa=0;
        variaMaletas=0;
        while(auxiliarPa<auxPasajeros){
            auxiliarPa++;
            auxMaletas=generaNumAleatorio(1,4);
            auxDocumentos=generaNumAleatorio(1,10);
            variaMaletas=variaMaletas+auxMaletas;
            contadorMaletas[contaPaMa]=variaMaletas;
            contaPaMa++;
            Pasajero pasajero=new Pasajero(auxMaletas,auxDocumentos);
            listaP.insertarAlFinal(pasajero);
        }
        auxiliarMa=0;
        while(auxiliarMa<variaMaletas){
            auxiliarMa++;
            Maleta maleta=new Maleta();
            listaE.insertarAlFrente(maleta);
        }
         
        }
        while(iteracionesMantenimineto<variaEstaciones){
            iteracionesMantenimineto++;
            try {
                listaC.removerAlFrente();
            } catch (ExceptionListaVacia ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (contadorMaletas.length>sumandoMaletas) {
            cicloMaletas=contadorMaletas[sumandoMaletas];
            sumandoMaletas=sumandoMaletas+5;
        }  
        while(eliminadorMaletas<cicloMaletas){
            listaE.Eliminar2();
            eliminadorMaletas++;
        }
        
        try {
             listaP.removerAlFrente();
        } catch (ExceptionListaVacia ex) {
             Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             listaP.removerAlFrente();
        } catch (ExceptionListaVacia ex) {
             Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             listaP.removerAlFrente();
        } catch (ExceptionListaVacia ex) {
             Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             listaP.removerAlFrente();
        } catch (ExceptionListaVacia ex) {
             Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             listaP.removerAlFrente();
        } catch (ExceptionListaVacia ex) {
             Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
             listaM.remover();
         } catch (ExceptionListaVacia ex) {
             Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
         }
        area.setText(area.getText()+"\n ++++++++++++ TURNO"+Turno+"++++++++++++ \n"+
                "++++++++++++ AVIONES ++++++++++++ \n"+
                ""+listaA.imprimir()+"++ ++++++++++ PASAJEROS ++++++++++++ \n"+""+listaP.imprimirs()
                +"++++++++++++ MALETAS   ++++++++++++ \n"+listaE.imprimir()
                +"++++++++++++ ESTACIONES ++++++++++++ \n"+listaM.imprimirr(variaEstaciones)+"COLA \n"
                +listaC.imprimirr());
        listaA.reducirTurnoD();
        Turno++;
    }//GEN-LAST:event_pasarTActionPerformed
    
    private static int generaNumAleatorio(int minimo,int maximo){//funcion para generar un numero aleatorio
    
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));//limites del numero generado
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextField cantidadAviones;
    private javax.swing.JTextField cantidadEstaciones;
    private javax.swing.JButton empezar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pasarT;
    // End of variables declaration//GEN-END:variables
}
