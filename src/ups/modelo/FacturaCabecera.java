/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;


/**
 *
 * @author USUARIO
 */
public class FacturaCabecera {
    private int codigo;
    private String fecha;
    private double subtotal;
    private double iva;
    private double descuento;
    private double total;
    private Persona codPersona;

    public FacturaCabecera(int codigo, String fecha, double subtotal, double iva, double descuento, double total, Persona codPersona) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = iva;
        this.descuento = descuento;
        this.total = total;
        this.codPersona = codPersona;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Persona getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(Persona codPersona) {
        this.codPersona = codPersona;
    }
    
    

}