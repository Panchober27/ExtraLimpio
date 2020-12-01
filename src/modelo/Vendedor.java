/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author franc
 */
public class Vendedor {
    
    private int idVendedor;
    private String rutVendedor;
    private String nombres;
    private String apellidoPat;
    private String apellidoMat;
    private String username;
    private String password;
    private String direccion;
    private String email;
    private String telefono;
    private int codComuna;
    private int idSucursal;

    public Vendedor() {
    }

    public Vendedor(int idVendedor, String rutVendedor, String nombres, String apellidoPat, String apellidoMat, String username, String password, String direccion, String email, String telefono, int codComuna, int idSucursal) {
        this.idVendedor = idVendedor;
        this.rutVendedor = rutVendedor;
        this.nombres = nombres;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.username = username;
        this.password = password;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.codComuna = codComuna;
        this.idSucursal = idSucursal;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getRutVendedor() {
        return rutVendedor;
    }

    public void setRutVendedor(String rutVendedor) {
        this.rutVendedor = rutVendedor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    
    
    
    
}
