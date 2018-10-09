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
public class Localidad {
    
    private String nombreDeLocalidad;
    private Provincia provincia;

    public Localidad() {
    }

    public Localidad(String nombreDeLocalidad, Provincia provincia) {
        this.nombreDeLocalidad = nombreDeLocalidad;
        this.provincia = provincia;
    }

    public String getNombreDeLocalidad() {
        return nombreDeLocalidad;
    }

    public void setNombreDeLocalidad(String nombreDeLocalidad) {
        this.nombreDeLocalidad = nombreDeLocalidad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    
    public String deQueProvincia(){
        return null;
    }
}
