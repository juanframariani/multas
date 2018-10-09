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
public class EstadoDelActa {
    
    private String  descripcionEstadoActa;
    private String nombreEstadoActa;

    public EstadoDelActa() {
    }

    public EstadoDelActa(String descripcionEstadoActa, String nombreEstadoActa) {
        this.descripcionEstadoActa = descripcionEstadoActa;
        this.nombreEstadoActa = nombreEstadoActa;
    }

    public String getDescripcionEstadoActa() {
        return descripcionEstadoActa;
    }

    public void setDescripcionEstadoActa(String descripcionEstadoActa) {
        this.descripcionEstadoActa = descripcionEstadoActa;
    }

    public String getNombreEstadoActa() {
        return nombreEstadoActa;
    }

    public void setNombreEstadoActa(String nombreEstadoActa) {
        this.nombreEstadoActa = nombreEstadoActa;
    }
    
    
}
