/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmultamariani;

/**
 *
 * @author sanfra
 */
public class Provincia {
    
    private String nombreProvincia;
    private Pais pais;

    public Provincia() {
    }

    public Provincia(String nombreProvincia, Pais pais) {
        this.nombreProvincia = nombreProvincia;
        this.pais = pais;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
    
    public String deQuePais(){
        return null;
        
    }
}
