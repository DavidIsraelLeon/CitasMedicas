/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.controlador;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ups.modelo.CitaMedica;

/**
 *
 * @author Esteban
 */
public class ControladorCitaMedicaTest {
    
    public ControladorCitaMedicaTest() {
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
     * Test of crear method, of class ControladorCitaMedica.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        CitaMedica citaMedica = null;
        ControladorCitaMedica instance = new ControladorCitaMedica();
        instance.crear(citaMedica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ControladorCitaMedica.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int codigo = 0;
        ControladorCitaMedica instance = new ControladorCitaMedica();
        CitaMedica expResult = null;
        CitaMedica result = instance.buscar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ControladorCitaMedica.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int codigo = 0;
        ControladorCitaMedica instance = new ControladorCitaMedica();
        boolean expResult = false;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCitaMedicaList method, of class ControladorCitaMedica.
     */
    @Test
    public void testGetCitaMedicaList() {
        System.out.println("getCitaMedicaList");
        ControladorCitaMedica instance = new ControladorCitaMedica();
        List<CitaMedica> expResult = null;
        List<CitaMedica> result = instance.getCitaMedicaList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
