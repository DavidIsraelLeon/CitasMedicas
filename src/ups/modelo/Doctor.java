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
public class Doctor extends Persona{
    
    private int codigoDoctor;
    private String doctorEspecialidad;
    private Persona persona;


    public Doctor() {
    }

    public Doctor(int codigoPer, String cedulaPer, String nombrePer, String apellidPer, String fechaNacimientoPer, String telefonoPer, String direccionPer) {
        super(codigoPer, cedulaPer, nombrePer, apellidPer, fechaNacimientoPer, telefonoPer, direccionPer);
    }

    public int getCodigoDoctor() {
        return codigoDoctor;
    }

    public void setCodigoDoctor(int codigoDoctor) {
        this.codigoDoctor = codigoDoctor;
    }

    public String getDoctorEspecialidad() {
        return doctorEspecialidad;
    }

    public void setDoctorEspecialidad(String doctorEspecialidad) {
        this.doctorEspecialidad = doctorEspecialidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
}
