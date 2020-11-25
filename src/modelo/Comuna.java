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
public class Comuna {
    
    private int codComuna;
    private String nombreComuna;
    private int codCiudad;

    public Comuna() {
    }

    public Comuna(int codComuna, String nombreComuna, int codCiudad) {
        this.codComuna = codComuna;
        this.nombreComuna = nombreComuna;
        this.codCiudad = codCiudad;
    }

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    @Override
    public String toString() {
        return nombreComuna;
    }
    
    
    
    
    
}
