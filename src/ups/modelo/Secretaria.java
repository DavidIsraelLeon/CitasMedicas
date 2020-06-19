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
public class Secretaria extends Persona{
    
    private int codigoSecre;

    public Secretaria() {
    }

    public Secretaria(int codigoPer, String cedulaPer, String nombrePer, String apellidPer, String fechaNacimientoPer, String telefonoPer, String direccionPer) {
        super(codigoPer, cedulaPer, nombrePer, apellidPer, fechaNacimientoPer, telefonoPer, direccionPer);
    }

   
    
    public int getCodigoSecre() {
        return codigoSecre;
    }

    public void setCodigoSecre(int codigoSecre) {
        this.codigoSecre = codigoSecre;
    }

    @Override
    public String toString() {
        return "Secretaria{" + "codigoSecre=" + codigoSecre + '}';
    }
    
    
    
    
}
