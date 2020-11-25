/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Francisco
 */
public class Sucursal {
    
    private int idSucursal;
    private String direccion;
    private int codComuna;

    public Sucursal() {
    }

    public Sucursal(int idSucursal, String direccion, int codComuna) {
        this.idSucursal = idSucursal;
        this.direccion = direccion;
        this.codComuna = codComuna;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
    }
    
    
    
    
    
}
