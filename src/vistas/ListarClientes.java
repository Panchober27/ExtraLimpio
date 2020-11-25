/**
 * Generar documentaciones.
 */
package vistas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modeloDAO.ClienteDAO;
import modelo.Validaciones;

/**
 * Clase Interfaz que despliega un listado de los Clientes registrados en la
 * Base de Datos.
 *
 * @author Francisco
 */
public class ListarClientes extends javax.swing.JFrame {

    // permite saber cual es el Cliente que se consulta desde esta inerfaz "Gestionar Usuario"
    public static String cliente_update = "";
    ArrayList<Cliente> lista = ClienteDAO.listarClientes();

    /**
     * Creates new form ListarClientes
     */

    public ListarClientes() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        jLabel_identificador_usuario.setText(Login.identificador_usuario);
        
        
        this.setTitle("Listado de Clientes. Usuario: " + jLabel_identificador_usuario.getText());

        // Traemos la fecha y hora en un String desde Validaciones.getFecha()
        jLabel_fecha.setText(Validaciones.getFecha());

        // Metodos para hacer el boton transparente.
        btn_addCliente.setOpaque(false);
        btn_addCliente.setContentAreaFilled(false);
        btn_addCliente.setBorderPainted(false);

        

        // Se activa el metodo que llene la tabla de datos.
        llenarTablaClientes();

        // Metodo para saber cual es el item seleccionado desde la tabla
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cliente = new javax.swing.JTable();
        btn_addCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_identificador_usuario = new javax.swing.JLabel();
        jLabel_fecha = new javax.swing.JLabel();
        jLabel_InstrucClientes = new javax.swing.JLabel();
        txt_rutCliente = new javax.swing.JTextField();
        txt_DVCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_gestionarCliente = new javax.swing.JButton();
        btn_confCLI = new javax.swing.JButton();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable_Cliente.setBackground(new java.awt.Color(153, 255, 255));
        jTable_Cliente.setForeground(new java.awt.Color(0, 0, 0));
        jTable_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id Cliente", "Rut", "Nombres", "Apellido Paterno", "Apellido Materno", "Email", "Direccion", "Codigo Comuna"
            }
        ));
        jScrollPane1.setViewportView(jTable_Cliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 686, 100));

        btn_addCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        btn_addCliente.setToolTipText("");
        btn_addCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Cliente a la Base de datos.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel_identificador_usuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_identificador_usuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_identificador_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 14, 453, 37));

        jLabel_fecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 69, 241, 39));

        jLabel_InstrucClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_InstrucClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_InstrucClientes.setText("Buscar Cliente:");
        getContentPane().add(jLabel_InstrucClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

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
        getContentPane().add(txt_rutCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 150, -1));

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
        getContentPane().add(txt_DVCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 24, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 14, -1));

        btn_gestionarCliente.setBackground(new java.awt.Color(0, 0, 204));
        btn_gestionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_gestionarCliente.setText("Gestionar Cliente");
        btn_gestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gestionarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        btn_confCLI.setBackground(new java.awt.Color(0, 102, 153));
        btn_confCLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos/icConfigCLI.png"))); // NOI18N
        btn_confCLI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_confCLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confCLIActionPerformed(evt);
            }
        });
        getContentPane().add(btn_confCLI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 40));

        jLabel_fondo.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Venice Blue.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addClienteActionPerformed
        new AddCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_addClienteActionPerformed

    private void txt_rutClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutClienteActionPerformed

    private void txt_rutClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutClienteKeyTyped
        Validaciones.validarNumero(evt);
    }//GEN-LAST:event_txt_rutClienteKeyTyped

    private void txt_DVClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DVClienteActionPerformed

    }//GEN-LAST:event_txt_DVClienteActionPerformed

    private void txt_DVClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DVClienteKeyTyped
        Validaciones.validarDV(evt, txt_DVCliente.getText());
    }//GEN-LAST:event_txt_DVClienteKeyTyped

    private void btn_gestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionarClienteActionPerformed
        /*
        * Se busca al cliente en la base de datos, y si se encuentra se Despliega interfaz
        * InfoCliente.java (por crear!).
         */
        JOptionPane.showMessageDialog(null, "Se busca al cliente en la base de datos\n"
                + "y si se encuentra se Despliega interfaz InfoCliente.java (por crear!).");


    }//GEN-LAST:event_btn_gestionarClienteActionPerformed

    private void btn_confCLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confCLIActionPerformed
        new InfoCliente().setVisible(true);
    }//GEN-LAST:event_btn_confCLIActionPerformed

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
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCliente;
    private javax.swing.JButton btn_confCLI;
    private javax.swing.JButton btn_gestionarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_InstrucClientes;
    private javax.swing.JLabel jLabel_fecha;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JLabel jLabel_identificador_usuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Cliente;
    private javax.swing.JTextField txt_DVCliente;
    private javax.swing.JTextField txt_rutCliente;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que llena la tabla jTable_Cliente con datos, utilizando el metodo
     * ClienteDAO.listarClientes();
     *
     * Se crea una variable ArrayList listaVCliente =
     * ClienteDAO.listarClientes(); eso nos retorna un objeto ArrayList Cliente
     * llenado con este metodo desde la base de datos, luego utilizando una
     * Matriz = matrix. desplegamos los atributos del ArrayList cliente.
     */
    public void llenarTablaClientes() {
        String matrix[][] = new String[lista.size()][4];

        for (int i = 0; i < lista.size(); i++) {
            matrix[i][0] = lista.get(i).getRutCliente();
            matrix[i][1] = lista.get(i).getNombresCliente();
            matrix[i][2] = lista.get(i).getApellidoPat();
            matrix[i][3] = lista.get(i).getApellidoMat();

        }

        jTable_Cliente.setModel(new javax.swing.table.DefaultTableModel(
                matrix,
                new String[]{
                    "Rut", "Nombres", "Apellido Paterno", "Apellido Materno"
                }
        ));

    }

    /*
    Metodo anterior, que recuperaba todos los datos del Cliente, desde el ModeloDAO
     */
    // Metodo para saber que item de la tabla fue pinchado.
    
    
    
}
