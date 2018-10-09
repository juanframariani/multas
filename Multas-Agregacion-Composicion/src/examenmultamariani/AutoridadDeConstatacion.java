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
public class AutoridadDeConstatacion extends Persona{
    
    private int idPlaca;
    private int idLegajo;
    private int cantidadActasLabradas;

    public AutoridadDeConstatacion() {
    }

    public AutoridadDeConstatacion(int idPlaca, int idLegajo, int cantidadActasLabradas) {
        this.idPlaca = idPlaca;
        this.idLegajo = idLegajo;
        this.cantidadActasLabradas = cantidadActasLabradas;
    }

    public int getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(int idPlaca) {
        this.idPlaca = idPlaca;
    }

    public int getIdLegajo() {
        return idLegajo;
    }

    public void setIdLegajo(int idLegajo) {
        this.idLegajo = idLegajo;
    }

    public int getCantidadActasLabradas() {
        return cantidadActasLabradas;
    }

    public void setCantidadActasLabradas(int cantidadActasLabradas) {
        this.cantidadActasLabradas = cantidadActasLabradas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    public int addDeActasLabradas(){
        return 0;
    
    }
}
