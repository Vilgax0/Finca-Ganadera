/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finca_ganadera;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Comprar_ganado extends javax.swing.JFrame {
    
    static int peso =0;
    static int cantidad =0;
    static Scanner teclado = new Scanner(System.in);
    /**
     * Creates new form Comprar_ganado
     */
    public Comprar_ganado() {
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

        texto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        b_comprar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto.setBackground(new java.awt.Color(204, 204, 204));
        texto.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        texto.setForeground(new java.awt.Color(51, 51, 51));
        texto.setText("COMPRAR GANADO");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 400, 80));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel2.setText("Raza:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jLabel1.setText("Numero de potrero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel3.setText("Cantidad de ganado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        b_comprar.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        b_comprar.setText("COMPRAR");
        b_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comprarActionPerformed(evt);
            }
        });
        getContentPane().add(b_comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 140, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprar2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, 0, 1280, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_comprarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int suma = 0;
        
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas vacas quieres"));
       
        for (int i = 0; i < cantidad; i++) {
            peso = (int)(Math.random()*(250-100)+100);
            suma+=peso;
           
        }
            if (suma>800) {
                JOptionPane.showMessageDialog(null,"Hay demasiado peso, no puedes comprar todo mi rey");
            }else{
                JOptionPane.showMessageDialog(null,"compra exitosa");
            }
            JOptionPane.showMessageDialog(null, "suma de los pesos: " + suma + " Kilogramos");
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar_ganado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_comprar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
