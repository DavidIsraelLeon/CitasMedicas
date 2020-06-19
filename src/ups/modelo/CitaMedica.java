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
public class CitaMedica {
    private int codigoCita;
    private Date fechaCita;
    private Date horaCita;
    private String movitCita;
    private Paciente paciente;
    private Doctor doctor;

    public CitaMedica(int codigoCita, Date fechaCita, Date horaCita, String movitCita, Paciente paciente, Doctor doctor) {
        this.codigoCita = codigoCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.movitCita = movitCita;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public int getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(int codigoCita) {
        this.codigoCita = codigoCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Date getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Date horaCita) {
        this.horaCita = horaCita;
    }

    public String getMovitCita() {
        return movitCita;
    }

    public void setMovitCita(String movitCita) {
        this.movitCita = movitCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
}
