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
public class TipoPago {
    private int codigoTipoPago;
    private String tipoPago;
    private Pago pago;

    public TipoPago(int codigoTipoPago, String tipoPago, Pago pago) {
        this.codigoTipoPago = codigoTipoPago;
        this.tipoPago = tipoPago;
        this.pago = pago;
    }

    public int getCodigoTipoPago() {
        return codigoTipoPago;
    }

    public void setCodigoTipoPago(int codigoTipoPago) {
        this.codigoTipoPago = codigoTipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
    
}
