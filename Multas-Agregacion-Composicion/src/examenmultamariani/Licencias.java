/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmultamariani;

import java.time.LocalDate;

/**
 *
 * @author sanfra
 */
public class Licencias {
    
    private int idLicencia;
    private LocalDate fechaDeVto;
    private int puntosInicialesLicencia;
    private Conductor conductor;
    private OrganizacionEstatal organizacionEstatal;

    public Licencias() {
    }

    public Licencias(int idLicencia, LocalDate fechaDeVto, int puntosInicialesLicencia, Conductor conductor, OrganizacionEstatal organizacionEstatal) {
        this.idLicencia = idLicencia;
        this.fechaDeVto = fechaDeVto;
        this.puntosInicialesLicencia = puntosInicialesLicencia;
        this.conductor = conductor;
        this.organizacionEstatal = organizacionEstatal;
    }

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public LocalDate getFechaDeVto() {
        return fechaDeVto;
    }

    public void setFechaDeVto(LocalDate fechaDeVto) {
        this.fechaDeVto = fechaDeVto;
    }

    public int getPuntosInicialesLicencia() {
        return puntosInicialesLicencia;
    }

    public void setPuntosInicialesLicencia(int puntosInicialesLicencia) {
        this.puntosInicialesLicencia = puntosInicialesLicencia;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public OrganizacionEstatal getOrganizacionEstatal() {
        return organizacionEstatal;
    }

    public void setOrganizacionEstatal(OrganizacionEstatal organizacionEstatal) {
        this.organizacionEstatal = organizacionEstatal;
    }
    
    
    
    public int setPuntosIniciales(){
        return 0;
    
    }
    
    public void addCantidadDeInfracciones(){
    
    }
    
    public int cantidadDeInfracciones(){
        return 5;
    }
    
}
