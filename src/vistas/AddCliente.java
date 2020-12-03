/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.Cliente;
import modelo.Validaciones;
import modeloDAO.CiudadDAO;
import modeloDAO.ClienteDAO;
import modeloDAO.ComunaDAO;
import modeloDAO.RegionDAO;

/**
 * Interfaz de la Vista para Añadir un nuevo Cliente a la Base de Datos Contiene
 * diversos tetxFields, comboBox, para recibir los parametros de un Cliente y
 * luego de ser validados, se enviaran a ModeloDAO.addCliente(); para realizar
 * la inserción del nuevo Cliente.
 *
 * @author Francisco
 */
public class AddCliente extends javax.swing.JFrame {

    /**
     * Creates new form AddCliente
     */
    public AddCliente() {
        initComponents();
        /*
         * Codigo comuna para todas las interfaces, ver si se puede insertar de otra manera.
         */
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        // Metodo para que al cerrar esta interfaz el programa no se detenga.
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Se asignan las credenciales de Usuario al titulo de la Interfaz.
        this.setTitle("Añadir Cliente: " + Login.identificador_usuario);
        jLabel_identificador_usuario.setText(Login.identificador_usuario);

        // Traemos la fecha y hora en un String desde Validaciones.getFecha()
        jLabel_fecha.setText(Validaciones.getFecha());

        /*Setear Los JOptionPane.
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.black);
        UI.put("Panel.background", Color.black);
        */
        
        // Cargar ComboBox Comunas.
        /*
            Se debe cargar el cbx_regiones -> depende de ese la carga de los demas.
         */
        cargarCbxRegiones();
        cargarCbxCiudades();
        cargarCbxComunas();
        
        

        // Metodos para hacer el boton transparente.
        btn_addCliente.setOpaque(false);
        btn_addCliente.setContentAreaFilled(false);
        btn_addCliente.setBorderPainted(false);

        // Metodos para hacer el boton transparente.
        btn_ListaClientes.setOpaque(false);
        btn_ListaClientes.setContentAreaFilled(false);
        btn_ListaClientes.setBorderPainted(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        jLabel_identificador_usuario = new javax.swing.JLabel();
        jLabel_fecha = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidoPat = new javax.swing.JTextField();
        txt_apellidoMat = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        txt_telefono1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_DV = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_addCliente = new javax.swing.JButton();
        cbx_Comuna = new javax.swing.JComboBox<>();
        btn_ListaClientes = new javax.swing.JButton();
        cbx_Region = new javax.swing.JComboBox<>();
        cbx_Ciudad = new javax.swing.JComboBox<>();
        txt_telefono2 = new javax.swing.JTextField();
        txt_telefono3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox_telefono2 = new javax.swing.JCheckBox();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("Interfaz Añadir Cliente");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel_identificador_usuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_identificador_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 30));

