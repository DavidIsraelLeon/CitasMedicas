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
public class Paciente extends Persona{
    private int codigoPacie;

    public Paciente() {
    }

    public Paciente(int codigoPer, String cedulaPer, String nombrePer, String apellidPer, String fechaNacimientoPer, String telefonoPer, String direccionPer) {
        super(codigoPer, cedulaPer, nombrePer, apellidPer, fechaNacimientoPer, telefonoPer, direccionPer);
    }

    

    public int getCodigoPacie() {
        return codigoPacie;
    }

    public void setCodigoPacie(int codigoPacie) {
        this.codigoPacie = codigoPacie;
    }
    
    
}
