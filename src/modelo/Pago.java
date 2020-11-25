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
public class Pago {
    
    private int codPago;
    private int montoPago;
    private Date fechaPago;
    private int codTipoPago;

    public Pago() {
    }

    public Pago(int codPago, int montoPago, Date fechaPago, int codTipoPago) {
        this.codPago = codPago;
        this.montoPago = montoPago;
        this.fechaPago = fechaPago;
        this.codTipoPago = codTipoPago;
    }

    public int getCodPago() {
        return codPago;
    }

    public void setCodPago(int codPago) {
        this.codPago = codPago;
    }

    public int getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(int montoPago) {
        this.montoPago = montoPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getCodTipoPago() {
        return codTipoPago;
    }

    public void setCodTipoPago(int codTipoPago) {
        this.codTipoPago = codTipoPago;
    }
    
    
    
    
    
}
