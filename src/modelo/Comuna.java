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
public class Comuna {
    
    private int codComuna;
    private String nombreComuna;
    private int codCiudad;

    public Comuna() {
    }

    public Comuna(int codComuna, String nombreComuna, int codCiudad) {
        this.codComuna = codComuna;
        this.nombreComuna = nombreComuna;
        this.codCiudad = codCiudad;
    }

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    @Override
    public String toString() {
        return nombreComuna;
    }
    
    
    public Vector<Comuna> cargaComboComunas(int codCiudad) {

        String sql = "select cod_comuna, nombre_comuna from comuna where cod_ciudad = '" + codCiudad + "'";

        Vector<Comuna> datos = new Vector<>();
        Comuna data = null;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            data = new Comuna();
            data.setCodComuna(0);
            data.setNombreComuna("Seleccione la Comuna");
            datos.add(data);
            
            while (rs.next()) {
                data = new Comuna();
                data.setCodComuna(rs.getInt("cod_comuna"));
                data.setNombreComuna(rs.getString("nombre_comuna"));
                datos.add(data);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al cargar el combo Comunas");
        }
        
        return datos;
    }
    
    
}
