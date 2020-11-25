/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.Validaciones;
import static vistas.Vendedor.identificador_usuario;

/**
 *
 * @author Francisco
 */
public class ListaBoletas extends javax.swing.JFrame {
    
    public static String identificador_usuario;
    public String fechaOficial;
    
    /**
     * Creates new form Boleta
     */
    public ListaBoletas() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        identificador_usuario = Login.identificador_usuario;
        
        jLabel_identificador_usuario.setText(identificador_usuario);
        this.setTitle("Vendedor: " + identificador_usuario);
        
        // Traemos la fecha y hora en un String desde Validaciones.getFecha()
        jLabel_fecha.setText(Validaciones.getFecha());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_fecha = new javax.swing.JLabel();
        jLabel_identificador_usuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_BoletasEmitidas = new javax.swing.JTable();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de Boletas Emitidas.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel_fecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 241, 39));

        jLabel_identificador_usuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_identificador_usuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_identificador_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 453, 37));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Boletas Emitidas"));

        jTable_BoletasEmitidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_BoletasEmitidas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 79));

        jLabel_fondo.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Venice Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListaBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaBoletas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_fecha;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JLabel jLabel_identificador_usuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_BoletasEmitidas;
    // End of variables declaration//GEN-END:variables
}
