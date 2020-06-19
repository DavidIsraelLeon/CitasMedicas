/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ups.modelo.Persona;

/**
 *
 * @author Esteban
 */
public class ControladorPersonaTest {
    
    public ControladorPersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conectarBD method, of class ControladorPersona.
     */
    @Test
    public void testConectarBD() {
        System.out.println("conectarBD");
        ControladorPersona instance = new ControladorPersona();
        instance.conectarBD();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class ControladorPersona.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Persona p = null;
        ControladorPersona instance = new ControladorPersona();
        instance.crear(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ControladorPersona.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int codigo = 0;
        ControladorPersona instance = new ControladorPersona();
        Persona expResult = null;
        Persona result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ControladorPersona.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Persona nueva = null;
        String codigo = "";
        ControladorPersona instance = new ControladorPersona();
        instance.actualizar(nueva, codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of idPersona method, of class ControladorPersona.
     */
    @Test
    public void testIdPersona() {
        System.out.println("idPersona");
        String cedula = "";
        String clave = "";
        ControladorPersona instance = new ControladorPersona();
        String expResult = "";
        String result = instance.idPersona(cedula, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
