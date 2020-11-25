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
public class Boleta {
    
    private int codBoleta;
    private int neto;
    private int iva;
    private int total;
    private int codOrdServicio;
    private int codPago;

    public Boleta() {
    }

    public Boleta(int codBoleta, int neto, int iva, int total, int codOrdServicio, int codPago) {
        this.codBoleta = codBoleta;
        this.neto = neto;
        this.iva = iva;
        this.total = total;
        this.codOrdServicio = codOrdServicio;
        this.codPago = codPago;
    }

    public int getCodBoleta() {
        return codBoleta;
    }

    public void setCodBoleta(int codBoleta) {
        this.codBoleta = codBoleta;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCodOrdServicio() {
        return codOrdServicio;
    }

    public void setCodOrdServicio(int codOrdServicio) {
        this.codOrdServicio = codOrdServicio;
    }

    public int getCodPago() {
        return codPago;
    }

    public void setCodPago(int codPago) {
        this.codPago = codPago;
    }
    
    
    
    
}
