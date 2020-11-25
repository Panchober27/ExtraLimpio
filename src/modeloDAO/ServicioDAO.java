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
import modelo.Servicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class ServicioDAO {

    // Variable ArrayList Para los sericios.
    ArrayList<Servicio> listaServicios = listarServicios();

    /**
     *
     * @return Listado de Servicios.
     */
    public static ArrayList listarServicios() {
        String sql = ""; // Consulta a la base de datos.
        ArrayList lista = new ArrayList<Servicio>();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Servicio ser = new Servicio();
                
                ser.setCodServicio(rs.getInt("cod_servicio"));
                ser.setNombreServicio(rs.getString("nombre_servicio"));
                ser.setDescripcion(rs.getString("descripcion"));
                ser.setPrecio(rs.getInt("precio"));
                ser.setDias(rs.getInt("dias"));
                
                lista.add(ser);
            }
            cn.close();
            pst.close();
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar metodo ServicioDAO.listarServicios();", "Error Consulta ListarServicios", JOptionPane.WARNING_MESSAGE);
        }
        return lista;
    }

}
