/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Color;
import java.awt.Panel;

/**
 *
 * @author Luis Oliva
 */
public class OrientacionFrame extends javax.swing.JFrame {

    Jugador p1;
    Character flag;
    Panel panelTemp[][];
    /**
     * Creates new form OrientacionFrame
     */
    public OrientacionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVertical = new javax.swing.JButton();
        botonHorizontal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVertical.setText("Vertical");
        botonVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerticalActionPerformed(evt);
            }
        });

        botonHorizontal.setText("Horizontal");
        botonHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHorizontalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerticalActionPerformed
        // TODO add your handling code here:
        
        if (flag.equals('S'))
        {
            p1.nave2.setOrientacion('V');
            if (p1.nave2.orientacion.equals('V'))
            {               
                for (int i=0;i<p1.nave2.getTamaño();i++)
                {
                    panelTemp[p1.nave2.ubicacion.columna][p1.nave2.ubicacion.fila+i].setBackground(Color.black);
                }

            }
        }
        
        if (flag.equals('A'))
        {
            p1.nave3.setOrientacion('V');
            p1.nave3.setTamaño(3);
            if (p1.nave3.orientacion.equals('V'))
            {               
                for (int i=0;i<p1.nave3.getTamaño();i++)
                {
                    panelTemp[p1.nave3.ubicacion.columna][p1.nave3.ubicacion.fila+i].setBackground(Color.black);
                }

            }
        }
        if (flag.equals('B'))
        {
            p1.nave4.setOrientacion('V');
            p1.nave4.setTamaño(4);
            if (p1.nave4.orientacion.equals('V'))
            {               
                for (int i=0;i<p1.nave4.getTamaño();i++)
                {
                    panelTemp[p1.nave4.ubicacion.columna][p1.nave4.ubicacion.fila+i].setBackground(Color.black);
                }

            }
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_botonVerticalActionPerformed

    private void botonHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHorizontalActionPerformed
        // TODO add your handling code here:
        
        if (flag.equals('S'))
        {
            p1.nave2.setOrientacion('H');
            if (p1.nave2.orientacion.equals('H'))
            {
                for (int i=0;i<p1.nave2.getTamaño();i++)
                {
                    panelTemp[p1.nave2.ubicacion.columna+i][p1.nave2.ubicacion.fila].setBackground(Color.black);
                }
            }
        }
        
        if (flag.equals('A'))
        {
            p1.nave3.setOrientacion('H');
            p1.nave3.setTamaño(3);
            if (p1.nave3.orientacion.equals('H'))
            {
                for (int i=0;i<p1.nave3.getTamaño();i++)
                {
                    panelTemp[p1.nave3.ubicacion.columna+i][p1.nave3.ubicacion.fila].setBackground(Color.black);
                }
            }
        }
        if (flag.equals('B'))
        {
            p1.nave4.setOrientacion('H');
            p1.nave4.setTamaño(4);
            if (p1.nave4.orientacion.equals('H'))
            {
                for (int i=0;i<p1.nave4.getTamaño();i++)
                {
                    panelTemp[p1.nave4.ubicacion.columna+i][p1.nave4.ubicacion.fila].setBackground(Color.black);
                }
            }
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_botonHorizontalActionPerformed

    /**
     * @param args the command line arguments
     */
    
     public void jugadorDataOrientacion(Jugador p1, Character flag, Panel paneles[][])
    {
        this.p1=p1;
        this.flag=flag;
        this.panelTemp=paneles;
    }
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
            java.util.logging.Logger.getLogger(OrientacionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrientacionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrientacionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrientacionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrientacionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonHorizontal;
    private javax.swing.JButton botonVertical;
    // End of variables declaration//GEN-END:variables
}
