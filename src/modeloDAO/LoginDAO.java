/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * SE DEBEN CAMBIAR LAS CONSULTAS DE TODAS LAS VARIABLES SQL!!!!!
 */
/**
 * Clase que contiene validaciones conectadas a la base de datos
 * para realizar el inicio de sesion del vendedor y traer los datos que
 * se desplegaran como credencialesVendedor.
 * @author Francisco
 */
public class LoginDAO {

    public boolean x;
    public int banderaUserName;
    public int y;
    public String username; // Almacena el nom_usuario para registrarlo en los cambios a bd.
    String nombres;
    String apellidoPat;
    String rut;

    /**
     * Metodo que realiza el proceso de logeo al sistema, utilizando como credenciales
     * el username y la password de los Vendedores desde la Base de Datos.
     * @param user: String que recibe el nombre de usuario ingresado por el vendedor en la interfaz.
     * @param password: String que recibe la password ingresado por el vendedor en la interfaz.
     * @return true: Si existe un Vendedor en la base de datos que tenga ese username y password
     *          false: Si NO existe un vendedor en la base de datos que tenga esas credenciales.
     */
    public boolean Logear(String user, String password) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "SELECT nombres, apellidoPat, apellidoMat FROM vendedor WHERE username = '" + user
                    + "' AND password = '" + password + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) { // la consulta fue exitosa.
                x = true;
                cn.close();
            } else {
                x = false;
                cn.close();
            }
        } catch (SQLException e) {
            System.out.println("error: " + e);
            JOptionPane.showMessageDialog(null, "Error al conectar a la bd");
        }
        return x;
    }

    
    /**
     * Metodo que trae una cadena de caracteres designados por el equipo de trabajo como
     * las credenciales de los Vendedores.
     * @param username: recibe el username ingresado en la interfaz
     * @return una String que contiene los atributos seleccionados como credenciales del usuario(vendedor).
     */
    public String userName(String username) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT nombres, apellidoPat, rut_vendedor FROM vendedor WHERE username = '" + username + "'");

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombres = rs.getString("nombres");
                apellidoPat = rs.getString("apellidoPat");
                rut = rs.getString("rut_vendedor");

                // Para recuperar rut a traves de nombres solo demosrtativo.
                //nombres = rs.getString("rut");
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el nombre de usuario en la bd.");
            return null;
        }
        return nombres + " " + apellidoPat + "/ rut: " + rut;
        //return rut;

    }

}
