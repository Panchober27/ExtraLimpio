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
public class Region {
    
    private int codRegion;
    private String nombreRegion;

    public Region() {
    }

    public Region(int codRegion, String nombreRegion) {
        this.codRegion = codRegion;
        this.nombreRegion = nombreRegion;
    }

    public int getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(int codRegion) {
        this.codRegion = codRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    @Override
    public String toString() {
        return nombreRegion;
    }

    public Vector<Region> cargaComboRegiones() {

        String sql = "select cod_region, nombre_region from region";

        Vector<Region> datos = new Vector<>();
        Region data = null;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            data = new Region();
            data.setCodRegion(0);
            data.setNombreRegion("Seleccione Region");
            datos.add(data);
            
            while (rs.next()) {
                data = new Region();
                data.setCodRegion(rs.getInt("cod_region"));
                data.setNombreRegion(rs.getString("nombre_region"));
                datos.add(data);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al cargar el combo regiones");
        }
        
        return datos;
    }
    
}
