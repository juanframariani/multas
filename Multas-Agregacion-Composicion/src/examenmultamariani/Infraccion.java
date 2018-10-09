/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmultamariani;

import java.util.ArrayList;

/**
 *
 * @author sanfra
 */
public class Infraccion {
    
    private String descripInfraccion;
    private double importeInfraccion;
    private ArrayList<TipoDeInfraccion> tipoDeInfraccion = new ArrayList<>();

    public Infraccion() {
    }

    public Infraccion(String descripInfraccion, double importeInfraccion) {
        this.descripInfraccion = descripInfraccion;
        this.importeInfraccion = importeInfraccion;
    }

    public String getDescripInfraccion() {
        return descripInfraccion;
    }

    public void setDescripInfraccion(String descripInfraccion) {
        this.descripInfraccion = descripInfraccion;
    }

    public double getImporteInfraccion() {
        return importeInfraccion;
    }

    public void setImporteInfraccion(double importeInfraccion) {
        this.importeInfraccion = importeInfraccion;
    }

    public ArrayList<TipoDeInfraccion> getTipoDeInfraccion() {
        return tipoDeInfraccion;
    }

    public void setTipoDeInfraccion(ArrayList<TipoDeInfraccion> tipoDeInfraccion) {
        this.tipoDeInfraccion = tipoDeInfraccion;
    }
    
  
}
