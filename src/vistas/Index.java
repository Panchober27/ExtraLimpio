/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;

/**
 *
 * @author Francisco
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
        /*
         * Codigo comuna para todas las interfaces, ver si se puede insertar de otra manera.
        */
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        
        /*
        // Metodos para hacer el boton transparente.
        btn_docs.setOpaque(false);
        btn_docs.setContentAreaFilled(false);
        btn_docs.setBorderPainted(false);
        */
        
        // Metodos para hacer el boton transparente.
        btn_Login.setOpaque(false);
        btn_Login.setContentAreaFilled(false);
        btn_Login.setBorderPainted(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_docs = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Extra Limpio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 16, -1, -1));

        btn_Login.setForeground(new java.awt.Color(255, 255, 255));
        btn_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tecnico.png"))); // NOI18N
        btn_Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 77, 70));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingreso Vendedor.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        btn_docs.setBackground(new java.awt.Color(0, 102, 153));
        btn_docs.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btn_docs.setForeground(new java.awt.Color(0, 0, 0));
        btn_docs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/icDocs.png"))); // NOI18N
        btn_docs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_docs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_docsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_docs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 40, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Como correr el programa?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel_fondo.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Venice Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_docsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_docsActionPerformed
        
        new Docs().setVisible(true);
    }//GEN-LAST:event_btn_docsActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_docs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_fondo;
    // End of variables declaration//GEN-END:variables
}
