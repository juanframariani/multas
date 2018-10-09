/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmultamariani;

import java.util.Date;

/**
 *
 * @author sanfra
 */
public class Vehiculo {
    
    private String color;
    private String dominio;
    private Date anioPatentamiento = new Date();
    private Marca marca;

    public Vehiculo() {
    }

    public Vehiculo(String color, String dominio, Marca marca) {
        this.color = color;
        this.dominio = dominio;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public Date getAnioPatentamiento() {
        return anioPatentamiento;
    }

    public void setAnioPatentamiento(Date anioPatentamiento) {
        this.anioPatentamiento = anioPatentamiento;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
}
