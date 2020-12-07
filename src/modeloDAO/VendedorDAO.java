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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Vendedor;
import static modeloDAO.ClienteDAO.listaClientes;

/*
 * SE DEBEN CAMBIAR LAS CONSULTAS DE TODAS LAS VARIABLES SQL!!!!!
 */
/**
 * Clase que contiene validaciones conectadas a la base de datos para realizar
 * el inicio de sesion del vendedor y traer los datos que se desplegaran como
 * credencialesVendedor.
 *
 * @author Francisco
 */
public class VendedorDAO {

    public boolean x;
    public int banderaUserName;
    public int y;
    public String username; // Almacena el nom_usuario para registrarlo en los cambios a bd.
    String nombres;
    String apellidoPat;
    String rut;

    /**
     * Metodo que realiza el proceso de logeo al sistema, utilizando como
     * credenciales el username y la password de los Vendedores desde la Base de
     * Datos.
     *
     * @param user: String que recibe el nombre de usuario ingresado por el
     * vendedor en la interfaz.
     * @param password: String que recibe la password ingresado por el vendedor
     * en la interfaz.
     * @return true: Si existe un Vendedor en la base de datos que tenga ese
     * username y password false: Si NO existe un vendedor en la base de datos
     * que tenga esas credenciales.
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

    public static boolean checkVendedor(String rut) {
        String sql = "select * from Vendedor where rut_vendedor = '" + rut + "'";
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

    /**
     * Metodo que trae una cadena de caracteres designados por el equipo de
     * trabajo como las credenciales de los Vendedores.
     *
     * @param username: recibe el username ingresado en la interfaz
     * @return una String que contiene los atributos seleccionados como
     * credenciales del usuario(vendedor).
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

    /**
     * Metodo que retorna una lista de Vendedores que se encuentran registrados
     * en la base de datos.
     *
     * @return lista de Vendedores (Lista de Objetos.)
     */
    public static ArrayList listarVendedores() {
        String sql = "select id_vendedor, rut_vendedor, nombres, apellidoPat, apellidoMat, username, password,"
                + "direccion, email, telefono, cod_comuna, id_sucursal from vendedor";
        ArrayList listaVendedores = new ArrayList<Vendedor>();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Vendedor vend = new Vendedor();

                // Agregar cada item de los vendedores a la lista.
                vend.setIdVendedor(rs.getInt("id_vendedor"));
                vend.setRutVendedor(rs.getString("rut_vendedor"));
                vend.setNombres(rs.getString("nombres"));
                vend.setApellidoPat(rs.getString("apellidoPat"));
                vend.setApellidoMat(rs.getString("apellidoMat"));
                vend.setUsername(rs.getString("username"));
                vend.setPassword(rs.getString("password"));
                vend.setDireccion(rs.getString("direccion"));
                vend.setEmail(rs.getString("email"));
                vend.setTelefono(rs.getString("telefono"));
                vend.setCodComuna(rs.getInt("cod_comuna"));
                vend.setIdSucursal(rs.getInt("id_sucursal"));

                listaVendedores.add(vend);
            }
            cn.close();
            pst.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta Listar Vendedores\n"
                    + "error: " + e);
            JOptionPane.showMessageDialog(null, e,
                    "Error al Listar Vendedores", JOptionPane.ERROR_MESSAGE);
        }
        return listaVendedores;
    }

    /**
     * Metodo para ingresar un vendedor a la base de datos.
     *
     * @param ven
     */
    public static void addVendedor(Vendedor ven) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareCall(
                    "insert into vendedor"
                    + "(id_vendedor, rut_vendedor, nombres, apellidoPat, apellidoMat, "
                    + "username, password, "
                    + "direccion, email, telefono, cod_comuna, id_sucursal)"
                    + "values (null,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, ven.getRutVendedor());
            pst.setString(2, ven.getNombres());
            pst.setString(3, ven.getApellidoPat());
            pst.setString(4, ven.getApellidoMat());
            pst.setString(5, ven.getUsername());
            pst.setString(6, ven.getPassword());
            pst.setString(7, ven.getDireccion());
            pst.setString(8, ven.getEmail());
            pst.setString(9, ven.getTelefono());
            pst.setInt(10, ven.getCodComuna());
            pst.setInt(11, ven.getIdSucursal());

            pst.executeUpdate();

            cn.close();
            pst.close();
            JOptionPane.showMessageDialog(null, "Se ha registrado con exito\n"
                    + "esto se hizo en VendedorDAO");
        } catch (SQLException e) {
            System.out.println("Error al insertar un vendedor a la base de datos.");
            JOptionPane.showMessageDialog(null, "Error al insertar un vendedor a la base de datos",
                    "Error Añadir Vendedor a BD.", JOptionPane.ERROR_MESSAGE);
            System.out.println("error: " + e);
        }
    }

    /**
     * Metodo para realizar modificaciones a un Vendedor. en cuanto a las
     * modificaciones, estas seran reguladas desde la interfaz respectiva...
     *
     * desarrollar esto con mas elopcuencia mas tarde.
     */
    public void updateVendedor() {
    }

    /**
     * Metodo para eliminar un vendedor de la base de datos en base a su rut.
     * @param rutVend 
     */
    public void eliminarVendedor(String rutVend) {
        String sql = "delete * from vendedor where rut_vendedor='" + rutVend + "'";
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();

            cn.close();
            pst.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado los datos del vendedor con exito"
                    + "esto se hizo en VendedorDAO");
        } catch (SQLException e) {
            System.out.println("Error al eliminar un vendedor a la base de datos.");
            JOptionPane.showMessageDialog(null, "Error al eliminar un vendedor a la base de datos",
                    "Error eliminar Vendedor a BD.", JOptionPane.ERROR_MESSAGE);
            System.out.println("error: " + e);
        }
    }

}
