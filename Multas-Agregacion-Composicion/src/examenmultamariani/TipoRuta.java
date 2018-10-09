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
public class TipoRuta {
    
    private String descTipoRuta;
    private String nombreTipoRuta;

    public TipoRuta() {
    }

    public TipoRuta(String descTipoRuta, String nombreTipoRuta) {
        this.descTipoRuta = descTipoRuta;
        this.nombreTipoRuta = nombreTipoRuta;
    }

    public String getDescTipoRuta() {
        return descTipoRuta;
    }

    public void setDescTipoRuta(String descTipoRuta) {
        this.descTipoRuta = descTipoRuta;
    }

    public String getNombreTipoRuta() {
        return nombreTipoRuta;
    }

    public void setNombreTipoRuta(String nombreTipoRuta) {
        this.nombreTipoRuta = nombreTipoRuta;
    }
    
    
    
    public boolean esInternacional(){
        return false;
    }
    
    public boolean esNacional(){
        return false;
    }
    
    public boolean esProvincial(){
        return false;
    }
}
