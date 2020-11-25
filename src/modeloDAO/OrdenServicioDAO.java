/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import modelo.OrdenServicio;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class OrdenServicioDAO {

    public static ArrayList<OrdenServicio> listaOrdenes = listarOrdenesServ();

    public static ArrayList listarOrdenesServ() {
        String sql = "select cod_ordservicio, descripcion, precio_total, "
                + "fecha_inicio, fecha_entrega, id_vendedor, id_cliente, "
                + "codigo_estado_ord from orden_servicio";
        ArrayList lista = new ArrayList<OrdenServicio>();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                OrdenServicio orden = new OrdenServicio();

                orden.setCodOrdServicio(rs.getInt("cod_ordservicio"));
                orden.setDescripcion(rs.getString("descripcion"));
                orden.setPrecioTotal(rs.getInt("precio_total"));
                orden.setFechaInicio(rs.getDate("fecha_inicio"));
                orden.setFechaEntrega(rs.getDate("fecha_entrega"));
                orden.setIdVendedor(rs.getInt("id_vendedor"));
                orden.setIdCliente(rs.getInt("id_cliente"));
                orden.setCodEstadoOrd(rs.getInt("codigo_estado_ord"));

                lista.add(orden);
            }
            cn.close();
            pst.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error listar Ordenes de Servicio", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
    
    /*
     * Ahora viene el metodo add Orden Servicio, este metodo sera programado por ahora, pero
     * en el futuro debe ser cambiado por un metodo y/o metodos de acuerdo a los requerimientos.
     * 
    */
    
    public static void addOrdenServicio(OrdenServicio ord){
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareCall(
                    "insert into......."); // Terminar esta consulta SQL.
            
            pst.setString(1, ord.getDescripcion());
            pst.setString(2, ord.getFechaInicio().toString());
            /*
             * Estos insert a un Objeto deben de ser copiados desde las tablas de las interfaces
             * donde se almacenaran distintos objetos, antes de enviarlos a los DAO y
             * posteriormente a la base de datos.
            */
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Eror Añadir Orden en DAO"
            , JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    
    
    
}
