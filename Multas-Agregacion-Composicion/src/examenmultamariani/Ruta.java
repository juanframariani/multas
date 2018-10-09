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
public class Ruta {
    
    private String nombreRuta;
    private int kmRuta;
    private TipoRuta tipoRuta;

    public Ruta() {
    }

    public Ruta(String nombreRuta, int kmRuta, TipoRuta tipoRuta) {
        this.nombreRuta = nombreRuta;
        this.kmRuta = kmRuta;
        this.tipoRuta = tipoRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public int getKmRuta() {
        return kmRuta;
    }

    public void setKmRuta(int kmRuta) {
        this.kmRuta = kmRuta;
    }

    public TipoRuta getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(TipoRuta tipoRuta) {
        this.tipoRuta = tipoRuta;
    }
    
    
    
}
