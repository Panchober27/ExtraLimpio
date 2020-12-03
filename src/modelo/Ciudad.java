/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Ciudad {
    
    private int codCiudad;
    private String nombreCiudad;
    private int codRegion;

    public Ciudad() {
    }

    public Ciudad(int codCiudad, String nombreCiudad, int codRegion) {
        this.codCiudad = codCiudad;
        this.nombreCiudad = nombreCiudad;
        this.codRegion = codRegion;
    }

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(int codRegion) {
        this.codRegion = codRegion;
    }

    @Override
    public String toString() {
        return nombreCiudad;
    }
    
    
    
    
    
    /**
     * Metodo para cargar el comboBox en la interfaz, se implementa en el modelo para poder
     * acceder a los metodos getter de la clase.
     * @param codRegion
     * @return 
     */
    public Vector<Ciudad> cargaComboCiudades(int codRegion) {

        String sql = "select cod_ciudad, nombre_ciudad from ciudad where cod_region = '" + codRegion + "'";

        Vector<Ciudad> datos = new Vector<>();
        Ciudad data = null;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            data = new Ciudad();
            data.setCodRegion(0);
            data.setNombreCiudad("Seleccione Ciudad");
            datos.add(data);
            
            while (rs.next()) {
                data = new Ciudad();
                data.setCodCiudad(rs.getInt("cod_ciudad"));
                data.setNombreCiudad(rs.getString("nombre_ciudad"));
                datos.add(data);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error carga ciudades", "error al cargar el combo ciudades", JOptionPane.ERROR_MESSAGE);
        }
        
        return datos;
    }
    
    
    
}
