/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmultamariani;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sanfra
 */
public class ActaDeConstatacion {
    
    private ArrayList<Infraccion> infraccion = new ArrayList();
    private LocalDate fechaDeLabradoActa;
    private LocalDate fechaVtoPagoVoluntario;
    private LocalDate horaDeLabrado;
    private Ruta lugarDeConstatacion;
    private int nroActa;
    private String observaciones;
    private Vehiculo vehiculo;
    private EstadoDelActa etadoDelActa;
    private AutoridadDeConstatacion autoridadDeConstatacion;
    private Licencias licencia;

    public ActaDeConstatacion() {
    }

    public ActaDeConstatacion(LocalDate fechaDeLabradoActa, LocalDate fechaVtoPagoVoluntario, LocalDate horaDeLabrado, Ruta lugarDeConstatacion, int nroActa, String observaciones, Vehiculo vehiculo, EstadoDelActa etadoDelActa, AutoridadDeConstatacion autoridadDeConstatacion, Licencias licencia) {
        this.fechaDeLabradoActa = fechaDeLabradoActa;
        this.fechaVtoPagoVoluntario = fechaVtoPagoVoluntario;
        this.horaDeLabrado = horaDeLabrado;
        this.lugarDeConstatacion = lugarDeConstatacion;
        this.nroActa = nroActa;
        this.observaciones = observaciones;
        this.vehiculo = vehiculo;
        this.etadoDelActa = etadoDelActa;
        this.autoridadDeConstatacion = autoridadDeConstatacion;
        this.licencia = licencia;
    }

    public ArrayList<Infraccion> getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(ArrayList<Infraccion> infraccion) {
        this.infraccion = infraccion;
    }

    public LocalDate getFechaDeLabradoActa() {
        return fechaDeLabradoActa;
    }

    public void setFechaDeLabradoActa(LocalDate fechaDeLabradoActa) {
        this.fechaDeLabradoActa = fechaDeLabradoActa;
    }

    public LocalDate getFechaVtoPagoVoluntario() {
        return fechaVtoPagoVoluntario;
    }

    public void setFechaVtoPagoVoluntario(LocalDate fechaVtoPagoVoluntario) {
        this.fechaVtoPagoVoluntario = fechaVtoPagoVoluntario;
    }

    public LocalDate getHoraDeLabrado() {
        return horaDeLabrado;
    }

    public void setHoraDeLabrado(LocalDate horaDeLabrado) {
        this.horaDeLabrado = horaDeLabrado;
    }

    public Ruta getLugarDeConstatacion() {
        return lugarDeConstatacion;
    }

    public void setLugarDeConstatacion(Ruta lugarDeConstatacion) {
        this.lugarDeConstatacion = lugarDeConstatacion;
    }

    public int getNroActa() {
        return nroActa;
    }

    public void setNroActa(int nroActa) {
        this.nroActa = nroActa;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public EstadoDelActa getEtadoDelActa() {
        return etadoDelActa;
    }

    public void setEtadoDelActa(EstadoDelActa etadoDelActa) {
        this.etadoDelActa = etadoDelActa;
    }

    public AutoridadDeConstatacion getAutoridadDeConstatacion() {
        return autoridadDeConstatacion;
    }

    public void setAutoridadDeConstatacion(AutoridadDeConstatacion autoridadDeConstatacion) {
        this.autoridadDeConstatacion = autoridadDeConstatacion;
    }

    public Licencias getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencias licencia) {
        this.licencia = licencia;
    }
    
    
    
    public boolean descuentoTotalPorPagoAnticipado(){
        return false;
    }
    
    public String infoActaConstatacion(){
        return null;
    }
    
    public String queInfraccionesCometio(){
        return null;
    }
    
    public int descuentoTotalPuntosLicencia(){
        return 0;
    }
}
