/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import javax.swing.JOptionPane;

import modelo.Validaciones;
import modeloDAO.VendedorDAO;

/**
 * Clase Interfaz que realiza el ingreso de un Vendedor al sistema, utilizando su username y password.
 * @author Francisco
 */
public class Login extends javax.swing.JFrame {
    
    
    public static String identificador_usuario;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        /*
         * Codigo comuna para todas las interfaces, ver si se puede insertar de otra manera.
        */
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        // Metodo para que al cerrar esta interfaz el programa no se detenga.
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        
        // Metodos para hacer el boton transparente.
        btn_logear.setOpaque(false);
        btn_logear.setContentAreaFilled(false);
        btn_logear.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_logear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingreso Vendedores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        txt_username.setBackground(new java.awt.Color(0, 153, 204));
        txt_username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, -1));

        txt_password.setBackground(new java.awt.Color(0, 153, 204));
        txt_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, -1));

        btn_logear.setBackground(new java.awt.Color(51, 255, 51));
        btn_logear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_logear.setForeground(new java.awt.Color(255, 255, 255));
        btn_logear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/icLogin.png"))); // NOI18N
        btn_logear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, -1));

        jLabel_fondo.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Venice Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logearActionPerformed
        
        Validaciones valid = new Validaciones();
        VendedorDAO logdao = new VendedorDAO();
        
        if(valid.validarTxt(txt_username.getText()) && valid.validarTxt(txt_password.getText())){// Los campos estan llenos (true)
            
            if(logdao.Logear(txt_username.getText(), txt_password.getText())){ //Existe el usuario en la bd. (true)
                identificador_usuario = logdao.userName(txt_username.getText());
                new Vendedor().setVisible(true);
                this.dispose();   
            } else {
                JOptionPane.showMessageDialog(null, "Nombre de Usuario y/o Contraseña INCORRECTOS!", "Erorr en user y/o pass",JOptionPane.ERROR_MESSAGE);
                limpiarCampos();
            }
        } else {
            if(!valid.validarTxt(txt_username.getText())){// El campo esta vacio (false)
                txt_username.setBackground(Color.red);
            }
            if(!valid.validarTxt(txt_password.getText())){// El campo esta vacio (false)
                txt_password.setBackground(Color.red);
            }
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Campos Vacios",JOptionPane.WARNING_MESSAGE);
            limpiarCampos();
        }
        
        
        
        
    }//GEN-LAST:event_btn_logearActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Metodo que vacia los componentes TXT
     */
    private void limpiarCampos(){
        txt_username.setBackground(new Color(0,153,204));
        txt_username.setText("");
        
        txt_password.setBackground(new Color(0,153,204));
        txt_password.setText("");
    }
    
    
}
