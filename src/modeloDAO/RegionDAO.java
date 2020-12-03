/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.util.ArrayList;
import modelo.Region;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Francisco
 */
public class RegionDAO {

    public static ArrayList<Region> listaRegiones = listarRegiones();
    
    
    /**
     * Metodo que retorna Objeto ArrayList de la Clase Region. 
     * @return Lista de Objetos de la Clase Region con los atributos que tengan en la BD
     */
    private static ArrayList listarRegiones() {
        
        ArrayList<Region> lista = new ArrayList<>();
        
        try {
            
            String sql = "select cod_region, nombre_region from region";
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Region reg = new Region();
                reg.setCodRegion(rs.getInt("cod_region"));
                reg.setNombreRegion(rs.getString("nombre_region"));
                lista.add(reg);
            }
            cn.close();
            pst.close();
            rs.close();
            Conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error en la consulta listarRegiones():  " + e);
        }
        return lista;
    }

}
