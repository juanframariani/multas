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
public class TipoDeInfraccion {
    
    private int idInfrac;
    private String descripcionInfraccion;
    private String tipoGravedad;
    private double importeAsignadoInfraccion;
    private double porcentajeDescuento;

    public TipoDeInfraccion() {
    }

    public TipoDeInfraccion(int idInfrac, String descripcionInfraccion, String tipoGravedad, double importeAsignadoInfraccion, double porcentajeDescuento) {
        this.idInfrac = idInfrac;
        this.descripcionInfraccion = descripcionInfraccion;
        this.tipoGravedad = tipoGravedad;
        this.importeAsignadoInfraccion = importeAsignadoInfraccion;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getIdInfrac() {
        return idInfrac;
    }

    public void setIdInfrac(int idInfrac) {
        this.idInfrac = idInfrac;
    }

    public String getDescripcionInfraccion() {
        return descripcionInfraccion;
    }

    public void setDescripcionInfraccion(String descripcionInfraccion) {
        this.descripcionInfraccion = descripcionInfraccion;
    }

    public String getTipoGravedad() {
        return tipoGravedad;
    }

    public void setTipoGravedad(String tipoGravedad) {
        this.tipoGravedad = tipoGravedad;
    }

    public double getImporteAsignadoInfraccion() {
        return importeAsignadoInfraccion;
    }

    public void setImporteAsignadoInfraccion(double importeAsignadoInfraccion) {
        this.importeAsignadoInfraccion = importeAsignadoInfraccion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    
    
    public double descuentoDePuntosPorTipo(){
        return 0;
    }
    
    public double descuentoPorPagoVoluntario(){
        return 0;
    }
    
    private String infoTipoInfraccion(){
        return null;
    }
}
