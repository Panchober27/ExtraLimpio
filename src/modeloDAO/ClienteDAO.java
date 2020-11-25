/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.util.Scanner;

import java.util.ArrayList;
import modelo.Cliente;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class ClienteDAO {

    public static ArrayList<Cliente> listaClientes = listarClientes();

    /**
     * Metodo que trae una lista de los Clientes con sus atributos desde la Base
     * de Datos.
     *
     * @return Objeto ArrayList de los Clientes.
     */
    public static ArrayList listarClientes() {
        String sql = "select id_cliente, rut_cliente, nombres, apellidoPat, apellidoMat, direccion, email, cod_comuna from Cliente";
        ArrayList listaClientes = new ArrayList<Cliente>();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setIdCliente(rs.getInt("id_cliente"));
                cli.setRutCliente(rs.getString("rut_cliente"));
                cli.setNombresCliente(rs.getString("nombres"));
                cli.setApellidoPat(rs.getString("apellidoPat"));
                cli.setApellidoMat(rs.getString("apellidoMat"));
                cli.setDireccion(rs.getString("direccion"));
                cli.setEmail(rs.getString("email"));
                cli.setCodComuna(rs.getInt("cod_comuna"));

                listaClientes.add(cli);
            }
            cn.close();
            pst.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta Listar Clientes\n"
                    + "error: " + e);
            JOptionPane.showMessageDialog(null, e,
                    "Error al Listar Clientes",JOptionPane.ERROR_MESSAGE);

        }
        return listaClientes;
    }

    /**
     * Metodo que agrega un nuevo Cliente a la Base de Datos.
     *
     * @param cli Objeto de la clase cliente
     */
    public static void addCliente(Cliente cli) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareCall(
                    "insert into cliente"
                    + "(id_cliente, rut_cliente, nombres, apellidoPat, apellidoMat, "
                    + "direccion, email, cod_comuna)"
                    + "values (null,?,?,?,?,?,?,?)");
            pst.setString(1, cli.getRutCliente());
            pst.setString(2, cli.getNombresCliente());
            pst.setString(3, cli.getApellidoPat());
            pst.setString(4, cli.getApellidoMat());
            pst.setString(5, cli.getDireccion());
            pst.setString(6, cli.getEmail());
            pst.setInt(7, cli.getCodComuna());

            pst.executeUpdate();

            cn.close();
            pst.close();
            JOptionPane.showMessageDialog(null, "Se ha registrado con exito\n"
                    + "esto se hizo en ClienteDAO");
        } catch (SQLException e) {
            System.out.println("Error al insertar un cliente a la base de datos.");
            JOptionPane.showMessageDialog(null, "Error al insertar un cliente a la base de datos",
                    "Error Añadir Cliente a BD.", JOptionPane.ERROR_MESSAGE);
            System.out.println("error: " + e);
        }
    }

    /**
     * Metodo que revisa si existe Algun Cliente en la Base de Datos, en base al
     * rut.
     *
     * @param rut String que trae el rut ingresado por el usuario en la
     * interfaz.
     * @return true, si existe un cliente con ese rut y false, si no existe el
     * cliente.
     */
    public static boolean checkCliente(String rut) {
        String sql = "select * from Cliente where rut_cliente = '" + rut + "'";
        boolean x = false;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                x = true;
            } else {
                x = false;
            }
        } catch (Exception e) {
        }
        return x;
    }

}
