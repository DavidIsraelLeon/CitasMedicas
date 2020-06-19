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
public abstract class HistoriaClinica  {
    
    private int codigoHistoria;

    public HistoriaClinica(int codigoHistoria) {
        this.codigoHistoria = codigoHistoria;
    }

    public int getCodigoHistoria() {
        return codigoHistoria;
    }

    public void setCodigoHistoria(int codigoHistoria) {
        this.codigoHistoria = codigoHistoria;
    }
    
}