        jLabel_fecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 241, 39));

        txt_nombres.setBackground(new java.awt.Color(0, 102, 153));
        txt_nombres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 110, 160, -1));

        txt_apellidoPat.setBackground(new java.awt.Color(0, 102, 153));
        txt_apellidoPat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_apellidoPat.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellidoPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoPatKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellidoPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 163, 160, -1));

        txt_apellidoMat.setBackground(new java.awt.Color(0, 102, 153));
        txt_apellidoMat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_apellidoMat.setForeground(new java.awt.Color(255, 255, 255));
        txt_apellidoMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoMatKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellidoMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 213, 160, -1));

        txt_direccion.setBackground(new java.awt.Color(0, 102, 153));
        txt_direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 266, 160, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 114, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido Paterno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido Materno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 221, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 323, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rut:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono Celular:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        txt_rut.setBackground(new java.awt.Color(0, 204, 204));
        txt_rut.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_rut.setForeground(new java.awt.Color(255, 255, 255));
        txt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rutKeyTyped(evt);
            }
        });
        getContentPane().add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 160, -1));

        txt_telefono1.setBackground(new java.awt.Color(0, 204, 204));
        txt_telefono1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_telefono1.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefono1KeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 160, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 15, -1));

        txt_DV.setBackground(new java.awt.Color(0, 204, 204));
        txt_DV.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_DV.setForeground(new java.awt.Color(255, 255, 255));
        txt_DV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DVKeyTyped(evt);
            }
        });
        getContentPane().add(txt_DV, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 24, -1));

        txt_email.setBackground(new java.awt.Color(0, 102, 153));
        txt_email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 319, 160, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Asignar txt_tipoTelefono, mas opcion de añadir otro telefono");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        btn_addCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        btn_addCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        cbx_Comuna.setBackground(new java.awt.Color(0, 102, 153));
        cbx_Comuna.setForeground(new java.awt.Color(255, 255, 255));
        cbx_Comuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ComunaActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_Comuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 120, -1));

        btn_ListaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/listaClientes.png"))); // NOI18N
        btn_ListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        cbx_Region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_RegionActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_Region, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 350, 270, -1));

        cbx_Ciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        txt_telefono2.setBackground(new java.awt.Color(0, 204, 204));
        txt_telefono2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_telefono2.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefono2KeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 160, -1));

        txt_telefono3.setBackground(new java.awt.Color(0, 204, 204));
        txt_telefono3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_telefono3.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefono3KeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 160, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefono 2 especifique tipo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Numero telefono(2):");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jCheckBox_telefono2.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox_telefono2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_telefono2.setText("Otro Número");
        jCheckBox_telefono2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jCheckBox_telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        jLabel_fondo.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Venice Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        Validaciones.validarLetras(evt);
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_apellidoPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoPatKeyTyped
        Validaciones.validarLetras(evt);
    }//GEN-LAST:event_txt_apellidoPatKeyTyped

    private void txt_apellidoMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoMatKeyTyped
        Validaciones.validarLetras(evt);
    }//GEN-LAST:event_txt_apellidoMatKeyTyped

    /**
     * Este metodo se realiza validaciones sobre los datos ingresados en la
     * interfaz y en base a ese resultado puede instanciar a
     * modeloDAO.ClienteDAO.addCliente(); para ingresar un nuevo Cliente con los
     * atributos seteados desde la interfaz.
     *
     * @param evt Se genera cuando el usuario presiona el boton: btn_addCliente.
     */
    private void btn_addClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addClienteActionPerformed

        if (validarCampos()) {
            if (Validaciones.validarEmail(txt_email.getText())) {
                JOptionPane.showMessageDialog(null, "Eso es un correo");
                /*
                * Asignar un metodo de validacion que verifique si el Cliente ya
                * existe en la base de datos, si es asi denegar la opcion de añadir al cliente.
                 */
                
                
                // Se revisa que el cliente exista o no en la BD en base al RUT
                if (ClienteDAO.checkCliente(txt_rut.getText() + "-" + txt_DV.getText())) {
                    // Existe NO se puede
                    JOptionPane.showMessageDialog(null, "El Cliente ya esta registrado bajo ese RUT","Cliente Existente",JOptionPane.WARNING_MESSAGE);
                } else {
                    // Esta Libre

                    if (cbx_Comuna.getSelectedIndex() + 1 == 1) {
                        addCliente();
                        addedCliente();

                    } else {

                        JOptionPane.showMessageDialog(null, "La comuna seleccionada aun no a sido introducida\n"
                                + "a nuestro sistema :(");
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "EL correo ingresado no es valido","Correo Invalido!",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los cmapos.","Campos Vacios",
                    JOptionPane.WARNING_MESSAGE);
            limpiarCampos();
        }


    }//GEN-LAST:event_btn_addClienteActionPerformed

    private void txt_telefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefono1KeyTyped
        Validaciones.validarNumero(evt);
    }//GEN-LAST:event_txt_telefono1KeyTyped

    private void txt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutKeyTyped
        Validaciones.validarNumero(evt);
    }//GEN-LAST:event_txt_rutKeyTyped

    private void txt_DVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DVKeyTyped
        Validaciones.validarDV(evt, txt_DV.getText());
    }//GEN-LAST:event_txt_DVKeyTyped

    private void btn_ListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaClientesActionPerformed
        new ListarClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ListaClientesActionPerformed

    private void txt_telefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefono2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono2KeyTyped

    private void txt_telefono3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefono3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono3KeyTyped

    private void cbx_ComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ComunaActionPerformed
        
    }//GEN-LAST:event_cbx_ComunaActionPerformed

    private void cbx_RegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_RegionActionPerformed
        //cargarCbxComunas();
    }//GEN-LAST:event_cbx_RegionActionPerformed

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
            java.util.logging.Logger.getLogger(AddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ListaClientes;
    private javax.swing.JButton btn_addCliente;
    private javax.swing.JComboBox<String> cbx_Ciudad;
    private javax.swing.JComboBox<String> cbx_Comuna;
    private javax.swing.JComboBox<String> cbx_Region;
    private javax.swing.JCheckBox jCheckBox_telefono2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_fecha;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JLabel jLabel_identificador_usuario;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JTextField txt_DV;
    private javax.swing.JTextField txt_apellidoMat;
    private javax.swing.JTextField txt_apellidoPat;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_rut;
    private javax.swing.JTextField txt_telefono1;
    private javax.swing.JTextField txt_telefono2;
    private javax.swing.JTextField txt_telefono3;
    // End of variables declaration//GEN-END:variables

    /*
     * Metodo que valida que los componentes TXT hayan sido llenados
     * por el usuario, en caso de que falte alguno, este metodo lo pintara
     * en la interfaz. Utiliza Validaciones.validarTXT();
     */
    /**
     * Metodo que revisa que los campos hayan sido llenados, si fueron llenados
     * se podra ejecutar el codigo del btn_addCliente;
     *
     * @return true si los campos han sido llenados y false si alguno esta
     * vacio.
     */
    private boolean validarCampos() {

        boolean x = true;

        if (!Validaciones.validarTxt(txt_DV.getText())) {
            txt_DV.setBackground(Color.red);
            x = false;
        }
        if (!Validaciones.validarTxt(txt_rut.getText())) {
            txt_rut.setBackground(Color.red);
            x = false;
        }
        if (!Validaciones.validarTxt(txt_nombres.getText())) {
            txt_nombres.setBackground(Color.red);
            x = false;
        }
        if (!Validaciones.validarTxt(txt_apellidoPat.getText())) {
            txt_apellidoPat.setBackground(Color.red);
            x = false;
        }
        if (!Validaciones.validarTxt(txt_apellidoMat.getText())) {
            txt_apellidoMat.setBackground(Color.red);
            x = false;
        }
        if (!Validaciones.validarTxt(txt_direccion.getText())) {
            txt_direccion.setBackground(Color.red);
            x = false;
        }
        if (!Validaciones.validarTxt(txt_email.getText())) {
            txt_email.setBackground(Color.red);
            x = false;
        }
        if (!Validaciones.validarTxt(txt_telefono1.getText())) {
            txt_telefono1.setBackground(Color.red);
            x = false;
        }

        return x;
    }

    /**
     * Metodo que vacia los componentes TXT.
     */
    private void limpiarCampos() {

        txt_DV.setText("");
        txt_apellidoMat.setText("");
        txt_apellidoPat.setText("");
        txt_direccion.setText("");
        txt_email.setText("");
        txt_nombres.setText("");
        txt_rut.setText("");
        txt_telefono1.setText("");

        txt_DV.setBackground(new Color(0, 204, 204));
        txt_apellidoMat.setBackground(new Color(0, 102, 153));
        txt_apellidoPat.setBackground(new Color(0, 102, 153));
        txt_direccion.setBackground(new Color(0, 102, 153));
        txt_email.setBackground(new Color(0, 102, 153));
        txt_nombres.setBackground(new Color(0, 102, 153));

        txt_rut.setBackground(new Color(0, 204, 204));
        txt_telefono1.setBackground(new Color(0, 204, 204));

    }

    /**
     * Metodo que se usa ejecuta vez que se ingreso sin problemas un cliente a
     * la base de datos.
     */
    private void addedCliente() {
        txt_DV.setBackground(Color.green);
        txt_apellidoMat.setBackground(Color.green);
        txt_apellidoPat.setBackground(Color.green);
        txt_direccion.setBackground(Color.green);
        txt_email.setBackground(Color.green);
        txt_nombres.setBackground(Color.green);
        txt_rut.setBackground(Color.green);
        txt_telefono1.setBackground(Color.green);
        JOptionPane.showMessageDialog(null, "Se ingreso un cliente a la base de datos.");
        limpiarCampos();
    }

    /**
     * Metodo para Añadir un cliente a la base de datos utilizando la Clase
     * ClienteDAO y su metodo addCliente();
     */
    private void addCliente() {
        Cliente cli = new Cliente();
        
        
        // Forma anterior de añadir un Cliente, metodo por metodo (setXXX, setYYYY, SetOOO).
        //int idCliente = null;
        String rut = txt_rut.getText() + "-" + txt_DV.getText();
        String nombres = txt_nombres.getText();
        String apePat = txt_apellidoPat.getText();
        String apeMat = txt_apellidoMat.getText();
        String direccion = txt_direccion.getText();
        String email = txt_email.getText();
        
        int codComuna = 15; //-> Agregar mediante comboBox.!!!!!
        
        // Añadiendo Cliente al modelo, utilizando el constructor con parametros.
        Cliente cli2 = new Cliente(codComuna, rut, nombres, apePat, apeMat, direccion, email, codComuna);
        
        cli.setRutCliente(rut);
        cli.setNombresCliente(nombres);
        cli.setApellidoPat(apePat);
        cli.setApellidoMat(apeMat);
        cli.setDireccion(direccion);
        cli.setEmail(email);
        cli.setCodComuna(codComuna);
        
        ClienteDAO.addCliente(cli2);

    }
    
    /**
     * Metodo para llenar las ciudades.
     */
    private void cargarCbxCiudades() {
        for (Object obj : CiudadDAO.listarCiudades(cbx_Region.getSelectedIndex())) {
            cbx_Region.addItem((String) obj.toString());
        }
    }
    
    
    /**
     * Metodo para cargar el cbx con regiones desde la base de datos.
     */
    private void cargarCbxRegiones(){
        for (Object obj : RegionDAO.listaRegiones) {
            cbx_Region.addItem((String) obj.toString());
        }
    }
    
    
    /**
     * Metodo para cargar las comunas, en el futuro este metodo va a depender de
     * que los cbx_Region y cbx_Ciudad esten validados.
     *
     * por ahora lo haremos funcionar nomas.
     */
    private void cargarCbxComunas() {
        for (Object obj : ComunaDAO.listarComunas(cbx_Ciudad.getSelectedIndex())) { // AQUI SE CAMBIO EL METODO, REVISA GIT!!!
            cbx_Comuna.addItem((String) obj.toString());
        }
    }

    
    
    /**
     * Acabo de hacer un cambio al metodo para cargar la comuna, pero el problema vendra al 
     * hacer que ese metodo cargue la impresion de 
     */
    
    
    
}
