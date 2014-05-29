/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package merca1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javiermatusevich
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    @Test
    public void testAddition() {
        // TODO review the generated test code and remove the default call to fail.
        Calculadora c = new Calculadora();
        Double t = c.add(1, 2);
        assertEquals(3, t, 0);
    }
    @Test
    public void testSubstraction() {
        Calculadora c = new Calculadora();
        assertEquals(1, c.substract(3, 2), 0);
    }
    @Test
    public void testInfiniteDivision() {
        Calculadora c = new Calculadora();
        assertEquals(c.division(1, 0), Double.POSITIVE_INFINITY, 0);
    }
}
