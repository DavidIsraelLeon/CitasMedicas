/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.controlador;

import java.util.ArrayList;
import java.util.List;
import ups.modelo.CitaMedica;
import ups.modelo.Persona;

/**
 *
 * @author dilgg
 */
public class ControladorCitaMedica {
    private List<CitaMedica> citaMedicaList;

    public ControladorCitaMedica () {
        citaMedicaList = new ArrayList<>();
    }
    
    public void crear(CitaMedica citaMedica){
   citaMedicaList.add(citaMedica);
    }
    
    public CitaMedica buscar(int codigo){
    for (CitaMedica citaMedica: citaMedicaList){
        if(citaMedica.getCodigoCita()==codigo){
            return citaMedica;
        }
    }
    return null;
    }
    
     public boolean eliminar(int codigo) {
        CitaMedica citaMedica = buscar(codigo);
        if (citaMedica!= null) {
            return citaMedicaList.remove(citaMedica);
        }
        return false;
    }

    public List<CitaMedica> getCitaMedicaList() {
        return citaMedicaList;
    }

    
}
