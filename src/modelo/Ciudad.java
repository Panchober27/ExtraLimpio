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
public class Ciudad {
    
    private int codCiudad;
    private String nombreCiudad;
    private int codRegion;

    public Ciudad() {
    }

    public Ciudad(int codCiudad, String nombreCiudad, int codRegion) {
        this.codCiudad = codCiudad;
        this.nombreCiudad = nombreCiudad;
        this.codRegion = codRegion;
    }

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(int codRegion) {
        this.codRegion = codRegion;
    }
    
    
    
    
    
}
