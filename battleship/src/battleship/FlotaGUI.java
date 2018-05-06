/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Color;
import java.awt.Component;
import java.awt.Panel;

/**
 *
 * @author Luis Oliva
 */
public class FlotaGUI extends javax.swing.JFrame {    
    /**
     * Creates new form AjusteFlota
     */
    
    
    public FlotaGUI() {
        initComponents();
        setLocationRelativeTo(null);
       
    }
    OrientacionFrame orientacion= new OrientacionFrame ();
    Character flag= new Character('.');
    Jugador p1;
    Panel panelTemp[][]=new Panel[8][8];
    Punto coordenadas;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        submarino = new javax.swing.JButton();
        antiaereo = new javax.swing.JButton();
        base = new javax.swing.JButton();
        barco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setText("FLOTA NAVAL DISPONIBLE");

        submarino.setText("Submarino (2)");
        submarino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submarinoActionPerformed(evt);
            }
        });

        antiaereo.setText("Anti-aéreo (3)");

        base.setText("Base aérea (4)");

        barco.setText("Barco (1)");
        barco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addComponent(barco)
                    .addComponent(antiaereo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submarino, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submarino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(antiaereo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(base)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcoActionPerformed
        // TODO add your handling code here:
        barco.setEnabled(false);
        this.setVisible(false);
        p1.nave1.setUbicacion(coordenadas);
        panelTemp[this.coordenadas.columna][this.coordenadas.fila].setBackground(Color.black);
    }//GEN-LAST:event_barcoActionPerformed

    private void submarinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submarinoActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        this.submarino.setEnabled(false);
        orientacion.setVisible(true);
        flag='S';
        p1.nave2.setUbicacion(coordenadas);
        orientacion.jugadorDataOrientacion(p1, flag, panelTemp);
    }//GEN-LAST:event_submarinoActionPerformed

    public void jugadorData(Jugador p1, Panel[][] panel, Punto coordenadas)
    {
        this.p1=p1;
        this.panelTemp=panel;
        this.coordenadas=coordenadas;
       
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
            java.util.logging.Logger.getLogger(FlotaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlotaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlotaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlotaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlotaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton antiaereo;
    private javax.swing.JButton barco;
    private javax.swing.JButton base;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton submarino;
    // End of variables declaration//GEN-END:variables
}
