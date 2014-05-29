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
public class CalculadoraControllerTest {
    
    public CalculadoraControllerTest() {
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
     * Test of addOperand method, of class CalculadoraController.
     */
    @Test
    public void testAddOperand() {
        System.out.println("addOperand");
        double operand = 0.0;
        CalculadoraController instance = new CalculadoraController();
        instance.addOperand(operand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CalculadoraController.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        CalculadoraController instance = new CalculadoraController();
        double expResult = 0.0;
        double result = instance.add();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class CalculadoraController.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        CalculadoraController instance = new CalculadoraController();
        double expResult = 0.0;
        double result = instance.substract();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class CalculadoraController.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        CalculadoraController instance = new CalculadoraController();
        double expResult = 0.0;
        double result = instance.multiply();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class CalculadoraController.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        CalculadoraController instance = new CalculadoraController();
        double expResult = 0.0;
        double result = instance.division();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class CalculadoraController.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        CalculadoraController instance = new CalculadoraController();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
