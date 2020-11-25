/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Clase Conexion. Esta clase contiene metodos para conectarse Y desconectarse de una Base de Datos.
 * @author Francisco
 */
public class Conexion {
    
    private static String url = "jdbc:mysql://localhost/extra_limpio";
    private static String usr = "root";
    private static String pass = "";
    private static Connection cn;
    
    /**
     * Metodo para conectarse a la BD extra_limpio.
     * Este metodo sera instanciado cada vez que se requiera realizar alguna consulta sql.
     * @return Conexion a la Base de Datos 'extra_limpio'
     */ 
    public static Connection conectar(){
        try {
            cn = DriverManager.getConnection(url, usr, pass);
            //System.out.println("Conexion exitosa");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local \n"
                    + "ERROR: " + e);
            JOptionPane.showMessageDialog(null, e,"Error en la Conexion a la Base de Datos.",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    /**
     * Metodo para cerrar la conexion a la Base de Datos.
     * Este metodo sera instanciado, cada vez que se ejecute una consulta sql.
     */
    public static void cerrarConexion(){
        try {
            
            cn = null;
            System.out.println("Conexion cerrada");
            
        } catch (Exception e) {
            System.err.println("Error de DESconexion: " + e);
        }
    }
    
    
    
    
}
