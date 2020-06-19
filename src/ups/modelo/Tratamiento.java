/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;

import java.util.List;

/**
 *
 * @author dilgg
 */
public class Tratamiento {
    private int codigoTratamiento;
    private String nombreTratamientol;
    private List<String> mostrarTratamiento;

    public Tratamiento(int codigoTratamiento, String nombreTratamientol, List<String> mostrarTratamiento) {
        this.codigoTratamiento = codigoTratamiento;
        this.nombreTratamientol = nombreTratamientol;
        this.mostrarTratamiento = mostrarTratamiento;
    }

    public int getCodigoTratamiento() {
        return codigoTratamiento;
    }

    public void setCodigoTratamiento(int codigoTratamiento) {
        this.codigoTratamiento = codigoTratamiento;
    }

    public String getNombreTratamientol() {
        return nombreTratamientol;
    }

    public void setNombreTratamientol(String nombreTratamientol) {
        this.nombreTratamientol = nombreTratamientol;
    }

    public List<String> getMostrarTratamiento() {
        return mostrarTratamiento;
    }

    public void setMostrarTratamiento(List<String> mostrarTratamiento) {
        this.mostrarTratamiento = mostrarTratamiento;
    }
    
}
