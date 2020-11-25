/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.util.ArrayList;
import modelo.Comuna;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cliente;

/**
 *
 * @author Francisco
 */
public class ComunaDAO {

    public static ArrayList<Comuna> listaComunas = listarComunas();

    public static ArrayList listarComunas() {
        ArrayList lista = new ArrayList<Cliente>();
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select cod_comuna, nombre_comuna, cod_ciudad from comuna");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                // Instanciamos el modelo -> Comuna.
                Comuna comu = new Comuna();

                comu.setCodComuna(rs.getInt("cod_comuna"));
                comu.setNombreComuna(rs.getString("nombre_comuna"));
                comu.setCodCiudad(rs.getInt("cod_ciudad"));

                lista.add(comu);
            }
            cn.close();
            pst.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error en la consulta Listar Comunas.");

        }

        return lista;
    }
    

}
