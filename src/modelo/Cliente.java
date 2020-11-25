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
public class Cliente {
    
    private int idCliente;
    private String rutCliente;
    private String nombresCliente;
    private String apellidoPat;
    private String apellidoMat;
    private String direccion;
    private String email;
    private int codComuna;

    public Cliente() {
    }

    public Cliente(int idCliente, String rutCliente, String nombresCliente, String apellidoPat, String apellidoMat, String direccion, String email, int codComuna) {
        this.idCliente = idCliente;
        this.rutCliente = rutCliente;
        this.nombresCliente = nombresCliente;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.direccion = direccion;
        this.email = email;
        this.codComuna = codComuna;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }
    //Por Defecto
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }
    
    // Mio propio.
    public void setRutCliente(String rut, String dv){
        this.rutCliente = rut + "-" + dv;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
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

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
    }
    
    
    public String getIDString(){
        return Integer.toString(idCliente);
    }
    
    public String getCodComunaString(){
        return Integer.toString(codComuna);
    }
    
    
    
}
