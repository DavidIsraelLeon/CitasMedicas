/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;

/**
 *
 * @author dilgg
 */
public class DoctorEspecialidad {
    private int codigoDocEspeci;
    private Especialidad especialidad;

    public DoctorEspecialidad(int codigoDocEspeci, Especialidad especialidad) {
        this.codigoDocEspeci = codigoDocEspeci;
        this.especialidad = especialidad;
    }

    public int getCodigoDocEspeci() {
        return codigoDocEspeci;
    }

    public void setCodigoDocEspeci(int codigoDocEspeci) {
        this.codigoDocEspeci = codigoDocEspeci;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
