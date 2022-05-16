/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finca_ganadera;

import static finca_ganadera.Pagina_principal.potrero1;
import static finca_ganadera.Pagina_principal.potrero5;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Mover_ganado extends javax.swing.JFrame {

    /**
     * Creates new form Mover_ganadoo
     */
    public Mover_ganado() {
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

        mover = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        b_volver = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setPreferredSize(new java.awt.Dimension(730, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mover.setBackground(new java.awt.Color(204, 204, 255));
        mover.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        mover.setText("Mover ganado");
        mover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });
        getContentPane().add(mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 170, 30));

        añadir.setBackground(new java.awt.Color(204, 204, 255));
        añadir.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        añadir.setText("Añadir ganado");
        añadir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        getContentPane().add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, 30));

        b_volver.setBackground(new java.awt.Color(153, 204, 255));
        b_volver.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        b_volver.setText("Volver al menú principal");
        b_volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volverActionPerformed(evt);
            }
        });
        getContentPane().add(b_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        titulo.setFont(new java.awt.Font("Sitka Banner", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("CONFIGURACIÓN POTREROS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 580, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_ganado.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, -80, 1230, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverActionPerformed
        // TODO add your handling code here:
        int potrero=Integer.parseInt(JOptionPane.showInputDialog("De que potrero desea mover las reses"));
        int potrero_s=Integer.parseInt(JOptionPane.showInputDialog("A que potrero desea mover las reses"));
        int nro_reses=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas reses desea mover?"));
        String raza=JOptionPane.showInputDialog("Ingrese La raza");

        if (potrero>0 && potrero<4){
            switch(potrero){
                case 1:
                if (potrero_s > 4 && potrero_s < 9) {
                    for (int i = 0; i < nro_reses; i++) {
                        potrero5[i]  = potrero1[i];
                        potrero1[i] = "";
                    }
                    JOptionPane.showMessageDialog(null, "movimiento realizado");

                    for (int i = 0; i < potrero5.length; i++) {
                        System.out.println(potrero5[i]);
                    }

                }

            }

        }else{
            JOptionPane.showMessageDialog(null, "error en el numero de los potreros");
        }
    }//GEN-LAST:event_moverActionPerformed

    private void b_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Pagina_principal a = new Pagina_principal();
        a.setVisible(true);
    }//GEN-LAST:event_b_volverActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        // TODO add your handling code here:
        int potrero = Integer.parseInt(JOptionPane.showInputDialog("¿A qué potrero deseas agregar?"));
        int cant_nuevaa = Integer.parseInt(JOptionPane.showInputDialog("Cuantas vacas deseas añadir"));
        
        if (potrero > 8) {
            JOptionPane.showMessageDialog(null, "El potrero que elegiste no es valido");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha añadido correctamente");
        }
    }//GEN-LAST:event_añadirActionPerformed

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
            java.util.logging.Logger.getLogger(Mover_ganado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mover_ganado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mover_ganado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mover_ganado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mover_ganado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadir;
    private javax.swing.JButton b_volver;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton mover;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
