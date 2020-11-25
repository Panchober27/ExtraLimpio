/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import modeloDAO.ClienteDAO;
import modelo.Validaciones;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Recepcion extends javax.swing.JFrame {

    String fechaInicio;
    Date fechaActual = new Date();
    Calendar fechaActual2 = Calendar.getInstance();

    /**
     * Creates new form Recepcion
     */
    public Recepcion() {
        initComponents();
        /*
         * Codigo comuna para todas las interfaces, ver si se puede insertar de otra manera.
         */
        this.setTitle("Recepcion  Usuario: " + Login.identificador_usuario);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        jLabel_identificador_usuario.setText(Login.identificador_usuario);
        
        // Traemos la fecha y hora en un String desde Validaciones.getFecha()
        jLabel_fecha.setText(Validaciones.getFecha());

        // Metodos para hacer el boton transparente.
        btn_addCLienteI.setOpaque(false);
        btn_addCLienteI.setContentAreaFilled(false);
        btn_addCLienteI.setBorderPainted(false);
        // Se desactiva el boton hasta que se realize una busqueda.
        btn_addCLienteI.setEnabled(false);

        

        // Se desactiva el ComboBox hasta que se valide o cree un nuevo Cliente.
        cbx_servicios.setEnabled(false);

        /* Metodos para hacer el boton transparente.
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
         */
 /* Metodos para hacer el boton transparente.
        btnConfirmORD.setOpaque(false);
        btnConfirmORD.setContentAreaFilled(false);
        btnConfirmORD.setBorderPainted(false);
         */
        // Ocultando componentes. Se develeran en base al servicio elejido (cbx_servicio)
        ocultarPrendasComponentes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        jLabel_fecha = new javax.swing.JLabel();
        jLabel_identificador_usuario = new javax.swing.JLabel();
        img_abrigos = new javax.swing.JLabel();
        img_poleras = new javax.swing.JLabel();
        img_polerones = new javax.swing.JLabel();
        jLabel_abrigos = new javax.swing.JLabel();
        jLabel_poleras = new javax.swing.JLabel();
        jLabel_polerones = new javax.swing.JLabel();
        spinn_abrigos = new javax.swing.JSpinner();
        spinn_poleras = new javax.swing.JSpinner();
        spinn_polerones = new javax.swing.JSpinner();
        jLabel_cbx_servicios = new javax.swing.JLabel();
        cbx_servicios = new javax.swing.JComboBox<>();
        scroll_tablaUsuario = new javax.swing.JScrollPane();
        jTable_infoUsuario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_InstrucClientes = new javax.swing.JLabel();
        txt_rutCliente = new javax.swing.JTextField();
        btn_gestionarCliente = new javax.swing.JButton();
        txt_DVCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel_precio = new javax.swing.JLabel();
        jLabel_precio1 = new javax.swing.JLabel();
        jLabel_precio2 = new javax.swing.JLabel();
        btn_addCLienteI = new javax.swing.JButton();
        btnLockCLI = new javax.swing.JButton();
        btnConfirmORD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_addServicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("Interfaz Recepcion");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel_fecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 18, 241, 39));

        jLabel_identificador_usuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_identificador_usuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_identificador_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 453, 37));

        img_abrigos.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(img_abrigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 176, -1, -1));
        getContentPane().add(img_poleras, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 176, -1, -1));
        getContentPane().add(img_polerones, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 176, -1, -1));

        jLabel_abrigos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_abrigos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_abrigos.setText("Abrigos");
        getContentPane().add(jLabel_abrigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 326, -1, -1));

        jLabel_poleras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_poleras.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_poleras.setText("Poleras");
        getContentPane().add(jLabel_poleras, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 326, -1, -1));

        jLabel_polerones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_polerones.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_polerones.setText("Polerones");
        getContentPane().add(jLabel_polerones, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, 20));
        getContentPane().add(spinn_abrigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));
        getContentPane().add(spinn_poleras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));
        getContentPane().add(spinn_polerones, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel_cbx_servicios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_cbx_servicios.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cbx_servicios.setText("Servicios:");
        getContentPane().add(jLabel_cbx_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        cbx_servicios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cbx_servicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lavado y Planchado", "Solo Planchado", "Lavado por Carga" }));
        cbx_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_serviciosActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 204, -1));

        jTable_infoUsuario.setBackground(new java.awt.Color(0, 204, 204));
        jTable_infoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "rut", "Nombre", "Apellido Paterno", "Apellido Materno", "Direccion", "Email", "Telefono 1", "Telefono 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_infoUsuario.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTable_infoUsuario.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scroll_tablaUsuario.setViewportView(jTable_infoUsuario);

        getContentPane().add(scroll_tablaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 670, 38));

        jScrollPane2.setBackground(new java.awt.Color(0, 204, 204));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Servicios"));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "cod_servicio", "nombre_servicio", "descripcion", "precio"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 412, 118));

        jLabel_InstrucClientes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_InstrucClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_InstrucClientes.setText("Ingrese rut del Cliente:");
        getContentPane().add(jLabel_InstrucClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        txt_rutCliente.setBackground(new java.awt.Color(0, 204, 204));
        txt_rutCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_rutCliente.setForeground(new java.awt.Color(255, 255, 255));
        txt_rutCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutClienteActionPerformed(evt);
            }
        });
        txt_rutCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rutClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txt_rutCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 150, -1));

        btn_gestionarCliente.setBackground(new java.awt.Color(0, 0, 204));
        btn_gestionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_gestionarCliente.setText("Gestionar Cliente");
        btn_gestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gestionarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        txt_DVCliente.setBackground(new java.awt.Color(0, 204, 204));
        txt_DVCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_DVCliente.setForeground(new java.awt.Color(255, 255, 255));
        txt_DVCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DVClienteActionPerformed(evt);
            }
        });
        txt_DVCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DVClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txt_DVCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, 24, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 14, -1));

        jTextArea1.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion al servicio"));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 280, 130));

        jLabel_precio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_precio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_precio.setText("Valor: $1800 c/u");
        getContentPane().add(jLabel_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel_precio1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_precio1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_precio1.setText("Valor: $700 c/u");
        getContentPane().add(jLabel_precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel_precio2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_precio2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_precio2.setText("Valor: $1000c/u");
        getContentPane().add(jLabel_precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        btn_addCLienteI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addCliente.png"))); // NOI18N
        btn_addCLienteI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCLienteIActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addCLienteI, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 70, 60));

        btnLockCLI.setBackground(new java.awt.Color(255, 255, 51));
        btnLockCLI.setForeground(new java.awt.Color(255, 255, 255));
        btnLockCLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/icConfirmarCLI.png"))); // NOI18N
        getContentPane().add(btnLockCLI, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 300, 50, 40));

        btnConfirmORD.setBackground(new java.awt.Color(0, 255, 0));
        btnConfirmORD.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmORD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/icConfORD.png"))); // NOI18N
        btnConfirmORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmORDActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 440, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirmar Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 280, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar un Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar Orden Servicio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, -1, -1));

        btn_addServicio.setBackground(new java.awt.Color(0, 102, 204));
        btn_addServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/iconAccept.png"))); // NOI18N
        btn_addServicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_addServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar Servicio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        jLabel_fondo.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Venice Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que em base al Servicio elejido en el ComboBox, se desplieguen las
     * prendas que ese servicio admite y se oculten las prendas que el servicio
     * no admite
     *
     * @param evt
     */
    private void cbx_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_serviciosActionPerformed

        if (cbx_servicios.getSelectedIndex() == 0) {

            //Desplegando poleras.
            img_poleras.setVisible(true);
            jLabel_poleras.setVisible(true);
            spinn_poleras.setVisible(true);
            jLabel_precio1.setVisible(true);

            //Desplegando abrigos.
            img_abrigos.setVisible(true);
            jLabel_abrigos.setVisible(true);
            spinn_abrigos.setVisible(true);
            jLabel_precio.setVisible(true);

            // Polerones
            img_polerones.setVisible(false);
            jLabel_polerones.setVisible(false);
            spinn_polerones.setVisible(false);
            jLabel_precio2.setVisible(false);

        } else if (cbx_servicios.getSelectedIndex() == 1) {

            //Desplegando poleras.
            img_poleras.setVisible(true);
            jLabel_poleras.setVisible(true);
            spinn_poleras.setVisible(true);
            jLabel_precio1.setVisible(true);

            //Ocultando Abrigos. (Se refuerza instruccion desde el Constructor)
            img_abrigos.setVisible(false);
            jLabel_abrigos.setVisible(false);
            spinn_abrigos.setVisible(false);
            jLabel_precio.setVisible(false);

        } else if (cbx_servicios.getSelectedIndex() == 2) {

            //Desplegando polerones.
            img_polerones.setVisible(true);
            jLabel_polerones.setVisible(true);
            spinn_polerones.setVisible(true);
            jLabel_precio2.setVisible(true);

            //Desplegando poleras.
            img_poleras.setVisible(true);
            jLabel_poleras.setVisible(true);
            spinn_poleras.setVisible(true);
            jLabel_precio1.setVisible(true);

            //Desplegando abrigos.
            img_abrigos.setVisible(true);
            jLabel_abrigos.setVisible(true);
            spinn_abrigos.setVisible(true);
            jLabel_precio.setVisible(true);

        }

    }//GEN-LAST:event_cbx_serviciosActionPerformed

    private void txt_rutClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutClienteActionPerformed

    /**
     * Metodo que se ejecuta al presionar el btn_gestionarCliente; este metodo
     * valida que los campos hayan sido llenados y que contengan caracteres
     * validos.
     *
     * Luego utiliza el metodo checkCliente(); de la clase ClienteDAO para
     * buscar si existe ese rut en la base de datos o no.
     *
     * @param evt
     */
    private void btn_gestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionarClienteActionPerformed
        /*
        * Primero validar el campo con la clase modelo.Validaciones
        * luego comprobar si existe el rut en la bd con el metodo
        *          ClienteDAO.validRut(variable con valores del txt_rutCliente);
        *
        * Si la validacion arroja que si esta en la BD
        * se deberia asignar el Objeto cliente a la recepcion para
        * luego generar todo con los datos de ese cliente.
        *
        * hablar con profe de esto.
         */

        if (Validaciones.validarTxt(txt_rutCliente.getText()) && Validaciones.validarTxt(txt_DVCliente.getText())) {
            // Validar con rut que sea correcto.!!
            String rut = txt_rutCliente.getText() + "-" + txt_DVCliente.getText();
            if (ClienteDAO.checkCliente(rut)) {
                // Si hay
                JOptionPane.showMessageDialog(null, "El Cliente ya esta registrado bajo ese RUT se muestran valores", "Cliente Existente",
                        JOptionPane.WARNING_MESSAGE);
                // Se habilita el ComboBox una vez que se encontro y asigno el cliente (falta logica de otro boton.)
                cbx_servicios.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "El Cliente no esta registrado\n"
                        + "oprima el boton para añadir un nuevo clienteo vuelva a ingresar", "Cliente NO esta registrado",
                        JOptionPane.WARNING_MESSAGE);
                limpiarCampos();
                // Se activa el boton para ingresar un nuevo Cliente.
                btn_addCLienteI.setEnabled(true);
            }
        } else {

            if (!Validaciones.validarTxt(txt_rutCliente.getText())) {
                txt_rutCliente.setBackground(Color.red);
            }
            if (!Validaciones.validarTxt(txt_DVCliente.getText())) {
                txt_DVCliente.setBackground(Color.red);
            }
            JOptionPane.showMessageDialog(null, "Se deben llenar los campos de busqueda");
            // Se limpian los txt. esto se hace con un metodo privado de esta clase.
            limpiarCampos();

        }
    }//GEN-LAST:event_btn_gestionarClienteActionPerformed

    private void txt_DVClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DVClienteActionPerformed

    }//GEN-LAST:event_txt_DVClienteActionPerformed

    private void txt_rutClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutClienteKeyTyped
        Validaciones.validarNumero(evt);
    }//GEN-LAST:event_txt_rutClienteKeyTyped

    private void txt_DVClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DVClienteKeyTyped
        Validaciones.validarDV(evt, txt_DVCliente.getText());
    }//GEN-LAST:event_txt_DVClienteKeyTyped

    private void btn_addCLienteIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCLienteIActionPerformed
        new AddCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_addCLienteIActionPerformed

    private void btnConfirmORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmORDActionPerformed

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
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recepcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmORD;
    private javax.swing.JButton btnLockCLI;
    private javax.swing.JButton btn_addCLienteI;
    private javax.swing.JButton btn_addServicio;
    private javax.swing.JButton btn_gestionarCliente;
    private javax.swing.JComboBox<String> cbx_servicios;
    private javax.swing.JLabel img_abrigos;
    private javax.swing.JLabel img_poleras;
    private javax.swing.JLabel img_polerones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_InstrucClientes;
    private javax.swing.JLabel jLabel_abrigos;
    private javax.swing.JLabel jLabel_cbx_servicios;
    private javax.swing.JLabel jLabel_fecha;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JLabel jLabel_identificador_usuario;
    private javax.swing.JLabel jLabel_poleras;
    private javax.swing.JLabel jLabel_polerones;
    private javax.swing.JLabel jLabel_precio;
    private javax.swing.JLabel jLabel_precio1;
    private javax.swing.JLabel jLabel_precio2;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_infoUsuario;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane scroll_tablaUsuario;
    private javax.swing.JSpinner spinn_abrigos;
    private javax.swing.JSpinner spinn_poleras;
    private javax.swing.JSpinner spinn_polerones;
    private javax.swing.JTextField txt_DVCliente;
    private javax.swing.JTextField txt_rutCliente;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que oculta los componentes de las prendas(cant, $) hasta que se
     * valide el usaurio :)
     */
    private void ocultarPrendasComponentes() {
        img_abrigos.setVisible(false);
        jLabel_abrigos.setVisible(false);
        spinn_abrigos.setVisible(false);
        jLabel_precio.setVisible(false);

        // Poleras
        img_poleras.setVisible(false);
        jLabel_poleras.setVisible(false);
        spinn_poleras.setVisible(false);
        jLabel_precio1.setVisible(false);

        // Polerones
        img_polerones.setVisible(false);
        jLabel_polerones.setVisible(false);
        spinn_polerones.setVisible(false);
        jLabel_precio2.setVisible(false);
    }
    
    /**
     * Metodo para limpiar campos.
     */
    private void limpiarCampos() {
        txt_rutCliente.setBackground(new Color(0, 204, 204));
        txt_DVCliente.setBackground(new Color(0, 204, 204));
        jTextArea1.setText("");
    }

}
