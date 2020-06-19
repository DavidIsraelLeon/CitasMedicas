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
public class FacturaDetalle {
    private int codigo;
    private String descripDetalle;
    private int cantidad;
    private ConsultaMedica codConsul;
    private double total;
    private FacturaCabecera codFactura;
    
    
    public FacturaDetalle() {
    }

    public FacturaDetalle(int codigo, String descripDetalle, int cantidad, ConsultaMedica codConsul, double total, FacturaCabecera codFactura) {
        this.codigo = codigo;
        this.descripDetalle = descripDetalle;
        this.cantidad = cantidad;
        this.codConsul = codConsul;
        this.total = total;
        this.codFactura = codFactura;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripDetalle() {
        return descripDetalle;
    }

    public void setDescripDetalle(String descripDetalle) {
        this.descripDetalle = descripDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ConsultaMedica getCodConsul() {
        return codConsul;
    }

    public void setCodConsul(ConsultaMedica codConsul) {
        this.codConsul = codConsul;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public FacturaCabecera getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(FacturaCabecera codFactura) {
        this.codFactura = codFactura;
    }
    

    
}
