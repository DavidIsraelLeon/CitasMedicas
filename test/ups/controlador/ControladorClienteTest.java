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

/**
 *
 * @author Esteban
 */
public class ControladorClienteTest {
    
    public ControladorClienteTest() {
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
     * Test of esCliente method, of class ControladorCliente.
     */
    @Test
    public void testEsCliente() {
        System.out.println("esCliente");
        String cedula = "";
        String clave = "";
        ControladorCliente instance = new ControladorCliente();
        String expResult = "";
        String result = instance.esCliente(cedula, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
