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
public class ExamenMultaMariani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ActaDeConstatacion acta1 = new ActaDeConstatacion();
        AutoridadDeConstatacion autoridad1 = new AutoridadDeConstatacion();
        Vehiculo auto1 = new Vehiculo();
        Licencias lic1 = new Licencias();
        Ruta ruta1 = new Ruta();
        OrganizacionEstatal org1 = new OrganizacionEstatal();
        Localidad loc1 = new Localidad();
        Conductor cond1 = new Conductor();
        Marca marca1 = new Marca();
        Modelo mod1 = new Modelo();
        
        acta1.setNroActa(666);
        acta1.setFechaDeLabradoActa(LocalDate.now());
        
        auto1.setDominio("AB 808 BA");
        auto1.setColor("Rojo");
        auto1.setMarca(marca1);
        auto1.getMarca().setModelo(mod1);
        auto1.getMarca().getModelo().setModeloAuto("Ford Fiesta");
        
       
        lic1.setIdLicencia(31286526);
        
        ruta1.setNombreRuta("RN7");
        ruta1.setKmRuta(9);
        
        org1.setNombreOrganizacion("Policia Federal");
        
        cond1.setNombre("Jose");
        cond1.setApellido("Perez");
        cond1.setDomicilio("Parana 640");
        
        autoridad1.setIdPlaca(954973);
        autoridad1.setNombre("Comisario Estevez");
        
        System.out.println("ACTA DE CONSTATACION DE INFRACCION DE TRANSITO");
        System.out.println("Numero de acta: " + acta1.getNroActa());
        System.out.println("Fecha: " + acta1.getFechaDeLabradoActa());
        System.out.println("Datos del Vehiculo - Dominio: " + auto1.getDominio() + ", Modelo: " + auto1.getMarca().getModelo().getModeloAuto() + " , Color: " + auto1.getColor());
        System.out.println("Licencia Infractor: " + lic1.getIdLicencia());
        System.out.println("Lugar de la Infraccion: " + ruta1.getNombreRuta() + " - KM: " + ruta1.getKmRuta());
        System.out.println("Entidad Emisora: " + org1.getNombreOrganizacion());
        System.out.println("Datos del Conductor - Nombre: " + cond1.getNombre() + ", Apellido: " + cond1.getApellido());
        System.out.println("Direccion: " + cond1.getDomicilio());
        System.out.println("Cantidad de Infracciones Cometidas: " + lic1.cantidadDeInfracciones());
        System.out.println("Datos Autoridad - Nro Placa: " + autoridad1.getIdPlaca() + ", Nombre: " + autoridad1.getNombre() );
        
        }
    
}
