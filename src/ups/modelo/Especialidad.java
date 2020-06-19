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
public class Especialidad {
    private int codigoEspecialidad;
    private String nombrEspecialidad;

    public Especialidad(int codigoEspecialidad, String nombrEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
        this.nombrEspecialidad = nombrEspecialidad;
    }

    public int getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(int codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getNombrEspecialidad() {
        return nombrEspecialidad;
    }

    public void setNombrEspecialidad(String nombrEspecialidad) {
        this.nombrEspecialidad = nombrEspecialidad;
    }
    
    
}
