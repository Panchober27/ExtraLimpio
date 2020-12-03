/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;


import java.util.ArrayList;
import modelo.Ciudad;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Francisco
 */
public class CiudadDAO {
    
    // Lo comento para evitar errores al almacenar los cambios. ojala funcione :)
    //public static ArrayList<Ciudad> listaCiudades = listarCiudades();
    
    
    /**
     * Metodo que trae una Lista de las Ciudades y sus atributos desde la Base de Datos.
     * @return 
     */
    public static ArrayList listarCiudades(int reg){
        
        ArrayList<Ciudad> lista = new ArrayList<>();
        try {
            String sql = "select cod_ciudad, nombre_ciudad, cod_region from ciudad where cod_region = '" + reg + "'";
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Ciudad ciud = new Ciudad();
                ciud.setCodCiudad(rs.getInt("cod_ciudad"));
                ciud.setNombreCiudad(rs.getString("nombre_ciudad"));
                ciud.setCodRegion(rs.getInt("cod_region"));
                
                lista.add(ciud);
            }
            cn.close();
            pst.close();
            rs.close();
            Conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error en la consulta listarCiudades():  " + e);
        }
        return lista;
    }
    
}
