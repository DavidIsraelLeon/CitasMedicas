/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ups.bdconexion.BDConexion;
import ups.modelo.Persona;

/**
 *
 * @author dilgg
 */
public class ControladorPersona {
      
   private Connection connection;
    BDConexion c = new BDConexion();
    
    public void conectarBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/consultorio", "root", "");
            //connection = DriverManager.getConnection("jdbc:mysql://192.168.2.10:3306/facturacion", "root", "root");
            if (connection != null) {
                System.out.println(" CONEXION EXITOSA !!! ");
            }
        } catch (SQLException ex) {
            System.out.println(" erro de SQL" + ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crear(Persona p) {
        Connection con = null;
        String sql = "INSERT INTO persona(per_id, per_cedula, per_nombre, per_apellido, pre_direccion, per_telefono, per_fec_nacimiento, per_mail, per_contro)"
                        + " VALUES (?,?,?,?,?,?,?,?,?);";
        
        try {
            con = BDConexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCodigoPer());
            ps.setString(2, p.getCedulaPer());
            ps.setString(3, p.getNombrePer());
            ps.setString(4, p.getApellidPer());
            ps.setString(5, p.getDireccionPer());
            ps.setString(6, p.getTelefonoPer());
            ps.setString(7, p.getFechaNacimientoPer());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar persona");
            e.printStackTrace();
        } finally {
            BDConexion.close(con);
        }
    }
    
    public Persona buscar(int codigo) {
        conectarBD();
        Persona cli = new Persona();
        String sql = "SELECT * FROM persona WHERE per_id=" + codigo + ";";
        Statement sentencia;
        try {

            sentencia = connection.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                cli.setCodigoPer(rs.getInt("per_id"));
                cli.setCedulaPer(rs.getString("per_cedula"));
                cli.setNombrePer(rs.getString("per_nombre"));
                cli.setApellidPer(rs.getString("per_apellido"));
                cli.setDireccionPer(rs.getString("pre_direccion"));
                cli.setTelefonoPer(rs.getString("per_telefono"));
                cli.setFechaNacimientoPer(rs.getString("per_fec_nacimiento"));
            }

        } catch (SQLException ex) {
        }

        return cli;

    }
    
    /*public List<Persona> buscarMedico(String cedula) {
        List<Persona> Person = new ArrayList<>();
        String sql = "SELECT pe.per_cedula, pe.per_nombre, pe.per_apellido "
                + "FROM Persona pe, medico me where pe.per_cedula=? && pe.per_id=me.Persona_per_id";
        Connection con = null;
        try {
            con = conectar.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cedula);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Persona p = new Persona();
                Medico m = new Medico();
                p.setPerCedula(rs.getString("per_cedula").trim());
                p.setPerNombre(rs.getString("per_nombre").trim());
                p.setPerApellido(rs.getString("per_apellido"));
                m.setMedEspecialidad(rs.getString("med_especialidad"));
                Person.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar medico");
            e.printStackTrace();
        } finally {
            conectar.close(con);
        }
        return Person;
    }*/
     
    /*public Persona buscarCedula(String cedula) {
        conectarBD();
        Persona per = new Persona();
        Medico med = new Medico();
        //String sql = "SELECT per_cedula, per_nombre, per_apellido, pre_direccion, per_telefono, per_fec_nacimiento, per_mail, per_contro FROM persona WHERE per_cedula='" + cedula + "';";    
        //String sql = "SELECT pe.per_cedula, pe.per_nombre, pe.per_apellido, me.med_especialidad "
          //      + "FROM persona pe, medico me where pe.per_cedula='" + cedula + "' AND pe.per_id=me.Persona_per_id";
        Statement sentencia;
        try {
            sentencia = connection.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                //per.setPerId(rs.getInt("per_id"));
                per.setPerCedula(rs.getString("per_cedula"));
                per.setPerNombre(rs.getString("per_nombre"));
                per.setPerApellido(rs.getString("per_apellido"));
                per.setPreDireccion(rs.getString("pre_direccion"));
                per.setPerTelefono(rs.getString("per_telefono"));
                per.setPerFecNacimiento(rs.getString("per_fec_nacimiento"));
                per.setPerMail(rs.getString("per_mail"));
                per.setPerContro(rs.getString("per_contro"));
                //med.setMedEspecialidad(rs.getString("med_especialidad"));
            }
        } catch (SQLException ex) {
            //System.out.println("Error de SQL" + ex);
        }
        return per;
    }*/
    
    public void actualizar(Persona nueva, String codigo) {
        conectarBD();
        String sql = "UPDATE persona SET per_cedula=?, per_nombre=?, per_apellido=?, pre_direccion=?, per_telefono=?, per_fec_nacimiento=?, per_mail=?, per_contro=?"
                + " WHERE per_cedula='" + codigo + "'";

        try {
            //  Statement sentencia = conexion.createStatement();
            PreparedStatement resultado = connection.prepareStatement(sql);

            resultado.setString(1, nueva.getCedulaPer());
            resultado.setString(2, nueva.getNombrePer());
            resultado.setString(3, nueva.getApellidPer());
            resultado.setString(4, nueva.getDireccionPer());
            resultado.setString(5, nueva.getTelefonoPer());
            resultado.setString(6, nueva.getFechaNacimientoPer());
            resultado.executeUpdate();

        } catch (SQLException ex) {
        }
    }
    
    
    public String idPersona(String cedula, String clave) {
        String id = null;
        String sql = "SELECT per_id "
                + "FROM persona where per_cedula=? && per_contro=?";
        Connection con = null;
        try {
            con = BDConexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getString("per_id");
                return id;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar persona");
            e.printStackTrace();
        } finally {
            BDConexion.close(con);
        }
        return id;
    }

}

    

