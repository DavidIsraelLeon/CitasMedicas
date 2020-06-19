/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;

import java.util.Date;

/**
 *
 * @author dilgg
 */
public class Persona {
    private int codigoPer;
    private String cedulaPer;
    private String nombrePer;
    private String apellidPer;
    private String fechaNacimientoPer;
    private String telefonoPer;
    private String direccionPer;

    public Persona() {
    }

    public Persona(int codigoPer, String cedulaPer, String nombrePer, String apellidPer, String fechaNacimientoPer, String telefonoPer, String direccionPer) {
        this.codigoPer = codigoPer;
        this.cedulaPer = cedulaPer;
        this.nombrePer = nombrePer;
        this.apellidPer = apellidPer;
        this.fechaNacimientoPer = fechaNacimientoPer;
        this.telefonoPer = telefonoPer;
        this.direccionPer = direccionPer;
    }

    public int getCodigoPer() {
        return codigoPer;
    }

    public void setCodigoPer(int codigoPer) {
        this.codigoPer = codigoPer;
    }

    public String getCedulaPer() {
        return cedulaPer;
    }

    public void setCedulaPer(String cedulaPer) {
        this.cedulaPer = cedulaPer;
    }

    public String getNombrePer() {
        return nombrePer;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }

    public String getApellidPer() {
        return apellidPer;
    }

    public void setApellidPer(String apellidPer) {
        this.apellidPer = apellidPer;
    }

    public String getFechaNacimientoPer() {
        return fechaNacimientoPer;
    }

    public void setFechaNacimientoPer(String fechaNacimientoPer) {
        this.fechaNacimientoPer = fechaNacimientoPer;
    }

    public String getTelefonoPer() {
        return telefonoPer;
    }

    public void setTelefonoPer(String telefonoPer) {
        this.telefonoPer = telefonoPer;
    }

    public String getDireccionPer() {
        return direccionPer;
    }

    public void setDireccionPer(String direccionPer) {
        this.direccionPer = direccionPer;
    }
    

    
    
}
