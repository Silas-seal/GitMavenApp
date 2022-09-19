/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.reost.silas.git.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Silas
 */
public class SampleTest {
    
    public SampleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Sample.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double a = 7.0;
        double b = 7.0;
        Sample instance = new Sample();
        double expResult = 14.0;
        double result = instance.add(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Sample.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 4.0;
        double b = 3.0;
        Sample instance = new Sample();
        double expResult = 12.0;
        double result = instance.multiply(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
