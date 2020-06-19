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
public class Pago {
    private int codigoPago;
    private Date fechaPago;
    private String estadoPago;
    private Double valorPago;

    public Pago() {
    }
    
    

    public Pago(int codigoPago, Date fechaPago, String estadoPago, Double valorPago) {
        this.codigoPago = codigoPago;
        this.fechaPago = fechaPago;
        this.estadoPago = estadoPago;
        this.valorPago = valorPago;
    }

    public int getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(int codigoPago) {
        this.codigoPago = codigoPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
    
    
}
