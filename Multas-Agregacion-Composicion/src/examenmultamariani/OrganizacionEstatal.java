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
public class OrganizacionEstatal {
    
    private String nombreOrganizacion;
    private Localidad localidad;

    public OrganizacionEstatal() {
    }

    public OrganizacionEstatal(String nombreOrganizacion, Localidad localidad) {
        this.nombreOrganizacion = nombreOrganizacion;
        this.localidad = localidad;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    
    
    
}
