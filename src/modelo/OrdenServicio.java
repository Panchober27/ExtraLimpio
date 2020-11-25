/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Francisco
 */
public class OrdenServicio {
    
    private int codOrdServicio;
    private String descripcion;
    private int precioTotal;
    private Date fechaInicio;
    private Date fechaEntrega;
    private int idVendedor;
    private int idCliente;
    private int codEstadoOrd;

    public OrdenServicio() {
    }

    public OrdenServicio(int codOrdServicio, String descripcion, int precioTotal, Date fechaInicio, Date fechaEntrega, int idVendedor, int idCliente, int codEstadoOrd) {
        this.codOrdServicio = codOrdServicio;
        this.descripcion = descripcion;
        this.precioTotal = precioTotal;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.codEstadoOrd = codEstadoOrd;
    }

    public int getCodOrdServicio() {
        return codOrdServicio;
    }

    public void setCodOrdServicio(int codOrdServicio) {
        this.codOrdServicio = codOrdServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCodEstadoOrd() {
        return codEstadoOrd;
    }

    public void setCodEstadoOrd(int codEstadoOrd) {
        this.codEstadoOrd = codEstadoOrd;
    }
    
    
    
    
    
}
