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
import ups.modelo.Doctor;
import ups.modelo.DoctorEspecialidad;

/**
 *
 * @author Esteban
 */
public class ControladorDoctorTest {
    
    public ControladorDoctorTest() {
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
     * Test of crear method, of class ControladorDoctor.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Doctor m = null;
        int persona = 0;
        DoctorEspecialidad dr = null;
        ControladorDoctor instance = new ControladorDoctor();
        instance.crear(m, persona, dr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esDoctor method, of class ControladorDoctor.
     */
    @Test
    public void testEsDoctor() {
        System.out.println("esDoctor");
        String cedula = "";
        String clave = "";
        ControladorDoctor instance = new ControladorDoctor();
        String expResult = "";
        String result = instance.esDoctor(cedula, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
