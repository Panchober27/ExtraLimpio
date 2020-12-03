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
public class Region {
    
    private int codRegion;
    private String nombreRegion;

    public Region() {
    }

    public Region(int codRegion, String nombreRegion) {
        this.codRegion = codRegion;
        this.nombreRegion = nombreRegion;
    }

    public int getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(int codRegion) {
        this.codRegion = codRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    @Override
    public String toString() {
        return codRegion + " " +  nombreRegion;
    }

    
    
}
